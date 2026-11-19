.class public Lcom/alibaba/fastjson/serializer/CollectionCodec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/serializer/ObjectSerializer;
.implements Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;


# static fields
.field public static final instance:Lcom/alibaba/fastjson/serializer/CollectionCodec;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/serializer/CollectionCodec;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson/serializer/CollectionCodec;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson/serializer/CollectionCodec;->instance:Lcom/alibaba/fastjson/serializer/CollectionCodec;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->token()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 12
    .line 13
    const/16 p2, 0x10

    .line 14
    .line 15
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    const-class v0, Lcom/alibaba/fastjson/JSONArray;

    .line 21
    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    new-instance p2, Lcom/alibaba/fastjson/JSONArray;

    .line 25
    .line 26
    invoke-direct {p2}, Lcom/alibaba/fastjson/JSONArray;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parseArray(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_1
    invoke-static {p2}, Lcom/alibaba/fastjson/util/TypeUtils;->createCollection(Ljava/lang/reflect/Type;)Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p2}, Lcom/alibaba/fastjson/util/TypeUtils;->getCollectionItemType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2, v0, p3}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parseArray(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public getFastMatchToken()I
    .locals 1

    const/16 v0, 0xe

    return v0
.end method

.method public write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 9

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson/serializer/JSONSerializer;->out:Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull(Lcom/alibaba/fastjson/serializer/SerializerFeature;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteClassName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->isEnabled(Lcom/alibaba/fastjson/serializer/SerializerFeature;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    invoke-static {p5, v1}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->isEnabled(ILcom/alibaba/fastjson/serializer/SerializerFeature;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 p4, 0x0

    .line 27
    :goto_0
    move-object v6, p4

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    invoke-static {p4}, Lcom/alibaba/fastjson/util/TypeUtils;->getCollectionItemType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    goto :goto_0

    .line 34
    :goto_2
    move-object p4, p2

    .line 35
    check-cast p4, Ljava/util/Collection;

    .line 36
    .line 37
    iget-object v8, p1, Lcom/alibaba/fastjson/serializer/JSONSerializer;->context:Lcom/alibaba/fastjson/serializer/SerialContext;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {p1, v8, p2, p3, v2}, Lcom/alibaba/fastjson/serializer/JSONSerializer;->setContext(Lcom/alibaba/fastjson/serializer/SerialContext;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->isEnabled(Lcom/alibaba/fastjson/serializer/SerializerFeature;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    const-class p2, Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {p2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    const-string p2, "Set"

    .line 62
    .line 63
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->append(Ljava/lang/CharSequence;)Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const-class p2, Ljava/util/TreeSet;

    .line 68
    .line 69
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    if-ne p2, p3, :cond_4

    .line 74
    .line 75
    const-string p2, "TreeSet"

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->append(Ljava/lang/CharSequence;)Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_3
    const/16 p2, 0x5b

    .line 81
    .line 82
    :try_start_0
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->append(C)Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 83
    .line 84
    .line 85
    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    if-eqz p3, :cond_b

    .line 94
    .line 95
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 99
    add-int/lit8 p3, v2, 0x1

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    const/16 p4, 0x2c

    .line 104
    .line 105
    :try_start_1
    invoke-virtual {v0, p4}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->append(C)Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 106
    .line 107
    .line 108
    goto :goto_5

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    move-object p2, v0

    .line 111
    move-object v3, p1

    .line 112
    goto/16 :goto_9

    .line 113
    .line 114
    :cond_5
    :goto_5
    if-nez v4, :cond_7

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    .line 118
    .line 119
    :cond_6
    :goto_6
    move-object v3, p1

    .line 120
    move v7, p5

    .line 121
    goto :goto_8

    .line 122
    :cond_7
    :try_start_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    const-class v1, Ljava/lang/Integer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    .line 128
    if-ne p4, v1, :cond_8

    .line 129
    .line 130
    :try_start_3
    check-cast v4, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    invoke-virtual {v0, p4}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeInt(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_8
    :try_start_4
    const-class v1, Ljava/lang/Long;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 141
    .line 142
    if-ne p4, v1, :cond_9

    .line 143
    .line 144
    :try_start_5
    check-cast v4, Ljava/lang/Long;

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeLong(J)V

    .line 151
    .line 152
    .line 153
    sget-object p4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteClassName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 154
    .line 155
    invoke-virtual {v0, p4}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->isEnabled(Lcom/alibaba/fastjson/serializer/SerializerFeature;)Z

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    if-eqz p4, :cond_6

    .line 160
    .line 161
    const/16 p4, 0x4c

    .line 162
    .line 163
    invoke-virtual {v0, p4}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->write(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    :try_start_6
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson/serializer/JSONSerializer;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 168
    .line 169
    .line 170
    move-result-object p4

    .line 171
    sget-object v1, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteClassName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 172
    .line 173
    invoke-static {p5, v1}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->isEnabled(ILcom/alibaba/fastjson/serializer/SerializerFeature;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-eqz v1, :cond_a

    .line 178
    .line 179
    instance-of v1, p4, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 180
    .line 181
    if-eqz v1, :cond_a

    .line 182
    .line 183
    check-cast p4, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 184
    .line 185
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 189
    move-object v3, p1

    .line 190
    move-object v2, p4

    .line 191
    move v7, p5

    .line 192
    :try_start_7
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;->writeNoneASM(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :catchall_1
    move-exception v0

    .line 197
    :goto_7
    move-object p2, v0

    .line 198
    goto :goto_9

    .line 199
    :catchall_2
    move-exception v0

    .line 200
    move-object v3, p1

    .line 201
    goto :goto_7

    .line 202
    :cond_a
    move-object v3, p1

    .line 203
    move v7, p5

    .line 204
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    move-object v2, p4

    .line 209
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson/serializer/ObjectSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    .line 210
    .line 211
    .line 212
    :goto_8
    move v2, p3

    .line 213
    move-object p1, v3

    .line 214
    move p5, v7

    .line 215
    goto :goto_4

    .line 216
    :cond_b
    move-object v3, p1

    .line 217
    const/16 p1, 0x5d

    .line 218
    .line 219
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->append(C)Lcom/alibaba/fastjson/serializer/SerializeWriter;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 220
    .line 221
    .line 222
    iput-object v8, v3, Lcom/alibaba/fastjson/serializer/JSONSerializer;->context:Lcom/alibaba/fastjson/serializer/SerialContext;

    .line 223
    .line 224
    return-void

    .line 225
    :goto_9
    iput-object v8, v3, Lcom/alibaba/fastjson/serializer/JSONSerializer;->context:Lcom/alibaba/fastjson/serializer/SerialContext;

    .line 226
    .line 227
    throw p2
.end method
