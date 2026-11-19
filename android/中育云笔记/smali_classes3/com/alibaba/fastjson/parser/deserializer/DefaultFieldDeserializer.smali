.class public Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;
.super Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
.source "SourceFile"


# instance fields
.field protected customDeserilizer:Z

.field protected fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/ParserConfig;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;-><init>(Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->customDeserilizer:Z

    .line 6
    .line 7
    invoke-virtual {p3}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-interface {p2}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    const-class p3, Ljava/lang/Void;

    .line 20
    .line 21
    if-eq p2, p3, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    :cond_0
    iput-boolean p1, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->customDeserilizer:Z

    .line 25
    .line 26
    :cond_1
    return-void
.end method


# virtual methods
.method public getFastMatchToken()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;->getFastMatchToken()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x2

    .line 11
    return v0
.end method

.method public getFieldValueDeserilizer(Lcom/alibaba/fastjson/parser/ParserConfig;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-class v2, Ljava/lang/Void;

    .line 18
    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p1

    .line 35
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    .line 36
    .line 37
    const-string v1, "create deserializeUsing ObjectDeserializer error"

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 44
    .line 45
    iget-object v1, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 48
    .line 49
    invoke-virtual {p1, v1, v0}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 54
    .line 55
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 56
    .line 57
    return-object p1
.end method

.method public parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->getFieldValueDeserilizer(Lcom/alibaba/fastjson/parser/ParserConfig;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 17
    .line 18
    instance-of v2, p3, Ljava/lang/reflect/ParameterizedType;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getContext()Lcom/alibaba/fastjson/parser/ParseContext;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iput-object p3, v2, Lcom/alibaba/fastjson/parser/ParseContext;->type:Ljava/lang/reflect/Type;

    .line 29
    .line 30
    :cond_1
    if-eq v1, p3, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->clazz:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v0, p3, v1}, Lcom/alibaba/fastjson/util/FieldInfo;->getFieldType(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p3, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_2
    move-object v3, v1

    .line 47
    instance-of p3, v0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 48
    .line 49
    if-eqz p3, :cond_3

    .line 50
    .line 51
    iget-object p3, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 52
    .line 53
    iget v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    check-cast v0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 58
    .line 59
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, p1, v3, p3, v1}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    move-object v2, p1

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iget-object p3, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 68
    .line 69
    iget-object v5, p3, Lcom/alibaba/fastjson/util/FieldInfo;->format:Ljava/lang/String;

    .line 70
    .line 71
    if-nez v5, :cond_5

    .line 72
    .line 73
    iget v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    .line 74
    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    move-object v2, p1

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    :goto_0
    instance-of v1, v0, Lcom/alibaba/fastjson/parser/deserializer/ContextObjectDeserializer;

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    move-object v1, v0

    .line 85
    check-cast v1, Lcom/alibaba/fastjson/parser/deserializer/ContextObjectDeserializer;

    .line 86
    .line 87
    iget-object v4, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 88
    .line 89
    iget v6, p3, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    .line 90
    .line 91
    move-object v2, p1

    .line 92
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson/parser/deserializer/ContextObjectDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    goto :goto_2

    .line 97
    :goto_1
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v0, v2, v3, p1}, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    :goto_2
    instance-of p1, p3, [B

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 109
    .line 110
    iget-object p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->format:Ljava/lang/String;

    .line 111
    .line 112
    const-string v1, "gzip"

    .line 113
    .line 114
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_6

    .line 119
    .line 120
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 121
    .line 122
    iget-object p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->format:Ljava/lang/String;

    .line 123
    .line 124
    const-string v1, "gzip,base64"

    .line 125
    .line 126
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_9

    .line 131
    .line 132
    :cond_6
    check-cast p3, [B

    .line 133
    .line 134
    :try_start_0
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    .line 135
    .line 136
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 137
    .line 138
    invoke-direct {v1, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p1, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 142
    .line 143
    .line 144
    new-instance p3, Ljava/io/ByteArrayOutputStream;

    .line 145
    .line 146
    invoke-direct {p3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_3
    const/16 v1, 0x400

    .line 150
    .line 151
    new-array v1, v1, [B

    .line 152
    .line 153
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    const/4 v4, -0x1

    .line 158
    if-ne v3, v4, :cond_8

    .line 159
    .line 160
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    goto :goto_5

    .line 165
    :catch_0
    move-exception v0

    .line 166
    move-object p1, v0

    .line 167
    goto :goto_4

    .line 168
    :cond_8
    if-lez v3, :cond_7

    .line 169
    .line 170
    invoke-virtual {p3, v1, v0, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :goto_4
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    .line 175
    .line 176
    const-string p3, "unzip bytes error."

    .line 177
    .line 178
    invoke-direct {p2, p3, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    throw p2

    .line 182
    :cond_9
    :goto_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getResolveStatus()I

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    const/4 v1, 0x1

    .line 187
    if-ne p1, v1, :cond_a

    .line 188
    .line 189
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getLastResolveTask()Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iput-object p0, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;->fieldDeserializer:Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 194
    .line 195
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getContext()Lcom/alibaba/fastjson/parser/ParseContext;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    iput-object p2, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;->ownerContext:Lcom/alibaba/fastjson/parser/ParseContext;

    .line 200
    .line 201
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setResolveStatus(I)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_a
    if-nez p2, :cond_b

    .line 206
    .line 207
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 208
    .line 209
    iget-object p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {p4, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_b
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public parseFieldUnwrapped(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 2
    .line 3
    const-string p2, "TODO"

    .line 4
    .line 5
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method
