.class public Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;


# instance fields
.field private final alterNameFieldDeserializers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;",
            ">;"
        }
    .end annotation
.end field

.field private final autoTypeCheckHandler:Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;

.field public final beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

.field protected final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private extraFieldDeserializers:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private fieldDeserializerMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

.field private transient hashArray:[J

.field private transient hashArrayMapping:[S

.field private transient smartMatchHashArray:[J

.field private transient smartMatchHashArrayMapping:[S

.field protected final sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;)V
    .locals 9

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget-object v0, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->clazz:Ljava/lang/Class;

    iput-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    .line 7
    iput-object p2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 8
    iget-object v0, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->jsonType:Lcom/alibaba/fastjson/annotation/JSONType;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/alibaba/fastjson/annotation/JSONType;->autoTypeCheckHandler()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;

    if-eq v0, v2, :cond_0

    .line 9
    :try_start_0
    iget-object v0, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->jsonType:Lcom/alibaba/fastjson/annotation/JSONType;

    invoke-interface {v0}, Lcom/alibaba/fastjson/annotation/JSONType;->autoTypeCheckHandler()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    iput-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->autoTypeCheckHandler:Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;

    .line 11
    iget-object v0, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->sortedFields:[Lcom/alibaba/fastjson/util/FieldInfo;

    array-length v2, v0

    new-array v2, v2, [Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    iput-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 12
    array-length v0, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v3, v0, :cond_5

    .line 13
    iget-object v4, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->sortedFields:[Lcom/alibaba/fastjson/util/FieldInfo;

    aget-object v4, v4, v3

    .line 14
    invoke-virtual {p1, p1, p2, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->createFieldDeserializer(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;Lcom/alibaba/fastjson/util/FieldInfo;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v5

    .line 15
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    aput-object v5, v6, v3

    const/16 v6, 0x80

    if-le v0, v6, :cond_2

    .line 16
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializerMap:Ljava/util/Map;

    if-nez v6, :cond_1

    .line 17
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iput-object v6, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializerMap:Ljava/util/Map;

    .line 18
    :cond_1
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializerMap:Ljava/util/Map;

    iget-object v7, v4, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    :cond_2
    iget-object v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->alternateNames:[Ljava/lang/String;

    array-length v6, v4

    move v7, v2

    :goto_2
    if-ge v7, v6, :cond_4

    aget-object v8, v4, v7

    if-nez v1, :cond_3

    .line 20
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 21
    :cond_3
    invoke-interface {v1, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 22
    :cond_5
    iput-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->alterNameFieldDeserializers:Ljava/util/Map;

    .line 23
    iget-object p1, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    array-length v0, p1

    new-array v0, v0, [Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    iput-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 24
    array-length p1, p1

    :goto_3
    if-ge v2, p1, :cond_6

    .line 25
    iget-object v0, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    aget-object v0, v0, v2

    .line 26
    iget-object v0, v0, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    aput-object v0, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/ParserConfig;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/ParserConfig;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    .line 2
    iget-object v2, p1, Lcom/alibaba/fastjson/parser/ParserConfig;->propertyNamingStrategy:Lcom/alibaba/fastjson/PropertyNamingStrategy;

    iget-boolean v3, p1, Lcom/alibaba/fastjson/parser/ParserConfig;->fieldBased:Z

    iget-boolean v4, p1, Lcom/alibaba/fastjson/parser/ParserConfig;->compatibleWithJavaBean:Z

    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/ParserConfig;->isJacksonCompatible()Z

    move-result v5

    move-object v0, p2

    move-object v1, p3

    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson/util/JavaBeanInfo;->build(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/PropertyNamingStrategy;ZZZ)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object p2

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;)V

    return-void
.end method

.method private createFactoryInstance(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public static getSeeAlso(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;
    .locals 6

    .line 1
    iget-object p1, p1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->jsonType:Lcom/alibaba/fastjson/annotation/JSONType;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {p1}, Lcom/alibaba/fastjson/annotation/JSONType;->seeAlso()[Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_3

    .line 14
    .line 15
    aget-object v3, p1, v2

    .line 16
    .line 17
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    instance-of v4, v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    check-cast v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 26
    .line 27
    iget-object v4, v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 28
    .line 29
    iget-object v5, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->typeName:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    invoke-static {p0, v4, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getSeeAlso(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return-object v0
.end method

.method public static isSetFlag(I[I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    div-int/lit8 v1, p0, 0x20

    .line 6
    .line 7
    rem-int/lit8 p0, p0, 0x20

    .line 8
    .line 9
    array-length v2, p1

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    aget p1, p1, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    shl-int p0, v1, p0

    .line 16
    .line 17
    and-int/2addr p0, p1

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    return v0
.end method

.method public static parseArray(Ljava/util/Collection;Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object p4, p2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 2
    .line 3
    check-cast p4, Lcom/alibaba/fastjson/parser/JSONLexerBase;

    .line 4
    .line 5
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    const/16 v2, 0x10

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 v1, 0xe

    .line 23
    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->throwException(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getCurrent()C

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/16 v3, 0x5b

    .line 34
    .line 35
    if-ne v0, v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->next()C

    .line 38
    .line 39
    .line 40
    invoke-virtual {p4, v1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->setToken(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p4, v1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/16 v4, 0xf

    .line 52
    .line 53
    if-ne v0, v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {p1, p2, p3, v5}, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-interface {p0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-ne v5, v2, :cond_5

    .line 78
    .line 79
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getCurrent()C

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-ne v5, v3, :cond_4

    .line 84
    .line 85
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->next()C

    .line 86
    .line 87
    .line 88
    invoke-virtual {p4, v1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->setToken(I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {p4, v1}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eq p0, v4, :cond_6

    .line 101
    .line 102
    invoke-virtual {p2, p0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->throwException(I)V

    .line 103
    .line 104
    .line 105
    :cond_6
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getCurrent()C

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    const/16 p1, 0x2c

    .line 110
    .line 111
    if-ne p0, p1, :cond_7

    .line 112
    .line 113
    invoke-virtual {p4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->next()C

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->setToken(I)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_7
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 121
    .line 122
    .line 123
    return-void
.end method


# virtual methods
.method public check(Lcom/alibaba/fastjson/parser/JSONLexer;I)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/alibaba/fastjson/parser/JSONLexer;->token()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 9
    .line 10
    const-string p2, "syntax error"

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "create instance error, class "

    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    check-cast p2, Ljava/lang/Class;

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 5
    new-instance v0, Lcom/alibaba/fastjson/JSONObject;

    invoke-direct {v0}, Lcom/alibaba/fastjson/JSONObject;-><init>()V

    .line 6
    filled-new-array {p2}, [Ljava/lang/Class;

    move-result-object p2

    invoke-static {p1, p2, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v2, v1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->defaultConstructor:Ljava/lang/reflect/Constructor;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v4, v1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    if-nez v4, :cond_1

    return-object v3

    .line 8
    :cond_1
    iget-object v4, v1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_2

    iget v5, v1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->defaultConstructorParameterSize:I

    if-lez v5, :cond_2

    return-object v3

    .line 9
    :cond_2
    :try_start_0
    iget v1, v1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->defaultConstructorParameterSize:I

    const/4 v5, 0x0

    if-nez v1, :cond_4

    if-eqz v2, :cond_3

    .line 10
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    .line 11
    :cond_3
    invoke-virtual {v4, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_1

    .line 12
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getContext()Lcom/alibaba/fastjson/parser/ParseContext;

    move-result-object v1
    :try_end_0
    .catch Lcom/alibaba/fastjson/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    const-string v4, "can\'t create non-static inner class instance."

    if-eqz v1, :cond_e

    :try_start_1
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    if-eqz v6, :cond_e

    .line 14
    instance-of v6, p2, Ljava/lang/Class;

    if-eqz v6, :cond_d

    .line 15
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const/16 v6, 0x24

    .line 16
    invoke-virtual {p2, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    .line 17
    invoke-virtual {p2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 18
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    .line 20
    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    .line 21
    iget-object v1, v1, Lcom/alibaba/fastjson/parser/ParseContext;->parent:Lcom/alibaba/fastjson/parser/ParseContext;

    if-eqz v1, :cond_6

    .line 22
    iget-object v8, v1, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    if-eqz v8, :cond_6

    const-string v8, "java.util.ArrayList"

    .line 23
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "java.util.List"

    .line 24
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "java.util.Collection"

    .line 25
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "java.util.Map"

    .line 26
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "java.util.HashMap"

    .line 27
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 28
    :cond_5
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    .line 29
    invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 30
    iget-object v3, v1, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    goto :goto_0

    :cond_6
    move-object v3, v6

    :cond_7
    :goto_0
    move-object v6, v3

    :cond_8
    if-eqz v6, :cond_c

    .line 31
    instance-of p2, v6, Ljava/util/Collection;

    if-eqz p2, :cond_9

    move-object p2, v6

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_c

    .line 32
    :cond_9
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Lcom/alibaba/fastjson/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    if-eqz p1, :cond_b

    .line 33
    iget-object p1, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    sget-object v1, Lcom/alibaba/fastjson/parser/Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson/parser/Feature;

    .line 34
    invoke-interface {p1, v1}, Lcom/alibaba/fastjson/parser/JSONLexer;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 35
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object p1, p1, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    array-length v1, p1

    :goto_2
    if-ge v5, v1, :cond_b

    aget-object v2, p1, v5

    .line 36
    iget-object v3, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    if-ne v3, v4, :cond_a

    .line 37
    :try_start_2
    const-string v3, ""

    invoke-virtual {v2, p2, v3}, Lcom/alibaba/fastjson/util/FieldInfo;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    .line 38
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_a
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_b
    return-object p2

    .line 39
    :cond_c
    :try_start_3
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    invoke-direct {p1, v4}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 40
    :cond_d
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    invoke-direct {p1, v4}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_e
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    invoke-direct {p1, v4}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lcom/alibaba/fastjson/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 42
    :goto_4
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 43
    :goto_5
    throw p1
.end method

.method public createInstance(Ljava/util/Map;Lcom/alibaba/fastjson/parser/ParserConfig;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/alibaba/fastjson/parser/ParserConfig;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 44
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v3, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v11, 0x0

    if-nez v3, :cond_13

    iget-object v3, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    if-nez v3, :cond_13

    .line 45
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v1, v11, v2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v2

    .line 46
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 47
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 48
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    .line 49
    invoke-virtual {v1, v13}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatch(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v13

    if-nez v13, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    iget-object v14, v13, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 51
    iget-object v15, v14, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    .line 52
    iget-object v9, v14, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 53
    iget-object v10, v14, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 54
    invoke-virtual {v14}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    move-result-object v17

    .line 55
    iget-object v11, v14, Lcom/alibaba/fastjson/util/FieldInfo;->declaringClass:Ljava/lang/Class;

    if-eqz v11, :cond_2

    .line 56
    invoke-virtual {v10, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    if-eqz v17, :cond_2

    .line 57
    invoke-interface/range {v17 .. v17}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    move-result-object v10

    const-class v11, Ljava/lang/Void;

    if-eq v10, v11, :cond_2

    .line 58
    :cond_1
    new-instance v10, Lcom/alibaba/fastjson/parser/DefaultJSONParser;

    invoke-static {v12}, Lcom/alibaba/fastjson/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x0

    .line 59
    invoke-virtual {v13, v10, v2, v9, v11}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    if-eqz v15, :cond_d

    .line 60
    iget-object v10, v14, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    if-nez v10, :cond_d

    .line 61
    invoke-virtual {v15}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    if-ne v10, v8, :cond_4

    .line 62
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v12, v10, :cond_3

    const/4 v10, 0x0

    .line 63
    invoke-virtual {v15, v2, v10}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    :goto_1
    const/4 v11, 0x0

    goto :goto_0

    .line 64
    :cond_3
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v12, v10, :cond_d

    const/4 v11, 0x1

    .line 65
    invoke-virtual {v15, v2, v11}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_4
    const/4 v11, 0x1

    if-ne v10, v7, :cond_5

    .line 66
    instance-of v10, v12, Ljava/lang/Number;

    if-eqz v10, :cond_d

    .line 67
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v15, v2, v9}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_5
    if-ne v10, v6, :cond_6

    .line 68
    instance-of v10, v12, Ljava/lang/Number;

    if-eqz v10, :cond_d

    .line 69
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    invoke-virtual {v15, v2, v9, v10}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_6
    const/16 v11, 0xa

    if-ne v10, v5, :cond_9

    .line 70
    instance-of v10, v12, Ljava/lang/Number;

    if-eqz v10, :cond_7

    .line 71
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-virtual {v15, v2, v9}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V

    goto :goto_1

    .line 72
    :cond_7
    instance-of v10, v12, Ljava/lang/String;

    if-eqz v10, :cond_d

    .line 73
    check-cast v12, Ljava/lang/String;

    .line 74
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v9

    if-gt v9, v11, :cond_8

    .line 75
    invoke-static {v12}, Lcom/alibaba/fastjson/util/TypeUtils;->parseFloat(Ljava/lang/String;)F

    move-result v9

    goto :goto_2

    .line 76
    :cond_8
    invoke-static {v12}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v9

    .line 77
    :goto_2
    invoke-virtual {v15, v2, v9}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V

    goto :goto_1

    :cond_9
    if-ne v10, v4, :cond_c

    .line 78
    instance-of v10, v12, Ljava/lang/Number;

    if-eqz v10, :cond_a

    .line 79
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    invoke-virtual {v15, v2, v9, v10}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V

    goto :goto_1

    .line 80
    :cond_a
    instance-of v10, v12, Ljava/lang/String;

    if-eqz v10, :cond_d

    .line 81
    check-cast v12, Ljava/lang/String;

    .line 82
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v9

    if-gt v9, v11, :cond_b

    .line 83
    invoke-static {v12}, Lcom/alibaba/fastjson/util/TypeUtils;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    goto :goto_3

    .line 84
    :cond_b
    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    .line 85
    :goto_3
    invoke-virtual {v15, v2, v9, v10}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V

    goto :goto_1

    :cond_c
    if-eqz v12, :cond_d

    .line 86
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    if-ne v9, v10, :cond_d

    .line 87
    invoke-virtual {v15, v2, v12}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 88
    :cond_d
    iget-object v10, v14, Lcom/alibaba/fastjson/util/FieldInfo;->format:Ljava/lang/String;

    if-eqz v10, :cond_e

    .line 89
    const-class v11, Ljava/util/Date;

    if-ne v9, v11, :cond_e

    .line 90
    invoke-static {v12, v10}, Lcom/alibaba/fastjson/util/TypeUtils;->castToDate(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    goto :goto_4

    :cond_e
    if-eqz v10, :cond_f

    .line 91
    instance-of v11, v9, Ljava/lang/Class;

    if-eqz v11, :cond_f

    move-object v11, v9

    check-cast v11, Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v14, "java.time.LocalDateTime"

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 92
    invoke-static {v12, v10}, Lcom/alibaba/fastjson/parser/deserializer/Jdk8DateCodec;->castToLocalDateTime(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_4

    .line 93
    :cond_f
    instance-of v10, v9, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_10

    .line 94
    check-cast v9, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v12, v9, v0}, Lcom/alibaba/fastjson/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/ParameterizedType;Lcom/alibaba/fastjson/parser/ParserConfig;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_4

    .line 95
    :cond_10
    invoke-static {v12, v9, v0}, Lcom/alibaba/fastjson/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson/parser/ParserConfig;)Ljava/lang/Object;

    move-result-object v9

    .line 96
    :goto_4
    invoke-virtual {v13, v2, v9}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 97
    :cond_11
    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_12

    const/4 v11, 0x0

    .line 98
    :try_start_0
    invoke-virtual {v0, v2, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 99
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    const-string v3, "build object error"

    invoke-direct {v2, v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_12
    return-object v2

    .line 100
    :cond_13
    iget-object v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 101
    array-length v3, v2

    .line 102
    new-array v9, v3, [Ljava/lang/Object;

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_5
    if-ge v10, v3, :cond_1e

    .line 103
    aget-object v12, v2, v10

    .line 104
    iget-object v13, v12, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    move-object/from16 v14, p1

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_1d

    .line 105
    iget-object v15, v12, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    if-ne v15, v7, :cond_14

    const/16 v16, 0x0

    .line 106
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    :goto_6
    move-object/from16 v17, v2

    goto :goto_7

    :cond_14
    const/16 v16, 0x0

    if-ne v15, v6, :cond_15

    const-wide/16 v19, 0x0

    .line 107
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    goto :goto_6

    :cond_15
    move-object/from16 v17, v2

    .line 108
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v15, v2, :cond_16

    .line 109
    invoke-static/range {v16 .. v16}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v13

    goto :goto_7

    .line 110
    :cond_16
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v15, v2, :cond_17

    .line 111
    invoke-static/range {v16 .. v16}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v13

    goto :goto_7

    :cond_17
    if-ne v15, v5, :cond_18

    const/4 v2, 0x0

    .line 112
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    goto :goto_7

    :cond_18
    if-ne v15, v4, :cond_19

    const-wide/16 v19, 0x0

    .line 113
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    goto :goto_7

    .line 114
    :cond_19
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v15, v2, :cond_1a

    const/16 v2, 0x30

    .line 115
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    goto :goto_7

    :cond_1a
    if-ne v15, v8, :cond_1b

    .line 116
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_1b
    :goto_7
    if-nez v11, :cond_1c

    .line 117
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 118
    :cond_1c
    iget-object v2, v12, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_1d
    move-object/from16 v17, v2

    const/16 v16, 0x0

    .line 119
    :goto_8
    aput-object v13, v9, v10

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v17

    goto :goto_5

    :cond_1e
    move-object/from16 v14, p1

    const/16 v16, 0x0

    if-eqz v11, :cond_20

    .line 120
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1f
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 121
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 122
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 123
    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatch(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v5

    if-eqz v5, :cond_1f

    .line 124
    iget-object v5, v5, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-object v5, v5, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_1f

    .line 125
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aput-object v4, v9, v5

    goto :goto_9

    .line 126
    :cond_20
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v4, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    if-eqz v4, :cond_28

    .line 127
    iget-boolean v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->kotlin:Z

    if-eqz v2, :cond_24

    move/from16 v2, v16

    move v10, v2

    :goto_a
    if-ge v10, v3, :cond_23

    .line 128
    aget-object v4, v9, v10

    if-nez v4, :cond_21

    .line 129
    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v4, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    if-eqz v4, :cond_22

    array-length v5, v4

    if-ge v10, v5, :cond_22

    .line 130
    aget-object v4, v4, v10

    .line 131
    iget-object v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    const-class v5, Ljava/lang/String;

    if-ne v4, v5, :cond_22

    const/4 v2, 0x1

    goto :goto_b

    .line 132
    :cond_21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v6, v6, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    aget-object v6, v6, v10

    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    if-eq v5, v6, :cond_22

    .line 133
    invoke-static {v4, v6, v0}, Lcom/alibaba/fastjson/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson/parser/ParserConfig;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v9, v10

    :cond_22
    :goto_b
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_23
    move v10, v2

    goto :goto_c

    :cond_24
    move/from16 v10, v16

    .line 134
    :goto_c
    const-string v2, "create instance error, "

    if-eqz v10, :cond_27

    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->kotlinDefaultConstructor:Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_27

    const/4 v11, 0x0

    .line 135
    :try_start_1
    invoke-virtual {v0, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v10, v16

    :goto_d
    if-ge v10, v3, :cond_26

    .line 136
    aget-object v4, v9, v10

    if-eqz v4, :cond_25

    .line 137
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v5, v5, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    if-eqz v5, :cond_25

    array-length v6, v5

    if-ge v10, v6, :cond_25

    .line 138
    aget-object v5, v5, v10

    .line 139
    invoke-virtual {v5, v0, v4}, Lcom/alibaba/fastjson/util/FieldInfo;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_e

    :catch_1
    move-exception v0

    goto :goto_f

    :cond_25
    :goto_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    :cond_26
    return-object v0

    .line 140
    :goto_f
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 141
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 142
    :cond_27
    :try_start_2
    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    .line 143
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 144
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 145
    :cond_28
    iget-object v0, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_29

    const/4 v11, 0x0

    .line 146
    :try_start_3
    invoke-virtual {v0, v11, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    :catch_3
    move-exception v0

    .line 147
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "create factory method error, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v4, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_29
    const/16 v18, 0x0

    return-object v18
.end method

.method public deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "I)TT;"
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    .line 2
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "I[I)TT;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    move-object/from16 v0, p3

    const-wide/16 v8, 0x0

    .line 3
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/4 v11, 0x0

    .line 4
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    const-wide/16 v13, 0x0

    .line 5
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    const/4 v3, 0x0

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    .line 7
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v17

    .line 8
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v18

    .line 9
    const-class v4, Lcom/alibaba/fastjson/JSON;

    if-eq v5, v4, :cond_9e

    const-class v4, Lcom/alibaba/fastjson/JSONObject;

    if-ne v5, v4, :cond_0

    goto/16 :goto_57

    .line 10
    :cond_0
    iget-object v4, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    check-cast v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;

    .line 11
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    move-result-object v6

    .line 12
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v7

    move-wide/from16 v19, v8

    const/16 v8, 0x8

    const/16 v9, 0x10

    move/from16 v21, v11

    const/4 v11, 0x0

    if-ne v7, v8, :cond_1

    .line 13
    invoke-virtual {v4, v9}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    return-object v11

    .line 14
    :cond_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getContext()Lcom/alibaba/fastjson/parser/ParseContext;

    move-result-object v8

    if-eqz p4, :cond_2

    if-eqz v8, :cond_2

    .line 15
    iget-object v8, v8, Lcom/alibaba/fastjson/parser/ParseContext;->parent:Lcom/alibaba/fastjson/parser/ParseContext;

    :cond_2
    move-wide/from16 v22, v13

    const/16 v13, 0xd

    if-ne v7, v13, :cond_4

    .line 16
    :try_start_0
    invoke-virtual {v4, v9}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    if-nez p4, :cond_3

    .line 17
    invoke-virtual/range {p0 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v3, p4

    goto/16 :goto_56

    :cond_3
    move-object/from16 v0, p4

    .line 18
    :goto_0
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v0

    :cond_4
    const/16 v14, 0xe

    if-ne v7, v14, :cond_6

    move-object/from16 v24, v11

    .line 19
    :try_start_1
    sget-object v11, Lcom/alibaba/fastjson/parser/Feature;->SupportArrayToBean:Lcom/alibaba/fastjson/parser/Feature;

    iget v13, v11, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    move/from16 v25, v3

    .line 20
    iget-object v3, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget v3, v3, Lcom/alibaba/fastjson/util/JavaBeanInfo;->parserFeatures:I

    and-int/2addr v3, v13

    if-nez v3, :cond_5

    .line 21
    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    move-result v3

    if-nez v3, :cond_5

    and-int v3, p5, v13

    if-eqz v3, :cond_7

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v3, p4

    move-object/from16 v11, v24

    goto/16 :goto_56

    .line 22
    :cond_5
    :goto_1
    invoke-virtual/range {p0 .. p4}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->deserialzeArrayMapping(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v0

    :cond_6
    move/from16 v25, v3

    move-object/from16 v24, v11

    :cond_7
    const/16 v3, 0xc

    .line 24
    const-class v13, Ljava/lang/Integer;

    const-class v11, Ljava/lang/String;

    const/4 v14, 0x1

    if-eq v7, v3, :cond_10

    if-eq v7, v9, :cond_10

    .line 25
    :try_start_2
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isBlankInput()Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v3, :cond_8

    .line 26
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v24

    :cond_8
    const/4 v3, 0x4

    if-ne v7, v3, :cond_b

    .line 27
    :try_start_3
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_9

    .line 29
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 30
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v24

    .line 31
    :cond_9
    :try_start_4
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v5, v5, Lcom/alibaba/fastjson/util/JavaBeanInfo;->jsonType:Lcom/alibaba/fastjson/annotation/JSONType;

    if-eqz v5, :cond_b

    .line 32
    invoke-interface {v5}, Lcom/alibaba/fastjson/annotation/JSONType;->seeAlso()[Ljava/lang/Class;

    move-result-object v5

    array-length v9, v5

    move/from16 v10, v25

    :goto_2
    if-ge v10, v9, :cond_b

    aget-object v12, v5, v10

    .line 33
    const-class v15, Ljava/lang/Enum;

    invoke-virtual {v15, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v15, :cond_a

    .line 34
    :try_start_5
    invoke-static {v12, v3}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 35
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v0

    :catch_0
    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_b
    const/16 v3, 0xe

    if-ne v7, v3, :cond_c

    .line 36
    :try_start_6
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getCurrent()C

    move-result v3

    const/16 v5, 0x5d

    if-ne v3, v5, :cond_c

    .line 37
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->next()C

    .line 38
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 39
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v24

    .line 40
    :cond_c
    :try_start_7
    iget-object v3, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v5, v3, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    if-eqz v5, :cond_e

    iget-object v3, v3, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    array-length v5, v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-ne v5, v14, :cond_e

    .line 41
    :try_start_8
    aget-object v3, v3, v25

    .line 42
    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    if-ne v3, v13, :cond_d

    const/4 v5, 0x2

    if-ne v7, v5, :cond_e

    .line 43
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->intValue()I

    move-result v0

    .line 44
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v6, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createFactoryInstance(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 46
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v0

    :catch_1
    move-exception v0

    goto :goto_3

    :cond_d
    if-ne v3, v11, :cond_e

    const/4 v3, 0x4

    if-ne v7, v3, :cond_e

    .line 47
    :try_start_9
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    .line 49
    invoke-direct {v1, v6, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createFactoryInstance(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 50
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v0

    .line 51
    :goto_3
    :try_start_a
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 52
    :cond_e
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "syntax error, expect {, actual "

    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->tokenName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", pos "

    .line 55
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->pos()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    instance-of v4, v0, Ljava/lang/String;

    if-eqz v4, :cond_f

    .line 58
    const-string v4, ", fieldName "

    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    :cond_f
    const-string v0, ", fastjson-version "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "1.2.75"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 63
    :cond_10
    :try_start_b
    iget v3, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->resolveStatus:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_16

    const/4 v7, 0x2

    if-ne v3, v7, :cond_11

    move/from16 v3, v25

    .line 64
    :try_start_c
    iput v3, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->resolveStatus:I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto :goto_4

    :cond_11
    move/from16 v3, v25

    .line 65
    :goto_4
    :try_start_d
    iget-object v7, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v7, v7, Lcom/alibaba/fastjson/util/JavaBeanInfo;->typeKey:Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_16

    move-object/from16 v26, p6

    move v14, v3

    move-object/from16 v30, v10

    move-object/from16 v27, v24

    move-object/from16 v28, v27

    move-object/from16 v3, p4

    move v10, v14

    .line 66
    :goto_5
    :try_start_e
    iget-object v9, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-object/from16 v31, v12

    array-length v12, v9
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_15

    if-ge v14, v12, :cond_14

    const/16 v12, 0x10

    if-ge v10, v12, :cond_14

    .line 67
    :try_start_f
    aget-object v9, v9, v14

    .line 68
    iget-object v12, v9, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    move/from16 p4, v10

    .line 69
    iget-object v10, v12, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 70
    invoke-virtual {v12}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    move-result-object v32

    if-eqz v32, :cond_12

    move-object/from16 p6, v10

    .line 71
    instance-of v10, v9, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    if-eqz v10, :cond_13

    .line 72
    move-object v10, v9

    check-cast v10, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    iget-boolean v10, v10, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->customDeserilizer:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    move/from16 v33, v10

    move-object/from16 v10, p6

    move/from16 p6, v33

    move/from16 v33, v14

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object/from16 v11, v28

    goto/16 :goto_56

    :cond_12
    move-object/from16 p6, v10

    :cond_13
    move-object/from16 v10, p6

    move/from16 v33, v14

    :goto_6
    const/16 p6, 0x0

    goto :goto_7

    :cond_14
    move/from16 p4, v10

    move/from16 v33, v14

    move-object/from16 v9, v24

    move-object v10, v9

    move-object v12, v10

    move-object/from16 v32, v12

    goto :goto_6

    .line 73
    :goto_7
    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    move-object/from16 v34, v15

    sget-object v15, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    move-object/from16 v35, v3

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    move-object/from16 v36, v6

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eqz v9, :cond_3f

    move-object/from16 v37, v7

    .line 74
    :try_start_10
    iget-object v7, v12, Lcom/alibaba/fastjson/util/FieldInfo;->name_chars:[C

    if-eqz p6, :cond_15

    .line 75
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchField([C)Z

    move-result v38

    if-eqz v38, :cond_15

    move-object/from16 v32, v13

    :goto_8
    move-object/from16 v0, v24

    const/4 v7, 0x1

    :goto_9
    const/4 v13, 0x0

    goto/16 :goto_1e

    :catchall_3
    move-exception v0

    move-object/from16 v11, v28

    :goto_a
    move-object/from16 v3, v35

    goto/16 :goto_56

    :cond_15
    if-eq v10, v6, :cond_16

    if-ne v10, v13, :cond_17

    :cond_16
    move-object/from16 v32, v13

    goto/16 :goto_1c

    :cond_17
    if-eq v10, v3, :cond_18

    .line 76
    const-class v0, Ljava/lang/Long;

    if-ne v10, v0, :cond_19

    :cond_18
    move-object/from16 v32, v13

    goto/16 :goto_1a

    :cond_19
    if-ne v10, v11, :cond_1d

    .line 77
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldString([C)Ljava/lang/String;

    move-result-object v0

    .line 78
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_1a

    :goto_b
    move-object/from16 v32, v13

    :goto_c
    const/4 v7, 0x1

    const/4 v13, 0x1

    goto/16 :goto_1e

    :cond_1a
    move-object/from16 p6, v0

    const/4 v0, -0x2

    if-ne v7, v0, :cond_1b

    :goto_d
    add-int/lit8 v10, p4, 0x1

    move-object v12, v4

    move-object/from16 v32, v13

    move-object/from16 v9, v24

    move-object/from16 p6, v36

    move-object/from16 v36, v37

    const/4 v3, 0x1

    const/16 v5, 0x10

    const/16 v6, 0xd

    const/16 v25, 0x0

    move-object v13, v11

    :goto_e
    move-object/from16 v11, p3

    goto/16 :goto_55

    :cond_1b
    move-object/from16 v0, p6

    move-object/from16 v32, v13

    :cond_1c
    :goto_f
    const/4 v7, 0x0

    goto :goto_9

    .line 79
    :cond_1d
    const-class v0, Ljava/util/Date;

    if-ne v10, v0, :cond_1f

    iget-object v0, v12, Lcom/alibaba/fastjson/util/FieldInfo;->format:Ljava/lang/String;

    if-nez v0, :cond_1f

    .line 80
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldDate([C)Ljava/util/Date;

    move-result-object v0

    .line 81
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_1e

    goto :goto_b

    :cond_1e
    move-object/from16 p6, v0

    const/4 v0, -0x2

    if-ne v7, v0, :cond_1b

    goto :goto_d

    .line 82
    :cond_1f
    const-class v0, Ljava/math/BigDecimal;

    if-ne v10, v0, :cond_21

    .line 83
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldDecimal([C)Ljava/math/BigDecimal;

    move-result-object v0

    .line 84
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_20

    goto :goto_b

    :cond_20
    move-object/from16 p6, v0

    const/4 v0, -0x2

    if-ne v7, v0, :cond_1b

    goto :goto_d

    .line 85
    :cond_21
    const-class v0, Ljava/math/BigInteger;

    if-ne v10, v0, :cond_23

    .line 86
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldBigInteger([C)Ljava/math/BigInteger;

    move-result-object v0

    .line 87
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_22

    goto :goto_b

    :cond_22
    move-object/from16 p6, v0

    const/4 v0, -0x2

    if-ne v7, v0, :cond_1b

    goto :goto_d

    :cond_23
    if-eq v10, v5, :cond_24

    .line 88
    const-class v0, Ljava/lang/Boolean;

    if-ne v10, v0, :cond_25

    :cond_24
    move-object/from16 v32, v13

    goto/16 :goto_18

    :cond_25
    if-eq v10, v15, :cond_26

    .line 89
    const-class v0, Ljava/lang/Float;

    if-ne v10, v0, :cond_27

    :cond_26
    move-object/from16 v32, v13

    goto/16 :goto_16

    :cond_27
    if-eq v10, v14, :cond_28

    .line 90
    const-class v0, Ljava/lang/Double;

    if-ne v10, v0, :cond_29

    :cond_28
    move-object/from16 v32, v13

    goto/16 :goto_14

    .line 91
    :cond_29
    invoke-virtual {v10}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 92
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v0

    instance-of v0, v0, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    if-eqz v0, :cond_2c

    if-eqz v32, :cond_2a

    .line 93
    invoke-interface/range {v32 .. v32}, Lcom/alibaba/fastjson/annotation/JSONField;->deserializeUsing()Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v32, v13

    const-class v13, Ljava/lang/Void;

    if-ne v0, v13, :cond_2d

    goto :goto_10

    :cond_2a
    move-object/from16 v32, v13

    .line 94
    :goto_10
    instance-of v0, v9, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    if-eqz v0, :cond_40

    .line 95
    move-object v0, v9

    check-cast v0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    iget-object v0, v0, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->fieldValueDeserilizer:Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 96
    invoke-virtual {v1, v4, v7, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->scanEnum(Lcom/alibaba/fastjson/parser/JSONLexerBase;[CLcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)Ljava/lang/Enum;

    move-result-object v0

    .line 97
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_2b

    goto :goto_12

    :cond_2b
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    :goto_11
    add-int/lit8 v10, p4, 0x1

    move-object v12, v4

    move-object v13, v11

    move-object/from16 v9, v24

    move-object/from16 p6, v36

    move-object/from16 v36, v37

    const/4 v3, 0x1

    const/16 v5, 0x10

    const/16 v6, 0xd

    const/16 v25, 0x0

    goto/16 :goto_e

    :cond_2c
    move-object/from16 v32, v13

    .line 98
    :cond_2d
    const-class v0, [I

    if-ne v10, v0, :cond_2f

    .line 99
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldIntArray([C)[I

    move-result-object v0

    .line 100
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_2e

    :goto_12
    goto/16 :goto_c

    :cond_2e
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    :goto_13
    goto :goto_11

    .line 101
    :cond_2f
    const-class v0, [F

    if-ne v10, v0, :cond_31

    .line 102
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldFloatArray([C)[F

    move-result-object v0

    .line 103
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_30

    goto :goto_12

    :cond_30
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto :goto_13

    .line 104
    :cond_31
    const-class v0, [[F

    if-ne v10, v0, :cond_33

    .line 105
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldFloatArray2([C)[[F

    move-result-object v0

    .line 106
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_32

    goto :goto_12

    :cond_32
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto :goto_13

    .line 107
    :cond_33
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchField([C)Z

    move-result v0

    if-eqz v0, :cond_34

    goto/16 :goto_8

    :cond_34
    move-object/from16 v39, v11

    move-object/from16 v13, v28

    move-object/from16 v7, v35

    move-object/from16 v14, v36

    move-object/from16 v5, v37

    move-object/from16 v11, p3

    goto/16 :goto_32

    .line 108
    :goto_14
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldDouble([C)D

    move-result-wide v39

    cmpl-double v0, v39, v22

    if-nez v0, :cond_35

    .line 109
    iget v0, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    const/4 v7, 0x5

    if-ne v0, v7, :cond_35

    move-object/from16 v0, v24

    goto :goto_15

    .line 110
    :cond_35
    invoke-static/range {v39 .. v40}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    .line 111
    :goto_15
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_36

    goto :goto_12

    :cond_36
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto :goto_13

    .line 112
    :goto_16
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldFloat([C)F

    move-result v0

    cmpl-float v7, v0, v21

    if-nez v7, :cond_37

    .line 113
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    const/4 v13, 0x5

    if-ne v7, v13, :cond_37

    move-object/from16 v0, v24

    goto :goto_17

    .line 114
    :cond_37
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 115
    :goto_17
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_38

    goto :goto_12

    :cond_38
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto/16 :goto_11

    .line 116
    :goto_18
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldBoolean([C)Z

    move-result v0

    .line 117
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    const/4 v13, 0x5

    if-ne v7, v13, :cond_39

    move-object/from16 v0, v24

    goto :goto_19

    .line 118
    :cond_39
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 119
    :goto_19
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_3a

    goto/16 :goto_12

    :cond_3a
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto/16 :goto_13

    .line 120
    :goto_1a
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldLong([C)J

    move-result-wide v39

    cmp-long v0, v39, v19

    if-nez v0, :cond_3b

    .line 121
    iget v0, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    const/4 v13, 0x5

    if-ne v0, v13, :cond_3b

    move-object/from16 v0, v24

    goto :goto_1b

    .line 122
    :cond_3b
    invoke-static/range {v39 .. v40}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 123
    :goto_1b
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez v7, :cond_3c

    goto/16 :goto_12

    :cond_3c
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto/16 :goto_13

    .line 124
    :goto_1c
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanFieldInt([C)I

    move-result v0

    if-nez v0, :cond_3d

    .line 125
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    const/4 v13, 0x5

    if-ne v7, v13, :cond_3d

    move-object/from16 v0, v24

    goto :goto_1d

    .line 126
    :cond_3d
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 127
    :goto_1d
    iget v7, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    if-lez v7, :cond_3e

    goto/16 :goto_12

    :cond_3e
    const/4 v13, -0x2

    if-ne v7, v13, :cond_1c

    goto/16 :goto_13

    :cond_3f
    move-object/from16 v37, v7

    move-object/from16 v32, v13

    :cond_40
    move-object/from16 v0, v24

    goto/16 :goto_f

    :goto_1e
    if-nez v7, :cond_5e

    move/from16 p6, v7

    .line 128
    :try_start_11
    iget-object v7, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->symbolTable:Lcom/alibaba/fastjson/parser/SymbolTable;

    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanSymbol(Lcom/alibaba/fastjson/parser/SymbolTable;)Ljava/lang/String;

    move-result-object v7
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    if-nez v7, :cond_42

    move/from16 v38, v13

    .line 129
    :try_start_12
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v13

    move-object/from16 v39, v11

    const/16 v11, 0xd

    if-ne v13, v11, :cond_41

    const/16 v11, 0x10

    .line 130
    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    move-object/from16 v11, p3

    move-object/from16 v37, v14

    move-object/from16 v13, v28

    move-object/from16 v7, v35

    move-object/from16 v28, v5

    goto/16 :goto_30

    :cond_41
    const/16 v11, 0x10

    if-ne v13, v11, :cond_43

    .line 131
    sget-object v11, Lcom/alibaba/fastjson/parser/Feature;->AllowArbitraryCommas:Lcom/alibaba/fastjson/parser/Feature;

    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    move-result v11
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    if-eqz v11, :cond_43

    move-object/from16 v11, p3

    move-object/from16 v13, v28

    move-object/from16 v7, v35

    move-object/from16 v14, v36

    move-object/from16 v5, v37

    goto/16 :goto_32

    :cond_42
    move-object/from16 v39, v11

    move/from16 v38, v13

    .line 132
    :cond_43
    :try_start_13
    const-string v11, "$ref"

    if-ne v11, v7, :cond_51

    if-eqz v8, :cond_51

    const/4 v11, 0x4

    .line 133
    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextTokenWithColon(I)V

    .line 134
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v0

    if-ne v0, v11, :cond_50

    .line 135
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    move-result-object v0

    .line 136
    const-string v3, "@"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    if-eqz v3, :cond_44

    .line 137
    :try_start_14
    iget-object v0, v8, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    move-object v3, v0

    :goto_1f
    const/16 v11, 0xd

    goto/16 :goto_24

    .line 138
    :cond_44
    :try_start_15
    const-string v3, ".."

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    if-eqz v3, :cond_46

    .line 139
    :try_start_16
    iget-object v3, v8, Lcom/alibaba/fastjson/parser/ParseContext;->parent:Lcom/alibaba/fastjson/parser/ParseContext;

    .line 140
    iget-object v5, v3, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    if-eqz v5, :cond_45

    :goto_20
    move-object v3, v5

    goto :goto_1f

    .line 141
    :cond_45
    new-instance v5, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;

    invoke-direct {v5, v3, v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;-><init>(Lcom/alibaba/fastjson/parser/ParseContext;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->addResolveTask(Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;)V

    const/4 v0, 0x1

    .line 142
    iput v0, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->resolveStatus:I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    goto :goto_23

    .line 143
    :cond_46
    :try_start_17
    const-string v3, "$"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    if-eqz v3, :cond_49

    move-object v3, v8

    .line 144
    :goto_21
    :try_start_18
    iget-object v5, v3, Lcom/alibaba/fastjson/parser/ParseContext;->parent:Lcom/alibaba/fastjson/parser/ParseContext;

    if-eqz v5, :cond_47

    move-object v3, v5

    goto :goto_21

    .line 145
    :cond_47
    iget-object v5, v3, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    if-eqz v5, :cond_48

    goto :goto_20

    .line 146
    :cond_48
    new-instance v5, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;

    invoke-direct {v5, v3, v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;-><init>(Lcom/alibaba/fastjson/parser/ParseContext;Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->addResolveTask(Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;)V

    const/4 v0, 0x1

    .line 147
    iput v0, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->resolveStatus:I
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    goto :goto_23

    :cond_49
    const/16 v3, 0x5c

    .line 148
    :try_start_19
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v5
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    if-lez v5, :cond_4c

    .line 149
    :try_start_1a
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x0

    .line 150
    :goto_22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_4b

    .line 151
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v3, :cond_4a

    add-int/lit8 v6, v6, 0x1

    .line 152
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 153
    :cond_4a
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v29, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_22

    .line 154
    :cond_4b
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    .line 155
    :cond_4c
    :try_start_1b
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->resolveReference(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4d

    goto :goto_1f

    .line 156
    :cond_4d
    new-instance v3, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;

    invoke-direct {v3, v8, v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;-><init>(Lcom/alibaba/fastjson/parser/ParseContext;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->addResolveTask(Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;)V

    const/4 v0, 0x1

    .line 157
    iput v0, v2, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->resolveStatus:I
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    :goto_23
    move-object/from16 v3, v35

    goto/16 :goto_1f

    .line 158
    :goto_24
    :try_start_1c
    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 159
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v0

    if-ne v0, v11, :cond_4f

    const/16 v11, 0x10

    .line 160
    invoke-virtual {v4, v11}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    move-object/from16 v11, p3

    .line 161
    invoke-virtual {v2, v8, v3, v11}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson/parser/ParseContext;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_4

    move-object/from16 v13, v28

    if-eqz v13, :cond_4e

    .line 162
    iput-object v3, v13, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    .line 163
    :cond_4e
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v3

    :catchall_4
    move-exception v0

    move-object/from16 v13, v28

    :goto_25
    move-object v11, v13

    goto/16 :goto_56

    :cond_4f
    move-object/from16 v13, v28

    .line 164
    :try_start_1d
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    const-string v4, "illegal ref"

    invoke-direct {v0, v4}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    :catchall_5
    move-exception v0

    goto :goto_25

    :catchall_6
    move-exception v0

    move-object/from16 v13, v28

    :goto_26
    move-object v11, v13

    goto/16 :goto_a

    :cond_50
    move-object/from16 v13, v28

    .line 165
    :try_start_1e
    new-instance v3, Lcom/alibaba/fastjson/JSONException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "illegal ref, "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/alibaba/fastjson/parser/JSONToken;->name(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v3

    :catchall_7
    move-exception v0

    goto :goto_26

    :cond_51
    move-object/from16 v11, p3

    move-object/from16 v13, v28

    if-eqz v37, :cond_53

    move-object/from16 v28, v5

    move-object/from16 v5, v37

    .line 166
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v37

    if-nez v37, :cond_52

    :goto_27
    move-object/from16 v37, v14

    goto :goto_29

    :cond_52
    move-object/from16 v37, v14

    :goto_28
    const/4 v0, 0x4

    goto :goto_2a

    :cond_53
    move-object/from16 v28, v5

    move-object/from16 v5, v37

    goto :goto_27

    :goto_29
    sget-object v14, Lcom/alibaba/fastjson/JSON;->DEFAULT_TYPE_KEY:Ljava/lang/String;
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    if-ne v14, v7, :cond_5d

    goto :goto_28

    .line 167
    :goto_2a
    :try_start_1f
    invoke-virtual {v4, v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextTokenWithColon(I)V

    .line 168
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v7

    if-ne v7, v0, :cond_5c

    .line 169
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->stringVal()Ljava/lang/String;

    move-result-object v0

    const/16 v12, 0x10

    .line 170
    invoke-virtual {v4, v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V

    .line 171
    iget-object v7, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v7, v7, Lcom/alibaba/fastjson/util/JavaBeanInfo;->typeName:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_54

    sget-object v7, Lcom/alibaba/fastjson/parser/Feature;->IgnoreAutoType:Lcom/alibaba/fastjson/parser/Feature;

    invoke-virtual {v2, v7}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    move-result v7

    if-eqz v7, :cond_55

    :cond_54
    move-object/from16 v7, v35

    move-object/from16 v14, v36

    goto :goto_2f

    .line 172
    :cond_55
    iget-object v3, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-object/from16 v14, v36

    invoke-static {v14, v3, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getSeeAlso(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    move-result-object v3
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_8

    if-nez v3, :cond_58

    .line 173
    :try_start_20
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    .line 174
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->autoTypeCheckHandler:Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;

    if-eqz v6, :cond_56

    .line 175
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getFeatures()I

    move-result v7

    invoke-interface {v6, v0, v3, v7}, Lcom/alibaba/fastjson/parser/ParserConfig$AutoTypeCheckHandler;->handler(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object v6

    goto :goto_2b

    :cond_56
    move-object/from16 v6, v24

    :goto_2b
    if-nez v6, :cond_57

    .line 176
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->getFeatures()I

    move-result v4

    invoke-virtual {v14, v0, v3, v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->checkAutoType(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object v3

    goto :goto_2c

    :cond_57
    move-object v3, v6

    .line 177
    :goto_2c
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v4
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_7

    move-object/from16 v42, v4

    move-object v4, v3

    move-object/from16 v3, v42

    goto :goto_2d

    :cond_58
    move-object/from16 v4, v24

    .line 178
    :goto_2d
    :try_start_21
    invoke-interface {v3, v2, v4, v11}, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 179
    instance-of v6, v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_8

    if-eqz v6, :cond_59

    .line 180
    :try_start_22
    check-cast v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    if-eqz v5, :cond_59

    .line 181
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v3

    if-eqz v3, :cond_59

    .line 182
    invoke-virtual {v3, v4, v0}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    :cond_59
    if-eqz v13, :cond_5a

    move-object/from16 v7, v35

    .line 183
    iput-object v7, v13, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    .line 184
    :cond_5a
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v4

    :catchall_8
    move-exception v0

    move-object/from16 v7, v35

    :goto_2e
    move-object v3, v7

    goto/16 :goto_25

    .line 185
    :goto_2f
    :try_start_23
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v0

    const/16 v9, 0xd

    if-ne v0, v9, :cond_5b

    .line 186
    invoke-virtual {v4}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    :goto_30
    move-object v10, v3

    move-object v14, v6

    move-object v4, v7

    move-object v5, v13

    move-object/from16 v9, v28

    move-object/from16 v0, v37

    move-object/from16 v13, v39

    :goto_31
    move-object/from16 v3, v27

    goto/16 :goto_43

    :catchall_9
    move-exception v0

    goto :goto_2e

    :cond_5b
    :goto_32
    move/from16 v10, p4

    move-object v12, v4

    move-object/from16 v36, v5

    move-object/from16 v35, v7

    move-object/from16 v28, v13

    move-object/from16 p6, v14

    move-object/from16 v9, v24

    move-object/from16 v13, v39

    const/4 v3, 0x1

    const/16 v5, 0x10

    const/16 v6, 0xd

    const/16 v25, 0x0

    goto/16 :goto_55

    :cond_5c
    move-object/from16 v7, v35

    .line 187
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    const-string v3, "syntax error"

    invoke-direct {v0, v3}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_9

    :cond_5d
    :goto_33
    move-object/from16 v14, v36

    goto :goto_34

    :cond_5e
    move/from16 p6, v7

    move-object/from16 v39, v11

    move/from16 v38, v13

    move-object/from16 v13, v28

    move-object/from16 v11, p3

    move-object/from16 v28, v5

    move-object/from16 v5, v37

    move-object/from16 v37, v14

    move-object/from16 v7, v24

    goto :goto_33

    :goto_34
    if-nez v35, :cond_61

    if-nez v27, :cond_61

    move-object/from16 v36, v5

    .line 188
    :try_start_24
    invoke-virtual/range {p0 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_d

    if-nez v5, :cond_5f

    move-object/from16 v40, v7

    .line 189
    :try_start_25
    new-instance v7, Ljava/util/HashMap;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_b

    move-object/from16 v41, v13

    :try_start_26
    iget-object v13, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v13, v13

    invoke-direct {v7, v13}, Ljava/util/HashMap;-><init>(I)V

    move-object/from16 v27, v7

    goto :goto_37

    :catchall_a
    move-exception v0

    :goto_35
    move-object v3, v5

    :goto_36
    move-object/from16 v11, v41

    goto/16 :goto_56

    :catchall_b
    move-exception v0

    move-object/from16 v41, v13

    goto :goto_35

    :cond_5f
    move-object/from16 v40, v7

    move-object/from16 v41, v13

    .line 190
    :goto_37
    invoke-virtual {v2, v8, v5, v11}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson/parser/ParseContext;

    move-result-object v7
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_a

    if-nez v26, :cond_60

    .line 191
    :try_start_27
    iget-object v13, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v13, v13

    div-int/lit8 v13, v13, 0x20

    const/16 v29, 0x1

    add-int/lit8 v13, v13, 0x1

    new-array v13, v13, [I
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_c

    move-object/from16 v41, v7

    move-object v7, v13

    :goto_38
    move-object/from16 v13, v27

    goto :goto_39

    :catchall_c
    move-exception v0

    move-object v3, v5

    move-object v11, v7

    goto/16 :goto_56

    :cond_60
    move-object/from16 v41, v7

    move-object/from16 v7, v26

    goto :goto_38

    :catchall_d
    move-exception v0

    move-object/from16 v41, v13

    move-object/from16 v3, v35

    goto :goto_36

    :cond_61
    move-object/from16 v36, v5

    move-object/from16 v40, v7

    move-object/from16 v41, v13

    move-object/from16 v7, v26

    move-object/from16 v13, v27

    move-object/from16 v5, v35

    :goto_39
    if-eqz p6, :cond_6e

    if-nez v38, :cond_62

    move-object/from16 p6, v7

    move-object/from16 v7, p2

    .line 192
    :try_start_28
    invoke-virtual {v9, v2, v5, v7, v13}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    move-object/from16 v7, p6

    move-object v10, v3

    move-object v12, v4

    move-object v4, v5

    move-object/from16 v27, v13

    move-object/from16 p6, v14

    move-object/from16 v9, v28

    move-object/from16 v0, v37

    move-object/from16 v13, v39

    :goto_3a
    move-object v14, v6

    goto/16 :goto_41

    :cond_62
    move-object/from16 p6, v7

    move-object/from16 v7, p2

    if-nez v5, :cond_64

    .line 193
    iget-object v9, v12, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-interface {v13, v9, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_a

    :cond_63
    move-object/from16 v27, v13

    move-object/from16 v0, v37

    :goto_3b
    move-object/from16 v13, v39

    goto :goto_3e

    :cond_64
    if-nez v0, :cond_67

    if-eq v10, v6, :cond_63

    if-eq v10, v3, :cond_63

    if-eq v10, v15, :cond_63

    move-object/from16 v12, v37

    if-eq v10, v12, :cond_66

    move-object/from16 v2, v28

    if-eq v10, v2, :cond_65

    .line 194
    :try_start_29
    invoke-virtual {v9, v5, v0}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_65
    move-object/from16 v28, v2

    :cond_66
    move-object v0, v12

    move-object/from16 v27, v13

    goto :goto_3b

    :catchall_e
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_35

    :cond_67
    move-object/from16 v26, v0

    move-object/from16 v27, v13

    move-object/from16 v2, v28

    move-object/from16 v0, v37

    move-object/from16 v13, v39

    if-ne v10, v13, :cond_6a

    .line 195
    sget-object v10, Lcom/alibaba/fastjson/parser/Feature;->TrimStringFieldValue:Lcom/alibaba/fastjson/parser/Feature;

    iget v10, v10, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    and-int v28, p5, v10

    if-nez v28, :cond_68

    move-object/from16 v28, v2

    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->parserFeatures:I

    and-int/2addr v2, v10

    if-nez v2, :cond_69

    iget v2, v12, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    and-int/2addr v2, v10

    if-eqz v2, :cond_6b

    goto :goto_3c

    :cond_68
    move-object/from16 v28, v2

    .line 196
    :cond_69
    :goto_3c
    move-object/from16 v2, v26

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    goto :goto_3d

    :cond_6a
    move-object/from16 v28, v2

    :cond_6b
    move-object/from16 v2, v26

    .line 197
    :goto_3d
    invoke-virtual {v9, v5, v2}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3e
    if-eqz p6, :cond_6c

    .line 198
    div-int/lit8 v2, v33, 0x20

    .line 199
    rem-int/lit8 v9, v33, 0x20

    .line 200
    aget v10, p6, v2

    const/16 v29, 0x1

    shl-int v9, v29, v9

    or-int/2addr v9, v10

    aput v9, p6, v2

    .line 201
    :cond_6c
    iget v2, v4, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    const/4 v9, 0x4

    if-ne v2, v9, :cond_6d

    move-object/from16 v2, p1

    move-object v10, v3

    move-object v4, v5

    move-object v14, v6

    move-object/from16 v9, v28

    goto/16 :goto_42

    :cond_6d
    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move-object v10, v3

    move-object v12, v4

    move-object v4, v5

    move-object/from16 p6, v14

    move-object/from16 v9, v28

    goto/16 :goto_3a

    :cond_6e
    move-object/from16 p6, v7

    move-object/from16 v27, v13

    move-object/from16 v0, v37

    move-object/from16 v13, v39

    const/4 v9, 0x4

    move-object/from16 v7, p2

    if-nez v27, :cond_6f

    .line 202
    new-instance v2, Ljava/util/HashMap;

    iget-object v10, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v10, v10

    invoke-direct {v2, v10}, Ljava/util/HashMap;-><init>(I)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_e

    move-object v12, v4

    move-object v4, v5

    move-object v5, v7

    move-object/from16 v7, p6

    move-object/from16 p6, v14

    move-object v14, v6

    move-object v6, v2

    move-object v10, v3

    move-object/from16 v9, v28

    move-object/from16 v3, v40

    move-object/from16 v2, p1

    goto :goto_3f

    :cond_6f
    move-object v12, v4

    move-object v4, v5

    move-object v5, v7

    move-object/from16 v7, p6

    move-object/from16 p6, v14

    move-object v14, v6

    move-object/from16 v6, v27

    move-object/from16 v2, p1

    move-object v10, v3

    move-object/from16 v9, v28

    move-object/from16 v3, v40

    :goto_3f
    :try_start_2a
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;[I)Z

    move-result v3

    if-nez v3, :cond_71

    .line 203
    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v3

    const/16 v5, 0xd

    if-ne v3, v5, :cond_70

    .line 204
    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken()V

    goto :goto_42

    :catchall_f
    move-exception v0

    move-object v3, v4

    goto/16 :goto_36

    :cond_70
    move v6, v5

    move-object/from16 v9, v24

    const/4 v3, 0x1

    const/16 v5, 0x10

    :goto_40
    const/16 v25, 0x0

    goto/16 :goto_54

    .line 205
    :cond_71
    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v3

    const/16 v5, 0x11

    if-eq v3, v5, :cond_9c

    .line 206
    :goto_41
    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v3

    const/16 v5, 0x10

    if-ne v3, v5, :cond_72

    move-object/from16 v9, v24

    const/4 v3, 0x1

    const/16 v6, 0xd

    goto :goto_40

    .line 207
    :cond_72
    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v3

    const/16 v6, 0xd

    if-ne v3, v6, :cond_9a

    .line 208
    invoke-virtual {v12, v5}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->nextToken(I)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_f

    :goto_42
    move-object/from16 v5, v41

    goto/16 :goto_31

    :goto_43
    if-nez v4, :cond_95

    if-nez v3, :cond_75

    .line 209
    :try_start_2b
    invoke-virtual/range {p0 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_11

    if-nez v5, :cond_73

    .line 210
    :try_start_2c
    invoke-virtual {v2, v8, v3, v11}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson/parser/ParseContext;

    move-result-object v5
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_10

    goto :goto_45

    :catchall_10
    move-exception v0

    :goto_44
    move-object v11, v5

    goto/16 :goto_56

    :cond_73
    :goto_45
    if-eqz v5, :cond_74

    .line 211
    iput-object v3, v5, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    .line 212
    :cond_74
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v3

    :catchall_11
    move-exception v0

    move-object v3, v4

    goto :goto_44

    .line 213
    :cond_75
    :try_start_2d
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v7, v6, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructorParameters:[Ljava/lang/String;

    if-eqz v7, :cond_83

    .line 214
    array-length v6, v7

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v11, 0x0

    .line 215
    :goto_46
    array-length v12, v7

    if-ge v11, v12, :cond_81

    .line 216
    aget-object v12, v7, v11

    .line 217
    invoke-interface {v3, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_13

    if-nez v12, :cond_7f

    move-object/from16 p4, v4

    .line 218
    :try_start_2e
    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-object/from16 v19, v6

    iget-object v6, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructorParameterTypes:[Ljava/lang/reflect/Type;

    aget-object v6, v6, v11

    .line 219
    iget-object v4, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    aget-object v4, v4, v11

    .line 220
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v6, v2, :cond_76

    move-object/from16 v12, v18

    goto :goto_48

    .line 221
    :cond_76
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v6, v2, :cond_77

    move-object/from16 v12, v17

    goto :goto_48

    :cond_77
    if-ne v6, v14, :cond_78

    move-object/from16 v12, v16

    goto :goto_48

    :cond_78
    if-ne v6, v10, :cond_79

    move-object/from16 v12, v30

    goto :goto_48

    :cond_79
    if-ne v6, v15, :cond_7a

    move-object/from16 v12, v31

    goto :goto_48

    :cond_7a
    if-ne v6, v0, :cond_7b

    move-object/from16 v12, v34

    goto :goto_48

    :cond_7b
    if-ne v6, v9, :cond_7c

    .line 222
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_48

    :catchall_12
    move-exception v0

    :goto_47
    move-object/from16 v2, p1

    move-object/from16 v3, p4

    goto :goto_44

    :cond_7c
    if-ne v6, v13, :cond_7d

    .line 223
    iget v2, v4, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    sget-object v4, Lcom/alibaba/fastjson/parser/Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson/parser/Feature;

    iget v4, v4, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    and-int/2addr v2, v4

    if-eqz v2, :cond_7d

    .line 224
    const-string v12, ""

    :cond_7d
    :goto_48
    move/from16 v20, v11

    :cond_7e
    const/4 v11, 0x0

    goto :goto_49

    :cond_7f
    move-object/from16 p4, v4

    move-object/from16 v19, v6

    .line 225
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructorParameterTypes:[Ljava/lang/reflect/Type;

    if-eqz v2, :cond_7d

    array-length v4, v2

    if-ge v11, v4, :cond_7d

    .line 226
    aget-object v2, v2, v11

    .line 227
    instance-of v4, v2, Ljava/lang/Class;

    if-eqz v4, :cond_7d

    .line 228
    check-cast v2, Ljava/lang/Class;

    .line 229
    invoke-virtual {v2, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7d

    .line 230
    instance-of v4, v12, Ljava/util/List;

    if-eqz v4, :cond_7d

    .line 231
    move-object v4, v12

    check-cast v4, Ljava/util/List;

    .line 232
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    move/from16 v20, v11

    const/4 v11, 0x1

    if-ne v6, v11, :cond_7e

    const/4 v11, 0x0

    .line 233
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 234
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_80

    .line 235
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 236
    :cond_80
    :goto_49
    aput-object v12, v19, v20

    add-int/lit8 v2, v20, 0x1

    move-object/from16 v4, p4

    move v11, v2

    move-object/from16 v6, v19

    move-object/from16 v2, p1

    goto/16 :goto_46

    :catchall_13
    move-exception v0

    move-object/from16 p4, v4

    goto :goto_47

    :cond_81
    move-object/from16 p4, v4

    move-object/from16 v19, v6

    :cond_82
    move-object/from16 p5, v3

    goto/16 :goto_4c

    :cond_83
    move-object/from16 p4, v4

    const/4 v11, 0x0

    .line 237
    iget-object v2, v6, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 238
    array-length v4, v2

    .line 239
    new-array v6, v4, [Ljava/lang/Object;

    move v12, v11

    :goto_4a
    if-ge v12, v4, :cond_82

    .line 240
    aget-object v11, v2, v12

    move-object/from16 v19, v2

    .line 241
    iget-object v2, v11, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_8b

    move-object/from16 p2, v2

    .line 242
    iget-object v2, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    move-object/from16 p5, v3

    .line 243
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_84

    move-object/from16 v2, v18

    goto :goto_4b

    .line 244
    :cond_84
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_85

    move-object/from16 v2, v17

    goto :goto_4b

    :cond_85
    if-ne v2, v14, :cond_86

    move-object/from16 v2, v16

    goto :goto_4b

    :cond_86
    if-ne v2, v10, :cond_87

    move-object/from16 v2, v30

    goto :goto_4b

    :cond_87
    if-ne v2, v15, :cond_88

    move-object/from16 v2, v31

    goto :goto_4b

    :cond_88
    if-ne v2, v0, :cond_89

    move-object/from16 v2, v34

    goto :goto_4b

    :cond_89
    if-ne v2, v9, :cond_8a

    .line 245
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_4b

    :cond_8a
    if-ne v2, v13, :cond_8c

    .line 246
    iget v2, v11, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    sget-object v3, Lcom/alibaba/fastjson/parser/Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson/parser/Feature;

    iget v3, v3, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_8c

    .line 247
    const-string v2, ""

    goto :goto_4b

    :cond_8b
    move-object/from16 p2, v2

    move-object/from16 p5, v3

    :cond_8c
    move-object/from16 v2, p2

    .line 248
    :goto_4b
    aput-object v2, v6, v12

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, p5

    move-object/from16 v2, v19

    const/4 v11, 0x0

    goto :goto_4a

    .line 249
    :goto_4c
    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v2, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    if-eqz v2, :cond_92

    .line 250
    iget-boolean v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->kotlin:Z

    if-eqz v0, :cond_8f

    const/4 v3, 0x0

    .line 251
    :goto_4d
    array-length v0, v6

    if-ge v3, v0, :cond_8f

    .line 252
    aget-object v0, v6, v3

    if-nez v0, :cond_8e

    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v2, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    if-eqz v2, :cond_8e

    array-length v4, v2

    if-ge v3, v4, :cond_8e

    .line 253
    aget-object v2, v2, v3

    .line 254
    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_12

    if-ne v2, v13, :cond_8f

    .line 255
    :try_start_2f
    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->kotlinDefaultConstructor:Ljava/lang/reflect/Constructor;

    if-eqz v0, :cond_8f

    move-object/from16 v2, v24

    .line 256
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2f
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_2f} :catch_3
    .catchall {:try_start_2f .. :try_end_2f} :catchall_12

    const/4 v0, 0x0

    .line 257
    :goto_4e
    :try_start_30
    array-length v2, v6

    if-ge v0, v2, :cond_90

    .line 258
    aget-object v2, v6, v0

    if-eqz v2, :cond_8d

    .line 259
    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v4, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    if-eqz v4, :cond_8d

    array-length v9, v4

    if-ge v0, v9, :cond_8d

    .line 260
    aget-object v4, v4, v0

    .line 261
    invoke-virtual {v4, v3, v2}, Lcom/alibaba/fastjson/util/FieldInfo;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_30
    .catch Ljava/lang/Exception; {:try_start_30 .. :try_end_30} :catch_2
    .catchall {:try_start_30 .. :try_end_30} :catchall_14

    goto :goto_4f

    :catchall_14
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_44

    :catch_2
    move-exception v0

    goto :goto_51

    :cond_8d
    :goto_4f
    add-int/lit8 v0, v0, 0x1

    goto :goto_4e

    :catch_3
    move-exception v0

    move-object/from16 v3, p4

    goto :goto_51

    :cond_8e
    add-int/lit8 v3, v3, 0x1

    const/16 v24, 0x0

    goto :goto_4d

    .line 262
    :cond_8f
    :try_start_31
    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_3
    .catchall {:try_start_31 .. :try_end_31} :catchall_12

    move-object v3, v0

    :cond_90
    if-eqz v7, :cond_94

    .line 263
    :try_start_32
    invoke-interface/range {p5 .. p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_91
    :goto_50
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_94

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 264
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v4

    if-eqz v4, :cond_91

    .line 265
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v3, v2}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_50

    .line 266
    :goto_51
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "create instance error, "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v6, v6, Lcom/alibaba/fastjson/util/JavaBeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 267
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_14

    .line 268
    :cond_92
    :try_start_33
    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_12

    if-eqz v0, :cond_93

    const/4 v2, 0x0

    .line 269
    :try_start_34
    invoke-virtual {v0, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_4
    .catchall {:try_start_34 .. :try_end_34} :catchall_12

    move-object v3, v0

    goto :goto_52

    :catch_4
    move-exception v0

    .line 270
    :try_start_35
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "create factory method error, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v4, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->factoryMethod:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_12

    :cond_93
    move-object/from16 v3, p4

    :cond_94
    :goto_52
    if-eqz v5, :cond_96

    .line 271
    :try_start_36
    iput-object v3, v5, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    goto :goto_53

    :cond_95
    move-object/from16 p4, v4

    move-object/from16 v3, p4

    .line 272
    :cond_96
    :goto_53
    iget-object v0, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->buildMethod:Ljava/lang/reflect/Method;
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_14

    if-nez v0, :cond_98

    if-eqz v5, :cond_97

    .line 273
    iput-object v3, v5, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    :cond_97
    move-object/from16 v2, p1

    .line 274
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v3

    :cond_98
    move-object/from16 v2, p1

    const/4 v9, 0x0

    .line 275
    :try_start_37
    invoke-virtual {v0, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_37
    .catch Ljava/lang/Exception; {:try_start_37 .. :try_end_37} :catch_5
    .catchall {:try_start_37 .. :try_end_37} :catchall_10

    if-eqz v5, :cond_99

    .line 276
    iput-object v3, v5, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    .line 277
    :cond_99
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    return-object v0

    :catch_5
    move-exception v0

    .line 278
    :try_start_38
    new-instance v4, Lcom/alibaba/fastjson/JSONException;

    const-string v6, "build object error"

    invoke-direct {v4, v6, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_10

    :cond_9a
    move-object/from16 v9, v24

    const/16 v25, 0x0

    .line 279
    :try_start_39
    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v0

    const/16 v3, 0x12

    if-eq v0, v3, :cond_9b

    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_9b

    :goto_54
    move/from16 v10, p4

    move-object/from16 v35, v4

    move-object/from16 v26, v7

    move-object/from16 v28, v41

    :goto_55
    add-int/lit8 v14, v33, 0x1

    move-object/from16 v5, p2

    move-object/from16 v6, p6

    move-object/from16 v24, v9

    move-object v0, v11

    move-object v4, v12

    move-object v11, v13

    move-object/from16 v12, v31

    move-object/from16 v13, v32

    move-object/from16 v15, v34

    move-object/from16 v3, v35

    move-object/from16 v7, v36

    goto/16 :goto_5

    .line 280
    :cond_9b
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "syntax error, unexpect token "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->token()I

    move-result v5

    invoke-static {v5}, Lcom/alibaba/fastjson/parser/JSONToken;->name(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 281
    :cond_9c
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    const-string v3, "syntax error, unexpect token \':\'"

    invoke-direct {v0, v3}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_f

    :catchall_15
    move-exception v0

    move-object/from16 v35, v3

    move-object/from16 v41, v28

    goto/16 :goto_36

    :catchall_16
    move-exception v0

    move-object/from16 v9, v24

    move-object/from16 v3, p4

    move-object v11, v9

    :goto_56
    if-eqz v11, :cond_9d

    .line 282
    iput-object v3, v11, Lcom/alibaba/fastjson/parser/ParseContext;->object:Ljava/lang/Object;

    .line 283
    :cond_9d
    invoke-virtual {v2, v8}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->setContext(Lcom/alibaba/fastjson/parser/ParseContext;)V

    .line 284
    throw v0

    .line 285
    :cond_9e
    :goto_57
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public deserialzeArrayMapping(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
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
    move-result v1

    .line 7
    const/16 v2, 0xe

    .line 8
    .line 9
    if-ne v1, v2, :cond_12

    .line 10
    .line 11
    iget-object v1, p1, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->symbolTable:Lcom/alibaba/fastjson/parser/SymbolTable;

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanTypeName(Lcom/alibaba/fastjson/parser/SymbolTable;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 24
    .line 25
    invoke-static {v3, v4, v1}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getSeeAlso(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    invoke-static {p2}, Lcom/alibaba/fastjson/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->getFeatures()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {v4, v1, v3, v5}, Lcom/alibaba/fastjson/parser/ParserConfig;->checkAutoType(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson/parser/ParserConfig;->getDeserializer(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    :cond_0
    instance-of v1, v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    check-cast v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 60
    .line 61
    invoke-virtual {v3, p1, p2, p3, p4}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->deserialzeArrayMapping(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-object p3, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 71
    .line 72
    array-length p3, p3

    .line 73
    const/4 p4, 0x0

    .line 74
    :goto_0
    const/16 v1, 0x10

    .line 75
    .line 76
    if-ge p4, p3, :cond_11

    .line 77
    .line 78
    add-int/lit8 v3, p3, -0x1

    .line 79
    .line 80
    const/16 v4, 0x5d

    .line 81
    .line 82
    if-ne p4, v3, :cond_2

    .line 83
    .line 84
    move v3, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const/16 v3, 0x2c

    .line 87
    .line 88
    :goto_1
    iget-object v5, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 89
    .line 90
    aget-object v5, v5, p4

    .line 91
    .line 92
    iget-object v6, v5, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 93
    .line 94
    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 95
    .line 96
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    if-ne v6, v7, :cond_3

    .line 99
    .line 100
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanInt(C)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_3
    const-class v7, Ljava/lang/String;

    .line 110
    .line 111
    if-ne v6, v7, :cond_4

    .line 112
    .line 113
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanString(C)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_4
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    if-ne v6, v7, :cond_5

    .line 125
    .line 126
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanLong(C)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    invoke-virtual {v5, p2, v3, v4}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;J)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_4

    .line 134
    .line 135
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Class;->isEnum()Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_9

    .line 140
    .line 141
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->getCurrent()C

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/16 v4, 0x22

    .line 146
    .line 147
    if-eq v1, v4, :cond_8

    .line 148
    .line 149
    const/16 v4, 0x6e

    .line 150
    .line 151
    if-ne v1, v4, :cond_6

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    const/16 v4, 0x30

    .line 155
    .line 156
    if-lt v1, v4, :cond_7

    .line 157
    .line 158
    const/16 v4, 0x39

    .line 159
    .line 160
    if-gt v1, v4, :cond_7

    .line 161
    .line 162
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanInt(C)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    move-object v3, v5

    .line 167
    check-cast v3, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->getFieldValueDeserilizer(Lcom/alibaba/fastjson/parser/ParserConfig;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    check-cast v3, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    .line 178
    .line 179
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;->valueOf(I)Ljava/lang/Enum;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    goto :goto_3

    .line 184
    :cond_7
    invoke-virtual {p0, v0, v3}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->scanEnum(Lcom/alibaba/fastjson/parser/JSONLexer;C)Ljava/lang/Enum;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    goto :goto_3

    .line 189
    :cond_8
    :goto_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getSymbolTable()Lcom/alibaba/fastjson/parser/SymbolTable;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v0, v6, v1, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanEnum(Ljava/lang/Class;Lcom/alibaba/fastjson/parser/SymbolTable;C)Ljava/lang/Enum;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    :goto_3
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_4

    .line 201
    .line 202
    :cond_9
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 203
    .line 204
    if-ne v6, v7, :cond_a

    .line 205
    .line 206
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanBoolean(C)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_a
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 215
    .line 216
    if-ne v6, v7, :cond_b

    .line 217
    .line 218
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanFloat(C)F

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 231
    .line 232
    if-ne v6, v7, :cond_c

    .line 233
    .line 234
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanDouble(C)D

    .line 235
    .line 236
    .line 237
    move-result-wide v3

    .line 238
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_c
    const-class v7, Ljava/util/Date;

    .line 247
    .line 248
    if-ne v6, v7, :cond_d

    .line 249
    .line 250
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->getCurrent()C

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    const/16 v8, 0x31

    .line 255
    .line 256
    if-ne v7, v8, :cond_d

    .line 257
    .line 258
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanLong(C)J

    .line 259
    .line 260
    .line 261
    move-result-wide v3

    .line 262
    new-instance v1, Ljava/util/Date;

    .line 263
    .line 264
    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_d
    const-class v7, Ljava/math/BigDecimal;

    .line 272
    .line 273
    if-ne v6, v7, :cond_e

    .line 274
    .line 275
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->scanDecimal(C)Ljava/math/BigDecimal;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v5, p2, v1}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_e
    invoke-interface {v0, v2}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 284
    .line 285
    .line 286
    iget-object v6, v5, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 287
    .line 288
    iget-object v7, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 289
    .line 290
    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {p1, v7, v6}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parseObject(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v5, p2, v6}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v0}, Lcom/alibaba/fastjson/parser/JSONLexer;->token()I

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    const/16 v6, 0xf

    .line 304
    .line 305
    if-ne v5, v6, :cond_f

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_f
    if-ne v3, v4, :cond_10

    .line 309
    .line 310
    move v1, v6

    .line 311
    :cond_10
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->check(Lcom/alibaba/fastjson/parser/JSONLexer;I)V

    .line 312
    .line 313
    .line 314
    :goto_4
    add-int/lit8 p4, p4, 0x1

    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_11
    :goto_5
    invoke-interface {v0, v1}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextToken(I)V

    .line 319
    .line 320
    .line 321
    return-object p2

    .line 322
    :cond_12
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    .line 323
    .line 324
    const-string p2, "error"

    .line 325
    .line 326
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw p1
.end method

.method public getFastMatchToken()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public getFieldDeserializer(J)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
    .locals 7

    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArray:[J

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v0, v0

    new-array v0, v0, [J

    move v2, v1

    .line 13
    :goto_0
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    .line 14
    aget-object v3, v3, v2

    iget-object v3, v3, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->sort([J)V

    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArray:[J

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArray:[J

    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result p1

    const/4 p2, 0x0

    if-gez p1, :cond_2

    return-object p2

    .line 18
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArrayMapping:[S

    const/4 v2, -0x1

    if-nez v0, :cond_5

    .line 19
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArray:[J

    array-length v0, v0

    new-array v0, v0, [S

    .line 20
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([SS)V

    .line 21
    :goto_1
    iget-object v3, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v4, v3

    if-ge v1, v4, :cond_4

    .line 22
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArray:[J

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 23
    invoke-static {v3}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64(Ljava/lang/String;)J

    move-result-wide v5

    .line 24
    invoke-static {v4, v5, v6}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v3

    if-ltz v3, :cond_3

    int-to-short v4, v1

    .line 25
    aput-short v4, v0, v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 26
    :cond_4
    iput-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArrayMapping:[S

    .line 27
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->hashArrayMapping:[S

    aget-short p1, v0, p1

    if-eq p1, v2, :cond_6

    .line 28
    iget-object p2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    aget-object p1, p2, p1

    return-object p1

    :cond_6
    return-object p2
.end method

.method public getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;[I)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object p1

    return-object p1
.end method

.method public getFieldDeserializer(Ljava/lang/String;[I)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->fieldDeserializerMap:Ljava/util/Map;

    if-eqz v1, :cond_1

    .line 3
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    if-eqz v1, :cond_1

    return-object v1

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-gt v2, v1, :cond_5

    add-int v3, v2, v1

    ushr-int/lit8 v3, v3, 0x1

    .line 5
    iget-object v4, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    aget-object v4, v4, v3

    iget-object v4, v4, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-object v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 6
    invoke-virtual {v4, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    move v2, v3

    goto :goto_0

    :cond_2
    if-lez v4, :cond_3

    add-int/lit8 v3, v3, -0x1

    move v1, v3

    goto :goto_0

    .line 7
    :cond_3
    invoke-static {v3, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->isSetFlag(I[I)Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v0

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    aget-object p1, p1, v3

    return-object p1

    .line 9
    :cond_5
    iget-object p2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->alterNameFieldDeserializers:Ljava/util/Map;

    if-eqz p2, :cond_6

    .line 10
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public getFieldType(I)Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    iget-object p1, p1, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 8
    .line 9
    return-object p1
.end method

.method public parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;[I)Z

    move-result p1

    return p1
.end method

.method public parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;[I)Z
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/DefaultJSONParser;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[I)Z"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    .line 2
    iget-object v15, v0, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->lexer:Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 3
    sget-object v2, Lcom/alibaba/fastjson/parser/Feature;->DisableFieldSmartMatch:Lcom/alibaba/fastjson/parser/Feature;

    iget v2, v2, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    .line 4
    sget-object v4, Lcom/alibaba/fastjson/parser/Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson/parser/Feature;

    iget v4, v4, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    .line 5
    invoke-interface {v15, v2}, Lcom/alibaba/fastjson/parser/JSONLexer;->isEnabled(I)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v5, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget v5, v5, Lcom/alibaba/fastjson/util/JavaBeanInfo;->parserFeatures:I

    and-int/2addr v2, v5

    if-eqz v2, :cond_0

    goto :goto_1

    .line 6
    :cond_0
    invoke-interface {v15, v4}, Lcom/alibaba/fastjson/parser/JSONLexer;->isEnabled(I)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->parserFeatures:I

    and-int/2addr v2, v4

    if-eqz v2, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v1, v3, v14}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatch(Ljava/lang/String;[I)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v2

    goto :goto_2

    .line 8
    :cond_2
    :goto_0
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatch(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v2

    goto :goto_2

    .line 9
    :cond_3
    :goto_1
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v2

    .line 10
    :goto_2
    sget-object v4, Lcom/alibaba/fastjson/parser/Feature;->SupportNonPublicField:Lcom/alibaba/fastjson/parser/Feature;

    iget v4, v4, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    const/16 v16, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_4

    .line 11
    invoke-interface {v15, v4}, Lcom/alibaba/fastjson/parser/JSONLexer;->isEnabled(I)Z

    move-result v6

    if-nez v6, :cond_5

    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->beanInfo:Lcom/alibaba/fastjson/util/JavaBeanInfo;

    iget v6, v6, Lcom/alibaba/fastjson/util/JavaBeanInfo;->parserFeatures:I

    and-int/2addr v4, v6

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    move-object/from16 v18, v2

    move/from16 v17, v5

    goto/16 :goto_a

    .line 12
    :cond_5
    :goto_3
    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->extraFieldDeserializers:Ljava/util/concurrent/ConcurrentMap;

    if-nez v4, :cond_d

    .line 13
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-direct {v4, v5, v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 14
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    :goto_4
    if-eqz v6, :cond_c

    const-class v7, Ljava/lang/Object;

    if-eq v6, v7, :cond_c

    .line 15
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    .line 16
    array-length v8, v7

    move/from16 v9, v16

    :goto_5
    if-ge v9, v8, :cond_b

    aget-object v10, v7, v9

    .line 17
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v18

    if-eqz v18, :cond_7

    :cond_6
    :goto_6
    move-object/from16 v18, v2

    goto :goto_8

    .line 19
    :cond_7
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v18

    and-int/lit8 v19, v18, 0x10

    if-nez v19, :cond_6

    and-int/lit8 v18, v18, 0x8

    if-eqz v18, :cond_8

    goto :goto_6

    :cond_8
    move-object/from16 v18, v2

    .line 20
    const-class v2, Lcom/alibaba/fastjson/annotation/JSONField;

    invoke-static {v10, v2}, Lcom/alibaba/fastjson/util/TypeUtils;->getAnnotation(Ljava/lang/reflect/Field;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lcom/alibaba/fastjson/annotation/JSONField;

    if-eqz v2, :cond_9

    .line 21
    invoke-interface {v2}, Lcom/alibaba/fastjson/annotation/JSONField;->name()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v19, v5

    .line 22
    const-string v5, ""

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    move-object v5, v2

    goto :goto_7

    :cond_9
    move-object/from16 v19, v5

    :cond_a
    move-object/from16 v5, v19

    .line 23
    :goto_7
    invoke-virtual {v4, v5, v10}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v2, v18

    const/4 v5, 0x1

    goto :goto_5

    :cond_b
    move-object/from16 v18, v2

    .line 24
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    const/4 v5, 0x1

    goto :goto_4

    :cond_c
    move-object/from16 v18, v2

    .line 25
    iput-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->extraFieldDeserializers:Ljava/util/concurrent/ConcurrentMap;

    goto :goto_9

    :cond_d
    move-object/from16 v18, v2

    .line 26
    :goto_9
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->extraFieldDeserializers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_f

    .line 27
    instance-of v4, v2, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    if-eqz v4, :cond_e

    .line 28
    check-cast v2, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    const/16 v17, 0x1

    goto :goto_b

    .line 29
    :cond_e
    move-object v7, v2

    check-cast v7, Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    .line 30
    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    move/from16 v17, v2

    .line 31
    new-instance v2, Lcom/alibaba/fastjson/util/FieldInfo;

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson/util/FieldInfo;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;III)V

    .line 32
    new-instance v4, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    move-result-object v5

    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    invoke-direct {v4, v5, v6, v2}, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;-><init>(Lcom/alibaba/fastjson/parser/ParserConfig;Ljava/lang/Class;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 33
    iget-object v2, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->extraFieldDeserializers:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v4

    goto :goto_b

    :cond_f
    const/16 v17, 0x1

    :goto_a
    move-object/from16 v2, v18

    :goto_b
    if-nez v2, :cond_19

    .line 34
    sget-object v2, Lcom/alibaba/fastjson/parser/Feature;->IgnoreNotMatch:Lcom/alibaba/fastjson/parser/Feature;

    invoke-interface {v15, v2}, Lcom/alibaba/fastjson/parser/JSONLexer;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    move-result v2

    if-eqz v2, :cond_18

    move/from16 v2, v16

    const/4 v5, -0x1

    .line 35
    :goto_c
    iget-object v6, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v7, v6

    if-ge v2, v7, :cond_15

    .line 36
    aget-object v6, v6, v2

    .line 37
    iget-object v7, v6, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 38
    iget-boolean v8, v7, Lcom/alibaba/fastjson/util/FieldInfo;->unwrapped:Z

    if-eqz v8, :cond_14

    instance-of v8, v6, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    if-eqz v8, :cond_14

    .line 39
    iget-object v8, v7, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    const-string v9, "parse unwrapped field error."

    if-eqz v8, :cond_13

    .line 40
    move-object v8, v6

    check-cast v8, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;

    .line 41
    invoke-virtual {v0}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->getConfig()Lcom/alibaba/fastjson/parser/ParserConfig;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->getFieldValueDeserilizer(Lcom/alibaba/fastjson/parser/ParserConfig;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    move-result-object v10

    .line 42
    instance-of v4, v10, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    if-eqz v4, :cond_11

    .line 43
    move-object v4, v10

    check-cast v4, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 44
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v4

    if-eqz v4, :cond_14

    .line 45
    :try_start_0
    iget-object v5, v7, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v5, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_10

    .line 46
    check-cast v10, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    iget-object v5, v7, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    invoke-virtual {v10, v0, v5}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->createInstance(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    .line 47
    invoke-virtual {v6, v11, v5}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_d

    :catch_0
    move-exception v0

    goto :goto_e

    .line 48
    :cond_10
    :goto_d
    invoke-virtual {v8}, Lcom/alibaba/fastjson/parser/deserializer/DefaultFieldDeserializer;->getFastMatchToken()I

    move-result v6

    invoke-interface {v15, v6}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextTokenWithColon(I)V

    .line 49
    invoke-virtual {v4, v0, v5, v12, v13}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_11

    .line 50
    :goto_e
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    invoke-direct {v2, v9, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 51
    :cond_11
    instance-of v4, v10, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    if-eqz v4, :cond_14

    .line 52
    check-cast v10, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;

    .line 53
    :try_start_1
    iget-object v4, v7, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v4, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    if-nez v4, :cond_12

    .line 54
    iget-object v4, v7, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    invoke-virtual {v10, v4}, Lcom/alibaba/fastjson/parser/deserializer/MapDeserializer;->createMap(Ljava/lang/reflect/Type;)Ljava/util/Map;

    move-result-object v4

    .line 55
    invoke-virtual {v6, v11, v4}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->setValue(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_f

    :catch_1
    move-exception v0

    goto :goto_10

    .line 56
    :cond_12
    :goto_f
    invoke-interface {v15}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextTokenWithColon()V

    .line 57
    invoke-virtual/range {p1 .. p2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 58
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_11

    .line 59
    :goto_10
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    invoke-direct {v2, v9, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 60
    :cond_13
    iget-object v4, v7, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    const/4 v6, 0x2

    if-ne v4, v6, :cond_14

    .line 61
    invoke-interface {v15}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextTokenWithColon()V

    .line 62
    invoke-virtual/range {p1 .. p2}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 63
    :try_start_2
    iget-object v5, v7, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v11, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :goto_11
    move v5, v2

    goto :goto_12

    :catch_2
    move-exception v0

    .line 64
    new-instance v2, Lcom/alibaba/fastjson/JSONException;

    invoke-direct {v2, v9, v0}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_14
    :goto_12
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_c

    :cond_15
    const/4 v2, -0x1

    if-eq v5, v2, :cond_17

    if-eqz v14, :cond_16

    .line 65
    div-int/lit8 v0, v5, 0x20

    .line 66
    rem-int/lit8 v5, v5, 0x20

    .line 67
    aget v2, v14, v0

    shl-int v3, v17, v5

    or-int/2addr v2, v3

    aput v2, v14, v0

    :cond_16
    return v17

    .line 68
    :cond_17
    invoke-virtual {v0, v11, v3}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parseExtra(Ljava/lang/Object;Ljava/lang/String;)V

    return v16

    .line 69
    :cond_18
    new-instance v0, Lcom/alibaba/fastjson/JSONException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setter not found, class "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->clazz:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", property "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    move/from16 v4, v16

    .line 70
    :goto_13
    iget-object v5, v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v6, v5

    if-ge v4, v6, :cond_1b

    .line 71
    aget-object v5, v5, v4

    if-ne v5, v2, :cond_1a

    :goto_14
    const/4 v5, -0x1

    goto :goto_15

    :cond_1a
    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    :cond_1b
    const/4 v4, -0x1

    goto :goto_14

    :goto_15
    if-eq v4, v5, :cond_1c

    if-eqz v14, :cond_1c

    .line 72
    const-string v5, "_"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 73
    invoke-static {v4, v14}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->isSetFlag(I[I)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 74
    invoke-virtual {v0, v11, v3}, Lcom/alibaba/fastjson/parser/DefaultJSONParser;->parseExtra(Ljava/lang/Object;Ljava/lang/String;)V

    return v16

    .line 75
    :cond_1c
    invoke-virtual {v2}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->getFastMatchToken()I

    move-result v3

    invoke-interface {v15, v3}, Lcom/alibaba/fastjson/parser/JSONLexer;->nextTokenWithColon(I)V

    .line 76
    invoke-virtual {v2, v0, v11, v12, v13}, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->parseField(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    if-eqz v14, :cond_1d

    .line 77
    div-int/lit8 v0, v4, 0x20

    .line 78
    rem-int/lit8 v4, v4, 0x20

    .line 79
    aget v2, v14, v0

    shl-int v3, v17, v4

    or-int/2addr v2, v3

    aput v2, v14, v0

    :cond_1d
    return v17
.end method

.method public parseRest(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    .line 1
    new-array v7, v0, [I

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->parseRest(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public parseRest(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->deserialze(Lcom/alibaba/fastjson/parser/DefaultJSONParser;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public scanEnum(Lcom/alibaba/fastjson/parser/JSONLexer;C)Ljava/lang/Enum;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/JSONLexer;",
            "C)",
            "Ljava/lang/Enum<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance p2, Lcom/alibaba/fastjson/JSONException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "illegal enum. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/alibaba/fastjson/parser/JSONLexer;->info()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public scanEnum(Lcom/alibaba/fastjson/parser/JSONLexerBase;[CLcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;)Ljava/lang/Enum;
    .locals 6

    .line 2
    instance-of v0, p3, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    check-cast p3, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    goto :goto_0

    :cond_0
    move-object p3, v1

    :goto_0
    if-nez p3, :cond_1

    const/4 p2, -0x1

    .line 4
    iput p2, p1, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    return-object v1

    .line 5
    :cond_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->scanEnumSymbol([C)J

    move-result-wide v2

    .line 6
    iget p2, p1, Lcom/alibaba/fastjson/parser/JSONLexerBase;->matchStat:I

    if-lez p2, :cond_5

    .line 7
    invoke-virtual {p3, v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;->getEnumByHashCode(J)Ljava/lang/Enum;

    move-result-object p2

    if-nez p2, :cond_4

    const-wide v4, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    return-object v1

    .line 8
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson/parser/Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson/parser/Feature;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/JSONLexerBase;->isEnabled(Lcom/alibaba/fastjson/parser/Feature;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 9
    :cond_3
    new-instance p1, Lcom/alibaba/fastjson/JSONException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "not match enum value, "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p3, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;->enumClass:Ljava/lang/Class;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-object p2

    :cond_5
    return-object v1
.end method

.method public smartMatch(Ljava/lang/String;)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatch(Ljava/lang/String;[I)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object p1

    return-object p1
.end method

.method public smartMatch(Ljava/lang/String;[I)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->getFieldDeserializer(Ljava/lang/String;[I)Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    move-result-object v1

    if-nez v1, :cond_b

    .line 3
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    const/4 v3, 0x0

    if-nez v2, :cond_2

    .line 4
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v2, v2

    new-array v2, v2, [J

    move v4, v3

    .line 5
    :goto_0
    iget-object v5, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v6, v5

    if-ge v4, v6, :cond_1

    .line 6
    aget-object v5, v5, v4

    iget-object v5, v5, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-wide v5, v5, Lcom/alibaba/fastjson/util/FieldInfo;->nameHashCode:J

    aput-wide v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->sort([J)V

    .line 8
    iput-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    .line 9
    :cond_2
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64_lower(Ljava/lang/String;)J

    move-result-wide v4

    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    invoke-static {v2, v4, v5}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v2

    if-gez v2, :cond_3

    .line 11
    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64_extract(Ljava/lang/String;)J

    move-result-wide v4

    .line 12
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    invoke-static {v2, v4, v5}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v2

    :cond_3
    if-gez v2, :cond_4

    .line 13
    const-string v4, "is"

    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v2, 0x2

    .line 14
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/fastjson/util/TypeUtils;->fnv1a_64_extract(Ljava/lang/String;)J

    move-result-wide v5

    .line 15
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    invoke-static {p1, v5, v6}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v2

    goto :goto_1

    :cond_4
    move v4, v3

    :cond_5
    :goto_1
    if-ltz v2, :cond_9

    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArrayMapping:[S

    const/4 v5, -0x1

    if-nez p1, :cond_8

    .line 17
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    array-length p1, p1

    new-array p1, p1, [S

    .line 18
    invoke-static {p1, v5}, Ljava/util/Arrays;->fill([SS)V

    .line 19
    :goto_2
    iget-object v6, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    array-length v7, v6

    if-ge v3, v7, :cond_7

    .line 20
    iget-object v7, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArray:[J

    aget-object v6, v6, v3

    iget-object v6, v6, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    iget-wide v8, v6, Lcom/alibaba/fastjson/util/FieldInfo;->nameHashCode:J

    invoke-static {v7, v8, v9}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v6

    if-ltz v6, :cond_6

    int-to-short v7, v3

    .line 21
    aput-short v7, p1, v6

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 22
    :cond_7
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArrayMapping:[S

    .line 23
    :cond_8
    iget-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->smartMatchHashArrayMapping:[S

    aget-short p1, p1, v2

    if-eq p1, v5, :cond_9

    .line 24
    invoke-static {p1, p2}, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->isSetFlag(I[I)Z

    move-result p2

    if-nez p2, :cond_9

    .line 25
    iget-object p2, p0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;->sortedFieldDeserializers:[Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    aget-object v1, p2, p1

    :cond_9
    if-eqz v1, :cond_b

    .line 26
    iget-object p1, v1, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;->fieldInfo:Lcom/alibaba/fastjson/util/FieldInfo;

    .line 27
    iget p2, p1, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    sget-object v2, Lcom/alibaba/fastjson/parser/Feature;->DisableFieldSmartMatch:Lcom/alibaba/fastjson/parser/Feature;

    iget v2, v2, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    and-int/2addr p2, v2

    if-eqz p2, :cond_a

    return-object v0

    .line 28
    :cond_a
    iget-object p1, p1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    if-eqz v4, :cond_b

    .line 29
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_b

    const-class p2, Ljava/lang/Boolean;

    if-eq p1, p2, :cond_b

    return-object v0

    :cond_b
    return-object v1
.end method
