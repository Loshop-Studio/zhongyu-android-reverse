# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyRouterRecord$RouterRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/util/List;

.field public c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public d:Ljava/util/List;

.field public e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public f:Ljava/util/List;

.field public g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public h:Ljava/util/List;

.field public i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public j:Ljava/util/List;

.field public k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public l:Ljava/util/List;

.field public m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public n:Ljava/util/List;

.field public o:Lcom/google/protobuf/RepeatedFieldBuilderV3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 5
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 6
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 7
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 8
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 9
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 10
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 12
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 13
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 14
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 15
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 16
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 17
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 18
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyRouterRecord$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyRouterRecord$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x4

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
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_10

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
    if-eq v1, v3, :cond_e

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v1, v3, :cond_c

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_a

    .line 25
    .line 26
    const/16 v3, 0x22

    .line 27
    .line 28
    if-eq v1, v3, :cond_8

    .line 29
    .line 30
    const/16 v3, 0x2a

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
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

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
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->p()V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

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
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

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
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 92
    .line 93
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->r()V

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

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
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 119
    .line 120
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 121
    .line 122
    if-nez v2, :cond_7

    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n()V

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_7
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 134
    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :cond_8
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 147
    .line 148
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 149
    .line 150
    if-nez v2, :cond_9

    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->q()V

    .line 153
    .line 154
    .line 155
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 156
    .line 157
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_9
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_a
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 176
    .line 177
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 178
    .line 179
    if-nez v2, :cond_b

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->s()V

    .line 182
    .line 183
    .line 184
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_b
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 192
    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_c
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 205
    .line 206
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 207
    .line 208
    if-nez v2, :cond_d

    .line 209
    .line 210
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l()V

    .line 211
    .line 212
    .line 213
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_d
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 221
    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_e
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->parser()Lcom/google/protobuf/Parser;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 234
    .line 235
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 236
    .line 237
    if-nez v2, :cond_f

    .line 238
    .line 239
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m()V

    .line 240
    .line 241
    .line 242
    iget-object v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 243
    .line 244
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_f
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 250
    .line 251
    .line 252
    goto/16 :goto_0

    .line 253
    .line 254
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 259
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 264
    .line 265
    .line 266
    return-object p0
.end method

