.class public final Lb4/u;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:Lcom/zykj/board/EzyHeader$Author;

.field public i:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public j:Ljava/lang/Object;

.field public k:Ljava/util/List;

.field public l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public m:I

.field public n:I

.field public o:Lcom/zykj/board/EzyHeader$MoveConfig;

.field public p:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field public r:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

.field public t:Lcom/google/protobuf/SingleFieldBuilderV3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lb4/u;->j:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Lb4/u;->k:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->access$400()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lb4/u;->h()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lb4/u;->l()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lb4/u;->k()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lb4/u;->i()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lb4/u;->j()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method


# virtual methods
.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb4/u;->c()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lb4/u;->c()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lb4/u;->e()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lb4/u;->e()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/zykj/board/EzyHeader$Header;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb4/u;->e()Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Header;->isInitialized()Z

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
    invoke-virtual {p0}, Lb4/u;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0}, Lb4/u;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0}, Lb4/u;->f()V

    return-object p0
.end method

.method public final bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0}, Lb4/u;->f()V

    return-object p0
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/u;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/u;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/u;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/u;

    return-object v0
.end method

.method public final clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/u;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lb4/u;

    return-object v0
.end method

.method public final e()Lcom/zykj/board/EzyHeader$Header;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$Header;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyHeader$Header;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lb4/m;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lb4/u;->a:I

    .line 12
    .line 13
    and-int/lit16 v1, v1, 0x100

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 24
    .line 25
    iget v1, p0, Lb4/u;->a:I

    .line 26
    .line 27
    and-int/lit16 v1, v1, -0x101

    .line 28
    .line 29
    iput v1, p0, Lb4/u;->a:I

    .line 30
    .line 31
    :cond_0
    iget-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/zykj/board/EzyHeader$Header;->access$602(Lcom/zykj/board/EzyHeader$Header;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {v0, v1}, Lcom/zykj/board/EzyHeader$Header;->access$602(Lcom/zykj/board/EzyHeader$Header;Ljava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    :goto_0
    iget v1, p0, Lb4/u;->a:I

    .line 45
    .line 46
    if-eqz v1, :cond_13

    .line 47
    .line 48
    and-int/lit8 v2, v1, 0x1

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget v2, p0, Lb4/u;->b:I

    .line 53
    .line 54
    invoke-static {v0, v2}, Lcom/zykj/board/EzyHeader$Header;->access$702(Lcom/zykj/board/EzyHeader$Header;I)I

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
    iget v2, p0, Lb4/u;->c:I

    .line 62
    .line 63
    invoke-static {v0, v2}, Lcom/zykj/board/EzyHeader$Header;->access$802(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 64
    .line 65
    .line 66
    :cond_3
    and-int/lit8 v2, v1, 0x4

    .line 67
    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    iget v2, p0, Lb4/u;->d:I

    .line 71
    .line 72
    invoke-static {v0, v2}, Lcom/zykj/board/EzyHeader$Header;->access$902(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 73
    .line 74
    .line 75
    :cond_4
    and-int/lit8 v2, v1, 0x8

    .line 76
    .line 77
    if-eqz v2, :cond_5

    .line 78
    .line 79
    iget-wide v2, p0, Lb4/u;->e:J

    .line 80
    .line 81
    invoke-static {v0, v2, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1002(Lcom/zykj/board/EzyHeader$Header;J)J

    .line 82
    .line 83
    .line 84
    :cond_5
    and-int/lit8 v2, v1, 0x10

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    iget-wide v2, p0, Lb4/u;->f:J

    .line 89
    .line 90
    invoke-static {v0, v2, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1102(Lcom/zykj/board/EzyHeader$Header;J)J

    .line 91
    .line 92
    .line 93
    :cond_6
    and-int/lit8 v2, v1, 0x20

    .line 94
    .line 95
    if-eqz v2, :cond_7

    .line 96
    .line 97
    iget-wide v2, p0, Lb4/u;->g:J

    .line 98
    .line 99
    invoke-static {v0, v2, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1202(Lcom/zykj/board/EzyHeader$Header;J)J

    .line 100
    .line 101
    .line 102
    :cond_7
    and-int/lit8 v2, v1, 0x40

    .line 103
    .line 104
    if-eqz v2, :cond_9

    .line 105
    .line 106
    iget-object v2, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 107
    .line 108
    if-nez v2, :cond_8

    .line 109
    .line 110
    iget-object v2, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_8
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, Lcom/zykj/board/EzyHeader$Author;

    .line 118
    .line 119
    :goto_1
    invoke-static {v0, v2}, Lcom/zykj/board/EzyHeader$Header;->access$1302(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author;

    .line 120
    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    goto :goto_2

    .line 124
    :cond_9
    const/4 v2, 0x0

    .line 125
    :goto_2
    and-int/lit16 v3, v1, 0x80

    .line 126
    .line 127
    if-eqz v3, :cond_a

    .line 128
    .line 129
    iget-object v3, p0, Lb4/u;->j:Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {v0, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1402(Lcom/zykj/board/EzyHeader$Header;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    :cond_a
    and-int/lit16 v3, v1, 0x200

    .line 135
    .line 136
    if-eqz v3, :cond_b

    .line 137
    .line 138
    iget v3, p0, Lb4/u;->m:I

    .line 139
    .line 140
    invoke-static {v0, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1502(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 141
    .line 142
    .line 143
    :cond_b
    and-int/lit16 v3, v1, 0x400

    .line 144
    .line 145
    if-eqz v3, :cond_c

    .line 146
    .line 147
    iget v3, p0, Lb4/u;->n:I

    .line 148
    .line 149
    invoke-static {v0, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1602(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 150
    .line 151
    .line 152
    :cond_c
    and-int/lit16 v3, v1, 0x800

    .line 153
    .line 154
    if-eqz v3, :cond_e

    .line 155
    .line 156
    iget-object v3, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 157
    .line 158
    if-nez v3, :cond_d

    .line 159
    .line 160
    iget-object v3, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_d
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    check-cast v3, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 168
    .line 169
    :goto_3
    invoke-static {v0, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1702(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 170
    .line 171
    .line 172
    or-int/lit8 v2, v2, 0x2

    .line 173
    .line 174
    :cond_e
    and-int/lit16 v3, v1, 0x1000

    .line 175
    .line 176
    if-eqz v3, :cond_10

    .line 177
    .line 178
    iget-object v3, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 179
    .line 180
    if-nez v3, :cond_f

    .line 181
    .line 182
    iget-object v3, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_f
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 190
    .line 191
    :goto_4
    invoke-static {v0, v3}, Lcom/zykj/board/EzyHeader$Header;->access$1802(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 192
    .line 193
    .line 194
    or-int/lit8 v2, v2, 0x4

    .line 195
    .line 196
    :cond_10
    and-int/lit16 v1, v1, 0x2000

    .line 197
    .line 198
    if-eqz v1, :cond_12

    .line 199
    .line 200
    iget-object v1, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 201
    .line 202
    if-nez v1, :cond_11

    .line 203
    .line 204
    iget-object v1, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_11
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 212
    .line 213
    :goto_5
    invoke-static {v0, v1}, Lcom/zykj/board/EzyHeader$Header;->access$1902(Lcom/zykj/board/EzyHeader$Header;Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 214
    .line 215
    .line 216
    or-int/lit8 v2, v2, 0x8

    .line 217
    .line 218
    :cond_12
    invoke-static {v0, v2}, Lcom/zykj/board/EzyHeader$Header;->access$2076(Lcom/zykj/board/EzyHeader$Header;I)I

    .line 219
    .line 220
    .line 221
    :cond_13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 222
    .line 223
    .line 224
    return-object v0
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
    iput v0, p0, Lb4/u;->a:I

    .line 6
    .line 7
    iput v0, p0, Lb4/u;->b:I

    .line 8
    .line 9
    iput v0, p0, Lb4/u;->c:I

    .line 10
    .line 11
    iput v0, p0, Lb4/u;->d:I

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, p0, Lb4/u;->e:J

    .line 16
    .line 17
    iput-wide v1, p0, Lb4/u;->f:J

    .line 18
    .line 19
    iput-wide v1, p0, Lb4/u;->g:J

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 23
    .line 24
    iget-object v2, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 32
    .line 33
    :cond_0
    const-string v2, ""

    .line 34
    .line 35
    iput-object v2, p0, Lb4/u;->j:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 42
    .line 43
    iput-object v2, p0, Lb4/u;->k:Ljava/util/List;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iput-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget v2, p0, Lb4/u;->a:I

    .line 52
    .line 53
    and-int/lit16 v2, v2, -0x101

    .line 54
    .line 55
    iput v2, p0, Lb4/u;->a:I

    .line 56
    .line 57
    iput v0, p0, Lb4/u;->m:I

    .line 58
    .line 59
    iput v0, p0, Lb4/u;->n:I

    .line 60
    .line 61
    iput-object v1, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 62
    .line 63
    iget-object v0, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 71
    .line 72
    :cond_2
    iput-object v1, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 73
    .line 74
    iget-object v0, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 82
    .line 83
    :cond_3
    iput-object v1, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 84
    .line 85
    iget-object v0, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 90
    .line 91
    .line 92
    iput-object v1, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 93
    .line 94
    :cond_4
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    iget v0, p0, Lb4/u;->a:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x100

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lb4/u;->k:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lb4/u;->a:I

    .line 17
    .line 18
    or-int/lit16 v0, v0, 0x100

    .line 19
    .line 20
    iput v0, p0, Lb4/u;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public final getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Header;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    sget-object v0, Lb4/y;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    iget-object v0, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Author;

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
    check-cast v0, Lcom/zykj/board/EzyHeader$Author;

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
    iput-object v1, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final i()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    iget-object v0, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    iput-object v1, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    sget-object v0, Lb4/y;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/board/EzyHeader$Header;

    .line 4
    .line 5
    const-class v2, Lb4/u;

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

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final j()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    iget-object v0, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    check-cast v0, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

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
    iput-object v1, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final k()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    iget-object v0, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$MoveConfig;

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
    check-cast v0, Lcom/zykj/board/EzyHeader$MoveConfig;

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
    iput-object v1, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 41
    .line 42
    return-object v0
.end method

.method public final l()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lb4/u;->a:I

    .line 10
    .line 11
    and-int/lit16 v2, v2, 0x100

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
    iput-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lb4/u;->k:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public final m(Lcom/zykj/board/EzyHeader$Header;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Header;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Lb4/u;->b:I

    .line 19
    .line 20
    iget v0, p0, Lb4/u;->a:I

    .line 21
    .line 22
    or-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    iput v0, p0, Lb4/u;->a:I

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput v0, p0, Lb4/u;->c:I

    .line 40
    .line 41
    iget v0, p0, Lb4/u;->a:I

    .line 42
    .line 43
    or-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    iput v0, p0, Lb4/u;->a:I

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lb4/u;->d:I

    .line 61
    .line 62
    iget v0, p0, Lb4/u;->a:I

    .line 63
    .line 64
    or-int/lit8 v0, v0, 0x4

    .line 65
    .line 66
    iput v0, p0, Lb4/u;->a:I

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    cmp-long v0, v0, v2

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getCreateDate()J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    iput-wide v0, p0, Lb4/u;->e:J

    .line 86
    .line 87
    iget v0, p0, Lb4/u;->a:I

    .line 88
    .line 89
    or-int/lit8 v0, v0, 0x8

    .line 90
    .line 91
    iput v0, p0, Lb4/u;->a:I

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    cmp-long v0, v0, v2

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getUpdateDate()J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    iput-wide v0, p0, Lb4/u;->f:J

    .line 109
    .line 110
    iget v0, p0, Lb4/u;->a:I

    .line 111
    .line 112
    or-int/lit8 v0, v0, 0x10

    .line 113
    .line 114
    iput v0, p0, Lb4/u;->a:I

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 117
    .line 118
    .line 119
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDuration()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    cmp-long v0, v0, v2

    .line 124
    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDuration()J

    .line 128
    .line 129
    .line 130
    move-result-wide v0

    .line 131
    iput-wide v0, p0, Lb4/u;->g:J

    .line 132
    .line 133
    iget v0, p0, Lb4/u;->a:I

    .line 134
    .line 135
    or-int/lit8 v0, v0, 0x20

    .line 136
    .line 137
    iput v0, p0, Lb4/u;->a:I

    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 140
    .line 141
    .line 142
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasAuthor()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getAuthor()Lcom/zykj/board/EzyHeader$Author;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v1, p0, Lb4/u;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 153
    .line 154
    if-nez v1, :cond_8

    .line 155
    .line 156
    iget v1, p0, Lb4/u;->a:I

    .line 157
    .line 158
    and-int/lit8 v1, v1, 0x40

    .line 159
    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    iget-object v1, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 163
    .line 164
    if-eqz v1, :cond_7

    .line 165
    .line 166
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->getDefaultInstance()Lcom/zykj/board/EzyHeader$Author;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-eq v1, v2, :cond_7

    .line 171
    .line 172
    iget v1, p0, Lb4/u;->a:I

    .line 173
    .line 174
    or-int/lit8 v1, v1, 0x40

    .line 175
    .line 176
    iput v1, p0, Lb4/u;->a:I

    .line 177
    .line 178
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lb4/u;->h()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Lb4/o;

    .line 190
    .line 191
    invoke-virtual {v1, v0}, Lb4/o;->f(Lcom/zykj/board/EzyHeader$Author;)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_7
    iput-object v0, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_8
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 199
    .line 200
    .line 201
    :goto_0
    iget-object v0, p0, Lb4/u;->h:Lcom/zykj/board/EzyHeader$Author;

    .line 202
    .line 203
    if-eqz v0, :cond_9

    .line 204
    .line 205
    iget v0, p0, Lb4/u;->a:I

    .line 206
    .line 207
    or-int/lit8 v0, v0, 0x40

    .line 208
    .line 209
    iput v0, p0, Lb4/u;->a:I

    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 212
    .line 213
    .line 214
    :cond_9
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getConvertUrl()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_a

    .line 223
    .line 224
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$1400(Lcom/zykj/board/EzyHeader$Header;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iput-object v0, p0, Lb4/u;->j:Ljava/lang/Object;

    .line 229
    .line 230
    iget v0, p0, Lb4/u;->a:I

    .line 231
    .line 232
    or-int/lit16 v0, v0, 0x80

    .line 233
    .line 234
    iput v0, p0, Lb4/u;->a:I

    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 237
    .line 238
    .line 239
    :cond_a
    iget-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 240
    .line 241
    if-nez v0, :cond_c

    .line 242
    .line 243
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_f

    .line 252
    .line 253
    iget-object v0, p0, Lb4/u;->k:Ljava/util/List;

    .line 254
    .line 255
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_b

    .line 260
    .line 261
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, p0, Lb4/u;->k:Ljava/util/List;

    .line 266
    .line 267
    iget v0, p0, Lb4/u;->a:I

    .line 268
    .line 269
    and-int/lit16 v0, v0, -0x101

    .line 270
    .line 271
    iput v0, p0, Lb4/u;->a:I

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :cond_b
    invoke-virtual {p0}, Lb4/u;->g()V

    .line 275
    .line 276
    .line 277
    iget-object v0, p0, Lb4/u;->k:Ljava/util/List;

    .line 278
    .line 279
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 284
    .line 285
    .line 286
    :goto_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_c
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-nez v0, :cond_f

    .line 299
    .line 300
    iget-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 301
    .line 302
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_e

    .line 307
    .line 308
    iget-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 309
    .line 310
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 311
    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    iput-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 315
    .line 316
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    iput-object v1, p0, Lb4/u;->k:Ljava/util/List;

    .line 321
    .line 322
    iget v1, p0, Lb4/u;->a:I

    .line 323
    .line 324
    and-int/lit16 v1, v1, -0x101

    .line 325
    .line 326
    iput v1, p0, Lb4/u;->a:I

    .line 327
    .line 328
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->access$2100()Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-eqz v1, :cond_d

    .line 333
    .line 334
    invoke-virtual {p0}, Lb4/u;->l()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    :cond_d
    iput-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 339
    .line 340
    goto :goto_2

    .line 341
    :cond_e
    iget-object v0, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 342
    .line 343
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Header;->access$600(Lcom/zykj/board/EzyHeader$Header;)Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 348
    .line 349
    .line 350
    :cond_f
    :goto_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundColor()I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_10

    .line 355
    .line 356
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundColor()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    iput v0, p0, Lb4/u;->m:I

    .line 361
    .line 362
    iget v0, p0, Lb4/u;->a:I

    .line 363
    .line 364
    or-int/lit16 v0, v0, 0x200

    .line 365
    .line 366
    iput v0, p0, Lb4/u;->a:I

    .line 367
    .line 368
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 369
    .line 370
    .line 371
    :cond_10
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundColor()I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-eqz v0, :cond_11

    .line 376
    .line 377
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundColor()I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    iput v0, p0, Lb4/u;->n:I

    .line 382
    .line 383
    iget v0, p0, Lb4/u;->a:I

    .line 384
    .line 385
    or-int/lit16 v0, v0, 0x400

    .line 386
    .line 387
    iput v0, p0, Lb4/u;->a:I

    .line 388
    .line 389
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 390
    .line 391
    .line 392
    :cond_11
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasMoveConfig()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_14

    .line 397
    .line 398
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iget-object v1, p0, Lb4/u;->p:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 403
    .line 404
    if-nez v1, :cond_13

    .line 405
    .line 406
    iget v1, p0, Lb4/u;->a:I

    .line 407
    .line 408
    and-int/lit16 v1, v1, 0x800

    .line 409
    .line 410
    if-eqz v1, :cond_12

    .line 411
    .line 412
    iget-object v1, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 413
    .line 414
    if-eqz v1, :cond_12

    .line 415
    .line 416
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    if-eq v1, v2, :cond_12

    .line 421
    .line 422
    iget v1, p0, Lb4/u;->a:I

    .line 423
    .line 424
    or-int/lit16 v1, v1, 0x800

    .line 425
    .line 426
    iput v1, p0, Lb4/u;->a:I

    .line 427
    .line 428
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0}, Lb4/u;->k()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, Lb4/w;

    .line 440
    .line 441
    invoke-virtual {v1, v0}, Lb4/w;->f(Lcom/zykj/board/EzyHeader$MoveConfig;)V

    .line 442
    .line 443
    .line 444
    goto :goto_3

    .line 445
    :cond_12
    iput-object v0, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 446
    .line 447
    goto :goto_3

    .line 448
    :cond_13
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 449
    .line 450
    .line 451
    :goto_3
    iget-object v0, p0, Lb4/u;->o:Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 452
    .line 453
    if-eqz v0, :cond_14

    .line 454
    .line 455
    iget v0, p0, Lb4/u;->a:I

    .line 456
    .line 457
    or-int/lit16 v0, v0, 0x800

    .line 458
    .line 459
    iput v0, p0, Lb4/u;->a:I

    .line 460
    .line 461
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 462
    .line 463
    .line 464
    :cond_14
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasDefaultBackgroundLineConfig()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-eqz v0, :cond_17

    .line 469
    .line 470
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    iget-object v1, p0, Lb4/u;->r:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 475
    .line 476
    if-nez v1, :cond_16

    .line 477
    .line 478
    iget v1, p0, Lb4/u;->a:I

    .line 479
    .line 480
    and-int/lit16 v1, v1, 0x1000

    .line 481
    .line 482
    if-eqz v1, :cond_15

    .line 483
    .line 484
    iget-object v1, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 485
    .line 486
    if-eqz v1, :cond_15

    .line 487
    .line 488
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    if-eq v1, v2, :cond_15

    .line 493
    .line 494
    iget v1, p0, Lb4/u;->a:I

    .line 495
    .line 496
    or-int/lit16 v1, v1, 0x1000

    .line 497
    .line 498
    iput v1, p0, Lb4/u;->a:I

    .line 499
    .line 500
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p0}, Lb4/u;->i()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, Lb4/r;

    .line 512
    .line 513
    invoke-virtual {v1, v0}, Lb4/r;->g(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)V

    .line 514
    .line 515
    .line 516
    goto :goto_4

    .line 517
    :cond_15
    iput-object v0, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 518
    .line 519
    goto :goto_4

    .line 520
    :cond_16
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 521
    .line 522
    .line 523
    :goto_4
    iget-object v0, p0, Lb4/u;->q:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 524
    .line 525
    if-eqz v0, :cond_17

    .line 526
    .line 527
    iget v0, p0, Lb4/u;->a:I

    .line 528
    .line 529
    or-int/lit16 v0, v0, 0x1000

    .line 530
    .line 531
    iput v0, p0, Lb4/u;->a:I

    .line 532
    .line 533
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 534
    .line 535
    .line 536
    :cond_17
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->hasLastBackgroundLineConfig()Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-eqz v0, :cond_1a

    .line 541
    .line 542
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    iget-object v1, p0, Lb4/u;->t:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 547
    .line 548
    if-nez v1, :cond_19

    .line 549
    .line 550
    iget v1, p0, Lb4/u;->a:I

    .line 551
    .line 552
    and-int/lit16 v1, v1, 0x2000

    .line 553
    .line 554
    if-eqz v1, :cond_18

    .line 555
    .line 556
    iget-object v1, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 557
    .line 558
    if-eqz v1, :cond_18

    .line 559
    .line 560
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getDefaultInstance()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    if-eq v1, v2, :cond_18

    .line 565
    .line 566
    iget v1, p0, Lb4/u;->a:I

    .line 567
    .line 568
    or-int/lit16 v1, v1, 0x2000

    .line 569
    .line 570
    iput v1, p0, Lb4/u;->a:I

    .line 571
    .line 572
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {p0}, Lb4/u;->j()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    check-cast v1, Lb4/r;

    .line 584
    .line 585
    invoke-virtual {v1, v0}, Lb4/r;->g(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)V

    .line 586
    .line 587
    .line 588
    goto :goto_5

    .line 589
    :cond_18
    iput-object v0, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 590
    .line 591
    goto :goto_5

    .line 592
    :cond_19
    invoke-virtual {v1, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 593
    .line 594
    .line 595
    :goto_5
    iget-object v0, p0, Lb4/u;->s:Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 596
    .line 597
    if-eqz v0, :cond_1a

    .line 598
    .line 599
    iget v0, p0, Lb4/u;->a:I

    .line 600
    .line 601
    or-int/lit16 v0, v0, 0x2000

    .line 602
    .line 603
    iput v0, p0, Lb4/u;->a:I

    .line 604
    .line 605
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 606
    .line 607
    .line 608
    :cond_1a
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 613
    .line 614
    .line 615
    move-result-object p1

    .line 616
    check-cast p1, Lb4/u;

    .line 617
    .line 618
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 619
    .line 620
    .line 621
    return-void
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lb4/u;->n(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 5
    instance-of v0, p1, Lcom/zykj/board/EzyHeader$Header;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Lcom/zykj/board/EzyHeader$Header;

    invoke-virtual {p0, p1}, Lb4/u;->m(Lcom/zykj/board/EzyHeader$Header;)V

    return-object p0

    .line 7
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lb4/u;->n(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lb4/u;->n(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 8
    instance-of v0, p1, Lcom/zykj/board/EzyHeader$Header;

    if-eqz v0, :cond_0

    .line 9
    check-cast p1, Lcom/zykj/board/EzyHeader$Header;

    invoke-virtual {p0, p1}, Lb4/u;->m(Lcom/zykj/board/EzyHeader$Header;)V

    return-object p0

    .line 10
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public final bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lb4/u;->n(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-object p0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final n(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
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
    if-nez v0, :cond_2

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
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

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
    invoke-virtual {p0}, Lb4/u;->j()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 38
    .line 39
    .line 40
    iget v1, p0, Lb4/u;->a:I

    .line 41
    .line 42
    or-int/lit16 v1, v1, 0x2000

    .line 43
    .line 44
    iput v1, p0, Lb4/u;->a:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :sswitch_2
    invoke-virtual {p0}, Lb4/u;->i()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lb4/u;->a:I

    .line 59
    .line 60
    or-int/lit16 v1, v1, 0x1000

    .line 61
    .line 62
    iput v1, p0, Lb4/u;->a:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :sswitch_3
    invoke-virtual {p0}, Lb4/u;->k()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 74
    .line 75
    .line 76
    iget v1, p0, Lb4/u;->a:I

    .line 77
    .line 78
    or-int/lit16 v1, v1, 0x800

    .line 79
    .line 80
    iput v1, p0, Lb4/u;->a:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iput v1, p0, Lb4/u;->n:I

    .line 88
    .line 89
    iget v1, p0, Lb4/u;->a:I

    .line 90
    .line 91
    or-int/lit16 v1, v1, 0x400

    .line 92
    .line 93
    iput v1, p0, Lb4/u;->a:I

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput v1, p0, Lb4/u;->m:I

    .line 101
    .line 102
    iget v1, p0, Lb4/u;->a:I

    .line 103
    .line 104
    or-int/lit16 v1, v1, 0x200

    .line 105
    .line 106
    iput v1, p0, Lb4/u;->a:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :sswitch_6
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->parser()Lcom/google/protobuf/Parser;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lcom/zykj/board/EzyHeader$Author;

    .line 118
    .line 119
    iget-object v2, p0, Lb4/u;->l:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 120
    .line 121
    if-nez v2, :cond_1

    .line 122
    .line 123
    invoke-virtual {p0}, Lb4/u;->g()V

    .line 124
    .line 125
    .line 126
    iget-object v2, p0, Lb4/u;->k:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 133
    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-object v1, p0, Lb4/u;->j:Ljava/lang/Object;

    .line 142
    .line 143
    iget v1, p0, Lb4/u;->a:I

    .line 144
    .line 145
    or-int/lit16 v1, v1, 0x80

    .line 146
    .line 147
    iput v1, p0, Lb4/u;->a:I

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :sswitch_8
    invoke-virtual {p0}, Lb4/u;->h()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 160
    .line 161
    .line 162
    iget v1, p0, Lb4/u;->a:I

    .line 163
    .line 164
    or-int/lit8 v1, v1, 0x40

    .line 165
    .line 166
    iput v1, p0, Lb4/u;->a:I

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 171
    .line 172
    .line 173
    move-result-wide v1

    .line 174
    iput-wide v1, p0, Lb4/u;->g:J

    .line 175
    .line 176
    iget v1, p0, Lb4/u;->a:I

    .line 177
    .line 178
    or-int/lit8 v1, v1, 0x20

    .line 179
    .line 180
    iput v1, p0, Lb4/u;->a:I

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 185
    .line 186
    .line 187
    move-result-wide v1

    .line 188
    iput-wide v1, p0, Lb4/u;->f:J

    .line 189
    .line 190
    iget v1, p0, Lb4/u;->a:I

    .line 191
    .line 192
    or-int/lit8 v1, v1, 0x10

    .line 193
    .line 194
    iput v1, p0, Lb4/u;->a:I

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :sswitch_b
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 199
    .line 200
    .line 201
    move-result-wide v1

    .line 202
    iput-wide v1, p0, Lb4/u;->e:J

    .line 203
    .line 204
    iget v1, p0, Lb4/u;->a:I

    .line 205
    .line 206
    or-int/lit8 v1, v1, 0x8

    .line 207
    .line 208
    iput v1, p0, Lb4/u;->a:I

    .line 209
    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :sswitch_c
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    iput v1, p0, Lb4/u;->d:I

    .line 217
    .line 218
    iget v1, p0, Lb4/u;->a:I

    .line 219
    .line 220
    or-int/lit8 v1, v1, 0x4

    .line 221
    .line 222
    iput v1, p0, Lb4/u;->a:I

    .line 223
    .line 224
    goto/16 :goto_0

    .line 225
    .line 226
    :sswitch_d
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    iput v1, p0, Lb4/u;->c:I

    .line 231
    .line 232
    iget v1, p0, Lb4/u;->a:I

    .line 233
    .line 234
    or-int/lit8 v1, v1, 0x2

    .line 235
    .line 236
    iput v1, p0, Lb4/u;->a:I

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :sswitch_e
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    iput v1, p0, Lb4/u;->b:I

    .line 245
    .line 246
    iget v1, p0, Lb4/u;->a:I

    .line 247
    .line 248
    or-int/2addr v1, v2

    .line 249
    iput v1, p0, Lb4/u;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 258
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 259
    .line 260
    .line 261
    throw p1

    .line 262
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    nop

    .line 267
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_e
        0x10 -> :sswitch_d
        0x18 -> :sswitch_c
        0x20 -> :sswitch_b
        0x28 -> :sswitch_a
        0x30 -> :sswitch_9
        0x3a -> :sswitch_8
        0x42 -> :sswitch_7
        0x4a -> :sswitch_6
        0x50 -> :sswitch_5
        0x58 -> :sswitch_4
        0x62 -> :sswitch_3
        0x6a -> :sswitch_2
        0x72 -> :sswitch_1
    .end sparse-switch
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lb4/u;

    return-object p1
.end method
