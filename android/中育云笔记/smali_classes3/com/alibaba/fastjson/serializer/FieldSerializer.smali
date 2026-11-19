.class public Lcom/alibaba/fastjson/serializer/FieldSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/alibaba/fastjson/serializer/FieldSerializer;",
        ">;"
    }
.end annotation


# instance fields
.field protected browserCompatible:Z

.field protected disableCircularReferenceDetect:Z

.field private final double_quoted_fieldPrefix:Ljava/lang/String;

.field protected features:I

.field protected fieldContext:Lcom/alibaba/fastjson/serializer/BeanContext;

.field public final fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

.field private format:Ljava/lang/String;

.field protected persistenceXToMany:Z

.field private runtimeInfo:Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;

.field protected serializeUsing:Z

.field private single_quoted_fieldPrefix:Ljava/lang/String;

.field private un_quoted_fieldPrefix:Ljava/lang/String;

.field protected writeEnumUsingName:Z

.field protected writeEnumUsingToString:Z

.field protected final writeNull:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingToString:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingName:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->disableCircularReferenceDetect:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->serializeUsing:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->persistenceXToMany:Z

    .line 14
    .line 15
    iput-object p2, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 16
    .line 17
    new-instance v1, Lcom/alibaba/fastjson/serializer/BeanContext;

    .line 18
    .line 19
    invoke-direct {v1, p1, p2}, Lcom/alibaba/fastjson/serializer/BeanContext;-><init>(Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldContext:Lcom/alibaba/fastjson/serializer/BeanContext;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-eqz p1, :cond_5

    .line 26
    .line 27
    const-class v2, Lcom/alibaba/fastjson/annotation/JSONType;

    .line 28
    .line 29
    invoke-static {p1, v2}, Lcom/alibaba/fastjson/util/TypeUtils;->getAnnotation(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/alibaba/fastjson/annotation/JSONType;

    .line 34
    .line 35
    if-eqz p1, :cond_5

    .line 36
    .line 37
    invoke-interface {p1}, Lcom/alibaba/fastjson/annotation/JSONType;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    array-length v2, p1

    .line 42
    move v3, v0

    .line 43
    :goto_0
    if-ge v3, v2, :cond_5

    .line 44
    .line 45
    aget-object v4, p1, v3

    .line 46
    .line 47
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteEnumUsingToString:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 48
    .line 49
    if-ne v4, v5, :cond_0

    .line 50
    .line 51
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingToString:Z

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteEnumUsingName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 55
    .line 56
    if-ne v4, v5, :cond_1

    .line 57
    .line 58
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingName:Z

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->DisableCircularReferenceDetect:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 62
    .line 63
    if-ne v4, v5, :cond_2

    .line 64
    .line 65
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->disableCircularReferenceDetect:Z

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->BrowserCompatible:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 69
    .line 70
    if-ne v4, v5, :cond_3

    .line 71
    .line 72
    iget v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 73
    .line 74
    iget v5, v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 75
    .line 76
    or-int/2addr v4, v5

    .line 77
    iput v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 78
    .line 79
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->browserCompatible:Z

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteMapNullValue:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 83
    .line 84
    if-ne v4, v5, :cond_4

    .line 85
    .line 86
    iget v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 87
    .line 88
    iget v5, v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 89
    .line 90
    or-int/2addr v4, v5

    .line 91
    iput v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 92
    .line 93
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    invoke-virtual {p2}, Lcom/alibaba/fastjson/util/FieldInfo;->setAccessible()V

    .line 97
    .line 98
    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const/16 v2, 0x22

    .line 105
    .line 106
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v2, p2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v2, "\":"

    .line 115
    .line 116
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->double_quoted_fieldPrefix:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p2}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-eqz p1, :cond_e

    .line 130
    .line 131
    invoke-interface {p1}, Lcom/alibaba/fastjson/annotation/JSONField;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    array-length v3, v2

    .line 136
    move v4, v0

    .line 137
    :goto_2
    if-ge v4, v3, :cond_7

    .line 138
    .line 139
    aget-object v5, v2, v4

    .line 140
    .line 141
    invoke-virtual {v5}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    sget v6, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WRITE_MAP_NULL_FEATURES:I

    .line 146
    .line 147
    and-int/2addr v5, v6

    .line 148
    if-eqz v5, :cond_6

    .line 149
    .line 150
    move v2, v1

    .line 151
    goto :goto_3

    .line 152
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    move v2, v0

    .line 156
    :goto_3
    invoke-interface {p1}, Lcom/alibaba/fastjson/annotation/JSONField;->format()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    iput-object v3, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-nez v3, :cond_8

    .line 171
    .line 172
    const/4 v3, 0x0

    .line 173
    iput-object v3, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 174
    .line 175
    :cond_8
    invoke-interface {p1}, Lcom/alibaba/fastjson/annotation/JSONField;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    array-length v4, v3

    .line 180
    move v5, v0

    .line 181
    :goto_4
    if-ge v5, v4, :cond_d

    .line 182
    .line 183
    aget-object v6, v3, v5

    .line 184
    .line 185
    sget-object v7, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteEnumUsingToString:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 186
    .line 187
    if-ne v6, v7, :cond_9

    .line 188
    .line 189
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingToString:Z

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_9
    sget-object v7, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteEnumUsingName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 193
    .line 194
    if-ne v6, v7, :cond_a

    .line 195
    .line 196
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingName:Z

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_a
    sget-object v7, Lcom/alibaba/fastjson/serializer/SerializerFeature;->DisableCircularReferenceDetect:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 200
    .line 201
    if-ne v6, v7, :cond_b

    .line 202
    .line 203
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->disableCircularReferenceDetect:Z

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    sget-object v7, Lcom/alibaba/fastjson/serializer/SerializerFeature;->BrowserCompatible:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 207
    .line 208
    if-ne v6, v7, :cond_c

    .line 209
    .line 210
    iput-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->browserCompatible:Z

    .line 211
    .line 212
    :cond_c
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_d
    iget v3, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 216
    .line 217
    invoke-interface {p1}, Lcom/alibaba/fastjson/annotation/JSONField;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->of([Lcom/alibaba/fastjson/serializer/SerializerFeature;)I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    or-int/2addr p1, v3

    .line 226
    iput p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_e
    move v2, v0

    .line 230
    :goto_6
    iput-boolean v2, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeNull:Z

    .line 231
    .line 232
    iget-object p1, p2, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 233
    .line 234
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->isAnnotationPresentOneToMany(Ljava/lang/reflect/Method;)Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-nez p1, :cond_f

    .line 239
    .line 240
    iget-object p1, p2, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 241
    .line 242
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->isAnnotationPresentManyToMany(Ljava/lang/reflect/Method;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_10

    .line 247
    .line 248
    :cond_f
    move v0, v1

    .line 249
    :cond_10
    iput-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->persistenceXToMany:Z

    .line 250
    .line 251
    return-void
.end method


# virtual methods
.method public compareTo(Lcom/alibaba/fastjson/serializer/FieldSerializer;)I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-object p1, p1, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/util/FieldInfo;->compareTo(Lcom/alibaba/fastjson/util/FieldInfo;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/alibaba/fastjson/serializer/FieldSerializer;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson/serializer/FieldSerializer;->compareTo(Lcom/alibaba/fastjson/serializer/FieldSerializer;)I

    move-result p1

    return p1
.end method

.method public getPropertyValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/util/FieldInfo;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 16
    .line 17
    const-class v1, Ljava/util/Date;

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const-class v1, Ljava/sql/Date;

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 28
    .line 29
    sget-object v2, Lcom/alibaba/fastjson/JSON;->defaultLocale:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 32
    .line 33
    .line 34
    sget-object v1, Lcom/alibaba/fastjson/JSON;->defaultTimeZone:Ljava/util/TimeZone;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_1
    return-object p1
.end method

.method public getPropertyValueDirect(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/util/FieldInfo;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->persistenceXToMany:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->isHibernateInitialized(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    :cond_0
    return-object p1
.end method

.method public writePrefix(Lcom/alibaba/fastjson/serializer/JSONSerializer;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/alibaba/fastjson/serializer/JSONSerializer;->out:Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 2
    .line 3
    iget-boolean v0, p1, Lcom/alibaba/fastjson/serializer/SerializeWriter;->quoteFieldNames:Z

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget v0, p1, Lcom/alibaba/fastjson/serializer/SerializeWriter;->features:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 10
    .line 11
    iget v1, v1, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 12
    .line 13
    sget-object v2, Lcom/alibaba/fastjson/serializer/SerializerFeature;->UseSingleQuotes:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->isEnabled(IILcom/alibaba/fastjson/serializer/SerializerFeature;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->single_quoted_fieldPrefix:Ljava/lang/String;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x27

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "\':"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->single_quoted_fieldPrefix:Ljava/lang/String;

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->single_quoted_fieldPrefix:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->write(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->double_quoted_fieldPrefix:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->write(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->un_quoted_fieldPrefix:Ljava/lang/String;

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 75
    .line 76
    iget-object v1, v1, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ":"

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->un_quoted_fieldPrefix:Ljava/lang/String;

    .line 91
    .line 92
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->un_quoted_fieldPrefix:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->write(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public writeValue(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->runtimeInfo:Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Boolean;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Long;

    .line 6
    .line 7
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    if-nez v0, :cond_e

    .line 10
    .line 11
    const-class v0, Ljava/lang/Double;

    .line 12
    .line 13
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const-class v5, Ljava/lang/Float;

    .line 16
    .line 17
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-nez p2, :cond_6

    .line 20
    .line 21
    iget-object v7, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 22
    .line 23
    iget-object v7, v7, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-ne v7, v8, :cond_0

    .line 28
    .line 29
    const-class v7, Ljava/lang/Byte;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    if-ne v7, v8, :cond_1

    .line 35
    .line 36
    const-class v7, Ljava/lang/Short;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-ne v7, v8, :cond_2

    .line 42
    .line 43
    const-class v7, Ljava/lang/Integer;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    if-ne v7, v3, :cond_3

    .line 47
    .line 48
    move-object v7, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    if-ne v7, v6, :cond_4

    .line 51
    .line 52
    move-object v7, v5

    .line 53
    goto :goto_0

    .line 54
    :cond_4
    if-ne v7, v4, :cond_5

    .line 55
    .line 56
    move-object v7, v0

    .line 57
    goto :goto_0

    .line 58
    :cond_5
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    if-ne v7, v8, :cond_7

    .line 61
    .line 62
    move-object v7, v1

    .line 63
    goto :goto_0

    .line 64
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    :cond_7
    :goto_0
    iget-object v8, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 69
    .line 70
    invoke-virtual {v8}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    if-eqz v8, :cond_8

    .line 75
    .line 76
    invoke-interface {v8}, Lcom/alibaba/fastjson/annotation/JSONField;->serializeUsing()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const-class v10, Ljava/lang/Void;

    .line 81
    .line 82
    if-eq v9, v10, :cond_8

    .line 83
    .line 84
    invoke-interface {v8}, Lcom/alibaba/fastjson/annotation/JSONField;->serializeUsing()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    iput-boolean v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->serializeUsing:Z

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_8
    iget-object v8, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v8, :cond_c

    .line 101
    .line 102
    if-eq v7, v4, :cond_b

    .line 103
    .line 104
    if-ne v7, v0, :cond_9

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_9
    if-eq v7, v6, :cond_a

    .line 108
    .line 109
    if-ne v7, v5, :cond_c

    .line 110
    .line 111
    :cond_a
    new-instance v0, Lcom/alibaba/fastjson/serializer/FloatCodec;

    .line 112
    .line 113
    iget-object v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 114
    .line 115
    invoke-direct {v0, v4}, Lcom/alibaba/fastjson/serializer/FloatCodec;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_b
    :goto_1
    new-instance v0, Lcom/alibaba/fastjson/serializer/DoubleSerializer;

    .line 120
    .line 121
    iget-object v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 122
    .line 123
    invoke-direct {v0, v4}, Lcom/alibaba/fastjson/serializer/DoubleSerializer;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_c
    const/4 v0, 0x0

    .line 128
    :goto_2
    if-nez v0, :cond_d

    .line 129
    .line 130
    invoke-virtual {p1, v7}, Lcom/alibaba/fastjson/serializer/JSONSerializer;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :cond_d
    :goto_3
    new-instance v4, Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;

    .line 135
    .line 136
    invoke-direct {v4, v0, v7}, Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;-><init>(Lcom/alibaba/fastjson/serializer/ObjectSerializer;Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    iput-object v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->runtimeInfo:Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;

    .line 140
    .line 141
    :cond_e
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->runtimeInfo:Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;

    .line 142
    .line 143
    iget-boolean v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->disableCircularReferenceDetect:Z

    .line 144
    .line 145
    if-eqz v4, :cond_f

    .line 146
    .line 147
    iget-object v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 148
    .line 149
    iget v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 150
    .line 151
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->DisableCircularReferenceDetect:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 152
    .line 153
    iget v5, v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 154
    .line 155
    or-int/2addr v4, v5

    .line 156
    goto :goto_4

    .line 157
    :cond_f
    iget-object v4, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 158
    .line 159
    iget v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 160
    .line 161
    :goto_4
    iget v5, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 162
    .line 163
    or-int v11, v4, v5

    .line 164
    .line 165
    if-nez p2, :cond_17

    .line 166
    .line 167
    iget-object p2, p1, Lcom/alibaba/fastjson/serializer/JSONSerializer;->out:Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 168
    .line 169
    iget-object v2, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 170
    .line 171
    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 172
    .line 173
    const-class v3, Ljava/lang/Object;

    .line 174
    .line 175
    if-ne v2, v3, :cond_10

    .line 176
    .line 177
    sget v2, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WRITE_MAP_NULL_FEATURES:I

    .line 178
    .line 179
    invoke-virtual {p2, v2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->isEnabled(I)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_10

    .line 184
    .line 185
    invoke-virtual {p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_10
    iget-object v2, v0, Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;->runtimeFieldClass:Ljava/lang/Class;

    .line 190
    .line 191
    const-class v3, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_11

    .line 198
    .line 199
    iget p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 200
    .line 201
    sget-object v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 202
    .line 203
    iget v0, v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 204
    .line 205
    invoke-virtual {p2, p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull(II)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_11
    const-class v3, Ljava/lang/String;

    .line 210
    .line 211
    if-ne v3, v2, :cond_12

    .line 212
    .line 213
    iget p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 214
    .line 215
    sget-object v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 216
    .line 217
    iget v0, v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 218
    .line 219
    invoke-virtual {p2, p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull(II)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_12
    if-ne v1, v2, :cond_13

    .line 224
    .line 225
    iget p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 226
    .line 227
    sget-object v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 228
    .line 229
    iget v0, v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 230
    .line 231
    invoke-virtual {p2, p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull(II)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_13
    const-class v1, Ljava/util/Collection;

    .line 236
    .line 237
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_16

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_14

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_14
    iget-object v6, v0, Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;->fieldSerializer:Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 251
    .line 252
    sget v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WRITE_MAP_NULL_FEATURES:I

    .line 253
    .line 254
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->isEnabled(I)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_15

    .line 259
    .line 260
    instance-of v0, v6, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 261
    .line 262
    if-eqz v0, :cond_15

    .line 263
    .line 264
    invoke-virtual {p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull()V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_15
    iget-object p2, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 269
    .line 270
    iget-object v9, p2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 271
    .line 272
    iget-object v10, p2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 273
    .line 274
    const/4 v8, 0x0

    .line 275
    move-object v7, p1

    .line 276
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson/serializer/ObjectSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :cond_16
    :goto_5
    iget p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 281
    .line 282
    sget-object v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 283
    .line 284
    iget v0, v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 285
    .line 286
    invoke-virtual {p2, p1, v0}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeNull(II)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_17
    move-object v7, p1

    .line 291
    iget-object p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 292
    .line 293
    iget-boolean p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->isEnum:Z

    .line 294
    .line 295
    if-eqz p1, :cond_19

    .line 296
    .line 297
    iget-boolean p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingName:Z

    .line 298
    .line 299
    if-eqz p1, :cond_18

    .line 300
    .line 301
    iget-object p1, v7, Lcom/alibaba/fastjson/serializer/JSONSerializer;->out:Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 302
    .line 303
    check-cast p2, Ljava/lang/Enum;

    .line 304
    .line 305
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeString(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_18
    iget-boolean p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->writeEnumUsingToString:Z

    .line 314
    .line 315
    if-eqz p1, :cond_19

    .line 316
    .line 317
    iget-object p1, v7, Lcom/alibaba/fastjson/serializer/JSONSerializer;->out:Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 318
    .line 319
    check-cast p2, Ljava/lang/Enum;

    .line 320
    .line 321
    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeString(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    iget-object v1, v0, Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;->runtimeFieldClass:Ljava/lang/Class;

    .line 334
    .line 335
    if-eq p1, v1, :cond_1b

    .line 336
    .line 337
    iget-boolean v1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->serializeUsing:Z

    .line 338
    .line 339
    if-eqz v1, :cond_1a

    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_1a
    invoke-virtual {v7, p1}, Lcom/alibaba/fastjson/serializer/JSONSerializer;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    :goto_6
    move-object v6, v0

    .line 347
    goto :goto_8

    .line 348
    :cond_1b
    :goto_7
    iget-object v0, v0, Lcom/alibaba/fastjson/serializer/FieldSerializer$RuntimeSerializerInfo;->fieldSerializer:Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :goto_8
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->format:Ljava/lang/String;

    .line 352
    .line 353
    if-eqz v0, :cond_1d

    .line 354
    .line 355
    instance-of v1, v6, Lcom/alibaba/fastjson/serializer/DoubleSerializer;

    .line 356
    .line 357
    if-nez v1, :cond_1d

    .line 358
    .line 359
    instance-of v1, v6, Lcom/alibaba/fastjson/serializer/FloatCodec;

    .line 360
    .line 361
    if-nez v1, :cond_1d

    .line 362
    .line 363
    instance-of p1, v6, Lcom/alibaba/fastjson/serializer/ContextObjectSerializer;

    .line 364
    .line 365
    if-eqz p1, :cond_1c

    .line 366
    .line 367
    check-cast v6, Lcom/alibaba/fastjson/serializer/ContextObjectSerializer;

    .line 368
    .line 369
    iget-object p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldContext:Lcom/alibaba/fastjson/serializer/BeanContext;

    .line 370
    .line 371
    invoke-interface {v6, v7, p2, p1}, Lcom/alibaba/fastjson/serializer/ContextObjectSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Lcom/alibaba/fastjson/serializer/BeanContext;)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :cond_1c
    invoke-virtual {v7, p2, v0}, Lcom/alibaba/fastjson/serializer/JSONSerializer;->writeWithFormat(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :cond_1d
    iget-object v0, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 380
    .line 381
    iget-boolean v1, v0, Lcom/alibaba/fastjson/util/FieldInfo;->unwrapped:Z

    .line 382
    .line 383
    if-eqz v1, :cond_1f

    .line 384
    .line 385
    instance-of v1, v6, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 386
    .line 387
    if-eqz v1, :cond_1e

    .line 388
    .line 389
    check-cast v6, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 390
    .line 391
    iget-object v9, v0, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 392
    .line 393
    iget-object v10, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 394
    .line 395
    const/4 v12, 0x1

    .line 396
    move-object v8, p2

    .line 397
    invoke-virtual/range {v6 .. v12}, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :cond_1e
    move-object v8, p2

    .line 402
    instance-of p2, v6, Lcom/alibaba/fastjson/serializer/MapSerializer;

    .line 403
    .line 404
    if-eqz p2, :cond_20

    .line 405
    .line 406
    check-cast v6, Lcom/alibaba/fastjson/serializer/MapSerializer;

    .line 407
    .line 408
    iget-object v9, v0, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 409
    .line 410
    iget-object v10, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 411
    .line 412
    const/4 v12, 0x1

    .line 413
    invoke-virtual/range {v6 .. v12}, Lcom/alibaba/fastjson/serializer/MapSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :cond_1f
    move-object v8, p2

    .line 418
    :cond_20
    iget p2, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->features:I

    .line 419
    .line 420
    sget-object v1, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteClassName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 421
    .line 422
    iget v1, v1, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 423
    .line 424
    and-int/2addr p2, v1

    .line 425
    if-eqz p2, :cond_21

    .line 426
    .line 427
    iget-object p2, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 428
    .line 429
    if-eq p1, p2, :cond_21

    .line 430
    .line 431
    instance-of p1, v6, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 432
    .line 433
    if-eqz p1, :cond_21

    .line 434
    .line 435
    check-cast v6, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 436
    .line 437
    iget-object v9, v0, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 438
    .line 439
    iget-object v10, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 440
    .line 441
    const/4 v12, 0x0

    .line 442
    invoke-virtual/range {v6 .. v12}, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :cond_21
    iget-boolean p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->browserCompatible:Z

    .line 447
    .line 448
    if-eqz p1, :cond_24

    .line 449
    .line 450
    iget-object p1, v0, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 451
    .line 452
    if-eq p1, v3, :cond_22

    .line 453
    .line 454
    if-ne p1, v2, :cond_24

    .line 455
    .line 456
    :cond_22
    move-object p2, v8

    .line 457
    check-cast p2, Ljava/lang/Long;

    .line 458
    .line 459
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 460
    .line 461
    .line 462
    move-result-wide p1

    .line 463
    const-wide v0, 0x1fffffffffffffL

    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    cmp-long v0, p1, v0

    .line 469
    .line 470
    if-gtz v0, :cond_23

    .line 471
    .line 472
    const-wide v0, -0x1fffffffffffffL

    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    cmp-long v0, p1, v0

    .line 478
    .line 479
    if-gez v0, :cond_24

    .line 480
    .line 481
    :cond_23
    invoke-virtual {v7}, Lcom/alibaba/fastjson/serializer/JSONSerializer;->getWriter()Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson/serializer/SerializeWriter;->writeString(Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_24
    iget-object p1, p0, Lcom/alibaba/fastjson/serializer/FieldSerializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 494
    .line 495
    iget-object v9, p1, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 496
    .line 497
    iget-object v10, p1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 498
    .line 499
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson/serializer/ObjectSerializer;->write(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    .line 500
    .line 501
    .line 502
    return-void
.end method