.method public C(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->D(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

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

.method public D(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->F()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

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
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_5

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 36
    .line 37
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 38
    .line 39
    and-int/lit8 v0, v0, -0x2

    .line 40
    .line 41
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 90
    .line 91
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 92
    .line 93
    and-int/lit8 v0, v0, -0x2

    .line 94
    .line 95
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 96
    .line 97
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->y()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->u()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    move-object v0, v1

    .line 109
    :goto_1
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 113
    .line 114
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 122
    .line 123
    if-nez v0, :cond_7

    .line 124
    .line 125
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_a

    .line 134
    .line 135
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 148
    .line 149
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 150
    .line 151
    and-int/lit8 v0, v0, -0x3

    .line 152
    .line 153
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l()V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 160
    .line 161
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 166
    .line 167
    .line 168
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_a

    .line 181
    .line 182
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 183
    .line 184
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_9

    .line 189
    .line 190
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 193
    .line 194
    .line 195
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 196
    .line 197
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 202
    .line 203
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 204
    .line 205
    and-int/lit8 v0, v0, -0x3

    .line 206
    .line 207
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 208
    .line 209
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->access$2200()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_8

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->t()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    goto :goto_4

    .line 220
    :cond_8
    move-object v0, v1

    .line 221
    :goto_4
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_9
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 225
    .line 226
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 231
    .line 232
    .line 233
    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 234
    .line 235
    if-nez v0, :cond_c

    .line 236
    .line 237
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_f

    .line 246
    .line 247
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 248
    .line 249
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_b

    .line 254
    .line 255
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 260
    .line 261
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 262
    .line 263
    and-int/lit8 v0, v0, -0x5

    .line 264
    .line 265
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 266
    .line 267
    goto :goto_6

    .line 268
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->s()V

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 272
    .line 273
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 278
    .line 279
    .line 280
    :goto_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 281
    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_c
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-nez v0, :cond_f

    .line 293
    .line 294
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 295
    .line 296
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_e

    .line 301
    .line 302
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 305
    .line 306
    .line 307
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 308
    .line 309
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 314
    .line 315
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 316
    .line 317
    and-int/lit8 v0, v0, -0x5

    .line 318
    .line 319
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 320
    .line 321
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->access$2300()Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eqz v0, :cond_d

    .line 326
    .line 327
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->A()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    goto :goto_7

    .line 332
    :cond_d
    move-object v0, v1

    .line 333
    :goto_7
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_e
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 337
    .line 338
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->m(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 343
    .line 344
    .line 345
    :cond_f
    :goto_8
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 346
    .line 347
    if-nez v0, :cond_11

    .line 348
    .line 349
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-nez v0, :cond_14

    .line 358
    .line 359
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 360
    .line 361
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_10

    .line 366
    .line 367
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 372
    .line 373
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 374
    .line 375
    and-int/lit8 v0, v0, -0x9

    .line 376
    .line 377
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 378
    .line 379
    goto :goto_9

    .line 380
    :cond_10
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->q()V

    .line 381
    .line 382
    .line 383
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 384
    .line 385
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 390
    .line 391
    .line 392
    :goto_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 393
    .line 394
    .line 395
    goto :goto_b

    .line 396
    :cond_11
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_14

    .line 405
    .line 406
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 407
    .line 408
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_13

    .line 413
    .line 414
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 415
    .line 416
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 417
    .line 418
    .line 419
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 420
    .line 421
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 426
    .line 427
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 428
    .line 429
    and-int/lit8 v0, v0, -0x9

    .line 430
    .line 431
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 432
    .line 433
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->access$2400()Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-eqz v0, :cond_12

    .line 438
    .line 439
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->y()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    goto :goto_a

    .line 444
    :cond_12
    move-object v0, v1

    .line 445
    :goto_a
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_13
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 449
    .line 450
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->q(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 455
    .line 456
    .line 457
    :cond_14
    :goto_b
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 458
    .line 459
    if-nez v0, :cond_16

    .line 460
    .line 461
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-nez v0, :cond_19

    .line 470
    .line 471
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 472
    .line 473
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_15

    .line 478
    .line 479
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 484
    .line 485
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 486
    .line 487
    and-int/lit8 v0, v0, -0x11

    .line 488
    .line 489
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 490
    .line 491
    goto :goto_c

    .line 492
    :cond_15
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n()V

    .line 493
    .line 494
    .line 495
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 496
    .line 497
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 502
    .line 503
    .line 504
    :goto_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 505
    .line 506
    .line 507
    goto :goto_e

    .line 508
    :cond_16
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-nez v0, :cond_19

    .line 517
    .line 518
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 519
    .line 520
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_18

    .line 525
    .line 526
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 527
    .line 528
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 529
    .line 530
    .line 531
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 532
    .line 533
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 538
    .line 539
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 540
    .line 541
    and-int/lit8 v0, v0, -0x11

    .line 542
    .line 543
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 544
    .line 545
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->z()Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-eqz v0, :cond_17

    .line 550
    .line 551
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->w()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    goto :goto_d

    .line 556
    :cond_17
    move-object v0, v1

    .line 557
    :goto_d
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 558
    .line 559
    goto :goto_e

    .line 560
    :cond_18
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 561
    .line 562
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->s(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 567
    .line 568
    .line 569
    :cond_19
    :goto_e
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 570
    .line 571
    if-nez v0, :cond_1b

    .line 572
    .line 573
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    if-nez v0, :cond_1e

    .line 582
    .line 583
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 584
    .line 585
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    if-eqz v0, :cond_1a

    .line 590
    .line 591
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 596
    .line 597
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 598
    .line 599
    and-int/lit8 v0, v0, -0x21

    .line 600
    .line 601
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_1a
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->r()V

    .line 605
    .line 606
    .line 607
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 608
    .line 609
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 614
    .line 615
    .line 616
    :goto_f
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 617
    .line 618
    .line 619
    goto :goto_11

    .line 620
    :cond_1b
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-nez v0, :cond_1e

    .line 629
    .line 630
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 631
    .line 632
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-eqz v0, :cond_1d

    .line 637
    .line 638
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 639
    .line 640
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 641
    .line 642
    .line 643
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 644
    .line 645
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 650
    .line 651
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 652
    .line 653
    and-int/lit8 v0, v0, -0x21

    .line 654
    .line 655
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 656
    .line 657
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->access$2600()Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    if-eqz v0, :cond_1c

    .line 662
    .line 663
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->z()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    goto :goto_10

    .line 668
    :cond_1c
    move-object v0, v1

    .line 669
    :goto_10
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 670
    .line 671
    goto :goto_11

    .line 672
    :cond_1d
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 673
    .line 674
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->u(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 679
    .line 680
    .line 681
    :cond_1e
    :goto_11
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 682
    .line 683
    if-nez v0, :cond_20

    .line 684
    .line 685
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    if-nez v0, :cond_23

    .line 694
    .line 695
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 696
    .line 697
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_1f

    .line 702
    .line 703
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 708
    .line 709
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 710
    .line 711
    and-int/lit8 v0, v0, -0x41

    .line 712
    .line 713
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 714
    .line 715
    goto :goto_12

    .line 716
    :cond_1f
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->p()V

    .line 717
    .line 718
    .line 719
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 720
    .line 721
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 726
    .line 727
    .line 728
    :goto_12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 729
    .line 730
    .line 731
    goto :goto_13

    .line 732
    :cond_20
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-nez v0, :cond_23

    .line 741
    .line 742
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 743
    .line 744
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    if-eqz v0, :cond_22

    .line 749
    .line 750
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 751
    .line 752
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 753
    .line 754
    .line 755
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 756
    .line 757
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 762
    .line 763
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 764
    .line 765
    and-int/lit8 v0, v0, -0x41

    .line 766
    .line 767
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 768
    .line 769
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->A()Z

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    if-eqz v0, :cond_21

    .line 774
    .line 775
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->x()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    :cond_21
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 780
    .line 781
    goto :goto_13

    .line 782
    :cond_22
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 783
    .line 784
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->w(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 789
    .line 790
    .line 791
    :cond_23
    :goto_13
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 792
    .line 793
    .line 794
    move-result-object p1

    .line 795
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->E(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 796
    .line 797
    .line 798
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 799
    .line 800
    .line 801
    return-object p0
.end method

.method public final E(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public F(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public G(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public final H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->isInitialized()Z

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

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyRouterRecord$a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final e(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Lcom/zykj/board/EzyRouterRecord$RouterRecord;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x2

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->f(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, 0x2

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 55
    .line 56
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 57
    .line 58
    and-int/lit8 v0, v0, -0x3

    .line 59
    .line 60
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->k(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->k(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    :goto_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 76
    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 80
    .line 81
    and-int/lit8 v0, v0, 0x4

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 92
    .line 93
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 94
    .line 95
    and-int/lit8 v0, v0, -0x5

    .line 96
    .line 97
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 98
    .line 99
    :cond_4
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 100
    .line 101
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->o(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->o(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    :goto_2
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 113
    .line 114
    if-nez v0, :cond_7

    .line 115
    .line 116
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 117
    .line 118
    and-int/lit8 v0, v0, 0x8

    .line 119
    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 123
    .line 124
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 129
    .line 130
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 131
    .line 132
    and-int/lit8 v0, v0, -0x9

    .line 133
    .line 134
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 135
    .line 136
    :cond_6
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 137
    .line 138
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->r(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_7
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->r(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    :goto_3
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 150
    .line 151
    if-nez v0, :cond_9

    .line 152
    .line 153
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 154
    .line 155
    and-int/lit8 v0, v0, 0x10

    .line 156
    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 160
    .line 161
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 166
    .line 167
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 168
    .line 169
    and-int/lit8 v0, v0, -0x11

    .line 170
    .line 171
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 172
    .line 173
    :cond_8
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 174
    .line 175
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->t(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->t(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    :goto_4
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 187
    .line 188
    if-nez v0, :cond_b

    .line 189
    .line 190
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 191
    .line 192
    and-int/lit8 v0, v0, 0x20

    .line 193
    .line 194
    if-eqz v0, :cond_a

    .line 195
    .line 196
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 197
    .line 198
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 203
    .line 204
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 205
    .line 206
    and-int/lit8 v0, v0, -0x21

    .line 207
    .line 208
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 209
    .line 210
    :cond_a
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 211
    .line 212
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->v(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_b
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->v(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    :goto_5
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 224
    .line 225
    if-nez v0, :cond_d

    .line 226
    .line 227
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 228
    .line 229
    and-int/lit8 v0, v0, 0x40

    .line 230
    .line 231
    if-eqz v0, :cond_c

    .line 232
    .line 233
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 234
    .line 235
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 240
    .line 241
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 242
    .line 243
    and-int/lit8 v0, v0, -0x41

    .line 244
    .line 245
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 246
    .line 247
    :cond_c
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 248
    .line 249
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->x(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_d
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->x(Lcom/zykj/board/EzyRouterRecord$RouterRecord;Ljava/util/List;)Ljava/util/List;

    .line 258
    .line 259
    .line 260
    return-void
.end method

.method public g()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x2

    .line 25
    .line 26
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 40
    .line 41
    .line 42
    :goto_1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, -0x3

    .line 45
    .line 46
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 53
    .line 54
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 60
    .line 61
    .line 62
    :goto_2
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 63
    .line 64
    and-int/lit8 v0, v0, -0x5

    .line 65
    .line 66
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 69
    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 73
    .line 74
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 80
    .line 81
    .line 82
    :goto_3
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 83
    .line 84
    and-int/lit8 v0, v0, -0x9

    .line 85
    .line 86
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 87
    .line 88
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 89
    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 100
    .line 101
    .line 102
    :goto_4
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 103
    .line 104
    and-int/lit8 v0, v0, -0x11

    .line 105
    .line 106
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 107
    .line 108
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 109
    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 113
    .line 114
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 120
    .line 121
    .line 122
    :goto_5
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 123
    .line 124
    and-int/lit8 v0, v0, -0x21

    .line 125
    .line 126
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 127
    .line 128
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 129
    .line 130
    if-nez v0, :cond_6

    .line 131
    .line 132
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 133
    .line 134
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_6
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 140
    .line 141
    .line 142
    :goto_6
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 143
    .line 144
    and-int/lit8 v0, v0, -0x41

    .line 145
    .line 146
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 147
    .line 148
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->v()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->v()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

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

.method public k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public final l()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x2

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->C(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->C(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->B(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->E(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->E(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->E(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public final n()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

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
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x10

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

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
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x40

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x8

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

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
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x20

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->F(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->F(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->G(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->G(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->H(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public final t()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x2

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
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public final u()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    and-int/2addr v2, v3

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v0, v1, v3, v2, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b:Ljava/util/List;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 34
    .line 35
    return-object v0
.end method

.method public v()Lcom/zykj/board/EzyRouterRecord$RouterRecord;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->F()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final w()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

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
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->j:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->k:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public final x()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x40

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
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->n:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->o:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public final y()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x8

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
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->i:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public final z()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->a:I

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
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->l:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->m:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method
