.class public Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/asm/Opcodes;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;
    }
.end annotation


# static fields
.field static final DefaultJSONParser:Ljava/lang/String;

.field static final JSONLexerBase:Ljava/lang/String;


# instance fields
.field public final classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

.field protected final seed:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson/parser/DefaultJSONParser;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 8
    .line 9
    const-class v0, Lcom/alibaba/fastjson/parser/JSONLexerBase;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->seed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    instance-of v0, p1, Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson/util/ASMClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v0

    .line 24
    :goto_0
    iput-object p1, p0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 25
    .line 26
    return-void
.end method

.method private _batchSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_batchSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Z)V

    return-void
.end method

.method private _batchSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Z)V
    .locals 4

    .line 2
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 3
    new-instance v2, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v2}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    if-eqz p3, :cond_0

    .line 4
    invoke-direct {p0, p2, p1, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_isFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;ILcom/alibaba/fastjson/asm/Label;)V

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v3

    aget-object v3, v3, v1

    .line 6
    invoke-direct {p0, p1, p2, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_loadAndSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    if-eqz p3, :cond_1

    .line 7
    invoke-interface {p2, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private _createInstance(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V
    .locals 8

    .line 15
    invoke-static {p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$000(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object v0

    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->defaultConstructor:Ljava/lang/reflect/Constructor;

    .line 16
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "(L"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x1

    const-string v4, "createInstance"

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    invoke-virtual {p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->getInstClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0xbb

    invoke-interface {v1, v0, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 p1, 0x59

    .line 19
    invoke-interface {v1, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 20
    invoke-virtual {p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->getInstClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "<init>"

    const-string v0, "()V"

    const/16 v2, 0xb7

    invoke-interface {v1, v2, p1, p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xb0

    .line 21
    invoke-interface {v1, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    const/4 p1, 0x3

    .line 22
    invoke-interface {v1, p1, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 23
    invoke-interface {v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    return-void
.end method

.method private _createInstance(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$000(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object v0

    .line 2
    iget-object v0, v0, Lcom/alibaba/fastjson/util/JavaBeanInfo;->defaultConstructor:Ljava/lang/reflect/Constructor;

    .line 3
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    const-string v2, "instance"

    const/16 v3, 0x3a

    const/16 v4, 0xb7

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->getInstClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0xbb

    invoke-interface {p2, v5, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v1, 0x59

    .line 5
    invoke-interface {p2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 6
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    const-string v5, "()V"

    invoke-interface {p2, v4, v0, v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p2, v3, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    return-void

    :cond_0
    const/16 v0, 0x19

    const/4 v1, 0x0

    .line 8
    invoke-interface {p2, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v5, 0x1

    .line 9
    invoke-interface {p2, v0, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 10
    invoke-interface {p2, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 11
    const-class v0, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "clazz"

    const-string v6, "Ljava/lang/Class;"

    const/16 v7, 0xb4

    invoke-interface {p2, v7, v1, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "(L"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "createInstance"

    invoke-interface {p2, v4, v0, v5, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->getInstClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc0

    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 14
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p2, v3, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    return-void
.end method

.method private _deserObject(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-direct/range {p0 .. p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_getFieldDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 11
    .line 12
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    .line 16
    .line 17
    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 18
    .line 19
    .line 20
    iget v5, v2, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    .line 21
    .line 22
    sget-object v6, Lcom/alibaba/fastjson/parser/Feature;->SupportArrayToBean:Lcom/alibaba/fastjson/parser/Feature;

    .line 23
    .line 24
    iget v6, v6, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    .line 25
    .line 26
    and-int/2addr v5, v6

    .line 27
    const-string v6, "_asm"

    .line 28
    .line 29
    const-string v8, "(L"

    .line 30
    .line 31
    const-string v9, "deserialze"

    .line 32
    .line 33
    const-string v10, "(I)Ljava/lang/reflect/Type;"

    .line 34
    .line 35
    const-string v11, "getFieldType"

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v13, 0x1

    .line 39
    const/16 v15, 0xc0

    .line 40
    .line 41
    const/16 v7, 0x19

    .line 42
    .line 43
    const-class v16, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    const/16 v5, 0x59

    .line 48
    .line 49
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 50
    .line 51
    .line 52
    const/16 v5, 0xc1

    .line 53
    .line 54
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v14

    .line 58
    invoke-interface {v1, v5, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/16 v5, 0x99

    .line 62
    .line 63
    invoke-interface {v1, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 64
    .line 65
    .line 66
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-interface {v1, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, v7, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 74
    .line 75
    .line 76
    iget-object v5, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 77
    .line 78
    instance-of v5, v5, Ljava/lang/Class;

    .line 79
    .line 80
    if-eqz v5, :cond_0

    .line 81
    .line 82
    iget-object v5, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v5}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-interface {v1, v7, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 97
    .line 98
    .line 99
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const/16 v14, 0xb6

    .line 111
    .line 112
    invoke-interface {v1, v14, v5, v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :goto_0
    iget-object v5, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget v5, v2, Lcom/alibaba/fastjson/util/FieldInfo;->parserFeatures:I

    .line 121
    .line 122
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    new-instance v14, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    sget-object v12, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v12, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"

    .line 147
    .line 148
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    const/16 v14, 0xb6

    .line 156
    .line 157
    invoke-interface {v1, v14, v5, v9, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-static/range {p4 .. p4}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-interface {v1, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v5, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    iget-object v12, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    const/16 v12, 0x3a

    .line 189
    .line 190
    invoke-interface {v1, v12, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 191
    .line 192
    .line 193
    const/16 v5, 0xa7

    .line 194
    .line 195
    invoke-interface {v1, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 199
    .line 200
    .line 201
    :cond_1
    invoke-interface {v1, v7, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 202
    .line 203
    .line 204
    iget-object v3, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 205
    .line 206
    instance-of v3, v3, Ljava/lang/Class;

    .line 207
    .line 208
    if-eqz v3, :cond_2

    .line 209
    .line 210
    iget-object v3, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 211
    .line 212
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    invoke-static {v3}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-interface {v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_2
    const/4 v3, 0x0

    .line 225
    invoke-interface {v1, v7, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 226
    .line 227
    .line 228
    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-interface {v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    const/16 v14, 0xb6

    .line 240
    .line 241
    invoke-interface {v1, v14, v3, v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :goto_1
    iget-object v3, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 245
    .line 246
    invoke-interface {v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    const-class v3, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 250
    .line 251
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    new-instance v5, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    sget-object v7, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string v7, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 269
    .line 270
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    const/16 v7, 0xb9

    .line 278
    .line 279
    invoke-interface {v1, v7, v3, v9, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-static/range {p4 .. p4}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-interface {v1, v15, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 287
    .line 288
    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    const/16 v12, 0x3a

    .line 311
    .line 312
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method private _deserialize_endCheck(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 4

    .line 1
    const-string v0, "matchedCount"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x9e

    .line 13
    .line 14
    invoke-interface {p2, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "lexer"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x19

    .line 24
    .line 25
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "token"

    .line 31
    .line 32
    const-string v2, "()I"

    .line 33
    .line 34
    const/16 v3, 0xb6

    .line 35
    .line 36
    invoke-interface {p2, v3, v0, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0xd

    .line 40
    .line 41
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/16 v0, 0xa0

    .line 49
    .line 50
    invoke-interface {p2, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_quickNextTokenComma(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private _deserialze(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v8, 0x4

    .line 1
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 2
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v2

    array-length v2, v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v2

    array-length v3, v2

    const/4 v10, 0x0

    move v4, v10

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, v2, v4

    .line 4
    iget-object v6, v5, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 5
    iget-object v5, v5, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 6
    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    const-class v7, Ljava/util/Collection;

    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 8
    instance-of v6, v5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_2

    .line 9
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    aget-object v5, v5, v10

    .line 10
    instance-of v5, v5, Ljava/lang/Class;

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    return-void

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 11
    :cond_4
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$000(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object v2

    .line 12
    iget-object v3, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->sortedFields:[Lcom/alibaba/fastjson/util/FieldInfo;

    invoke-static {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$202(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;[Lcom/alibaba/fastjson/util/FieldInfo;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 13
    new-instance v11, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "(L"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v13, 0x1

    const-string v14, "deserialze"

    move-object/from16 v12, p1

    invoke-direct/range {v11 .. v17}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 14
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 15
    new-instance v12, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v12}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 16
    new-instance v13, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v13}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 17
    new-instance v14, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v14}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 18
    invoke-direct {v0, v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->defineVarLexer(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    .line 19
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 20
    const-string v15, "lexer"

    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x19

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 21
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v10, "token"

    const-string v8, "()I"

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v6, v10, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v8, 0xe

    .line 22
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v8, 0xa0

    .line 23
    invoke-interface {v11, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 24
    iget v2, v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->parserFeatures:I

    sget-object v10, Lcom/alibaba/fastjson/parser/Feature;->SupportArrayToBean:Lcom/alibaba/fastjson/parser/Feature;

    iget v8, v10, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    and-int/2addr v2, v8

    const/16 v8, 0x15

    if-nez v2, :cond_5

    .line 25
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x19

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x4

    .line 26
    invoke-interface {v11, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 27
    iget v2, v10, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 28
    const-string v2, "isEnabled"

    const-string v7, "(II)Z"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x99

    .line 29
    invoke-interface {v11, v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    :cond_5
    const/4 v2, 0x0

    const/16 v7, 0x19

    .line 30
    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v10, 0x1

    .line 31
    invoke-interface {v11, v7, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x2

    .line 32
    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v8, 0x3

    .line 33
    invoke-interface {v11, v7, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 34
    invoke-interface {v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 35
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "(L"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0xb7

    .line 36
    const-string v10, "deserialzeArrayMapping"

    invoke-interface {v11, v8, v7, v10, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xb0

    .line 37
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 38
    invoke-interface {v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 39
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x19

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 40
    sget-object v2, Lcom/alibaba/fastjson/parser/Feature;->SortFeidFastMatch:Lcom/alibaba/fastjson/parser/Feature;

    iget v2, v2, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 41
    const-string v2, "isEnabled"

    const-string v5, "(I)Z"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    new-instance v2, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v2}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    const/16 v5, 0x9a

    .line 43
    invoke-interface {v11, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/16 v5, 0xc8

    .line 44
    invoke-interface {v11, v5, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 45
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 46
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x19

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 47
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$400(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 48
    const-string v2, "scanType"

    const-string v5, "(Ljava/lang/String;)I"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, -0x1

    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 50
    new-instance v2, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v2}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    const/16 v5, 0xa0

    .line 51
    invoke-interface {v11, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/16 v5, 0xc8

    .line 52
    invoke-interface {v11, v5, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 53
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/4 v2, 0x1

    const/16 v7, 0x19

    .line 54
    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "()"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "getContext"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v4, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    const-string v2, "mark_context"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v8, 0x3a

    invoke-interface {v11, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x3

    .line 57
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 58
    const-string v2, "matchedCount"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v10, 0x36

    invoke-interface {v11, v10, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 59
    invoke-direct {v0, v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_createInstance(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    const/4 v2, 0x1

    const/16 v7, 0x19

    .line 60
    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "()"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "getContext"

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v4, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v2, "context"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v11, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x1

    const/16 v7, 0x19

    .line 63
    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 64
    const-string v2, "context"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 65
    const-string v2, "instance"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v2, 0x3

    .line 66
    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 67
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "("

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 68
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Ljava/lang/Object;Ljava/lang/Object;)"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 69
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 70
    const-string v5, "setContext"

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v4, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    const-string v2, "childContext"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v11, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 72
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x19

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0xb4

    .line 73
    const-string v4, "matchStat"

    const-string v5, "I"

    invoke-interface {v11, v2, v6, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-interface {v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v6, 0x9f

    .line 75
    invoke-interface {v11, v6, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v6, 0x3

    .line 76
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 77
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v11, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    .line 78
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v7

    array-length v7, v7

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v7, :cond_6

    .line 79
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "_asm_flag_"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    div-int/lit8 v8, v2, 0x20

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v11, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    add-int/lit8 v2, v2, 0x20

    const/4 v6, 0x3

    const/16 v8, 0x3a

    goto :goto_3

    .line 81
    :cond_6
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x19

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 82
    sget-object v2, Lcom/alibaba/fastjson/parser/Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson/parser/Feature;

    iget v2, v2, Lcom/alibaba/fastjson/parser/Feature;->mask:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 83
    sget-object v2, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "isEnabled"

    const-string v8, "(I)Z"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v2, v6, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    const-string v2, "initStringFieldAsEmpty"

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x36

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    const/4 v2, 0x0

    .line 85
    :goto_4
    const-string v8, "_asm"

    if-ge v2, v7, :cond_d

    .line 86
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v6

    aget-object v6, v6, v2

    .line 87
    iget-object v10, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    move-object/from16 v19, v12

    .line 88
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v10, v12, :cond_7

    sget-object v12, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v10, v12, :cond_7

    sget-object v12, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v10, v12, :cond_7

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v10, v12, :cond_8

    :cond_7
    move/from16 v23, v2

    move-object/from16 v24, v9

    move-object/from16 v21, v13

    move-object/from16 v22, v14

    const/4 v2, 0x3

    goto/16 :goto_7

    .line 89
    :cond_8
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v10, v12, :cond_9

    const/16 v10, 0x9

    .line 90
    invoke-interface {v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 91
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x2

    invoke-virtual {v1, v6, v8}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    move-result v6

    const/16 v8, 0x37

    invoke-interface {v11, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    :goto_5
    move/from16 v23, v2

    move-object/from16 v24, v9

    move-object/from16 v21, v13

    move-object/from16 v22, v14

    goto/16 :goto_8

    .line 92
    :cond_9
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v10, v12, :cond_a

    const/16 v10, 0xb

    .line 93
    invoke-interface {v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 94
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v8, 0x38

    invoke-interface {v11, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_5

    .line 95
    :cond_a
    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v10, v12, :cond_b

    const/16 v10, 0xe

    .line 96
    invoke-interface {v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 97
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x2

    invoke-virtual {v1, v6, v8}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    move-result v6

    const/16 v8, 0x39

    invoke-interface {v11, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_5

    .line 98
    :cond_b
    const-class v12, Ljava/lang/String;

    if-ne v10, v12, :cond_c

    .line 99
    new-instance v12, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v12}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    move-object/from16 v20, v10

    .line 100
    new-instance v10, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v10}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    move-object/from16 v21, v13

    .line 101
    const-string v13, "initStringFieldAsEmpty"

    invoke-virtual {v1, v13}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    move-object/from16 v22, v14

    const/16 v14, 0x15

    invoke-interface {v11, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v13, 0x99

    .line 102
    invoke-interface {v11, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 103
    invoke-direct {v0, v11, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_setFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;I)V

    .line 104
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x19

    invoke-interface {v11, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 105
    sget-object v13, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v14, "stringDefaultValue"

    move/from16 v23, v2

    const-string v2, "()Ljava/lang/String;"

    move-object/from16 v24, v9

    const/16 v9, 0xb6

    invoke-interface {v11, v9, v13, v14, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xa7

    .line 106
    invoke-interface {v11, v2, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 107
    invoke-interface {v11, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/4 v2, 0x1

    .line 108
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 109
    invoke-interface {v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto :goto_6

    :cond_c
    move/from16 v23, v2

    move-object/from16 v24, v9

    move-object/from16 v20, v10

    move-object/from16 v21, v13

    move-object/from16 v22, v14

    const/4 v2, 0x1

    .line 110
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    :goto_6
    const/16 v2, 0xc0

    .line 111
    invoke-static/range {v20 .. v20}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v11, v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 112
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x3a

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_8

    .line 113
    :goto_7
    invoke-interface {v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x36

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    :goto_8
    add-int/lit8 v2, v23, 0x1

    move-object/from16 v12, v19

    move-object/from16 v13, v21

    move-object/from16 v14, v22

    move-object/from16 v9, v24

    goto/16 :goto_4

    :cond_d
    move-object/from16 v19, v12

    move-object/from16 v21, v13

    const/4 v6, 0x0

    :goto_9
    move-object/from16 v24, v9

    move-object/from16 v22, v14

    if-ge v6, v7, :cond_28

    .line 115
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    move-result-object v2

    aget-object v2, v2, v6

    .line 116
    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 117
    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 118
    new-instance v12, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v12}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 119
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v14, "[C"

    move/from16 v20, v7

    const-string v7, "_asm_prefix__"

    if-ne v9, v13, :cond_e

    .line 120
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v10, 0x19

    invoke-interface {v11, v10, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 121
    invoke-interface {v11, v10, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 122
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v9, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    sget-object v7, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v9, "scanFieldBoolean"

    const-string v10, "([C)Z"

    const/16 v13, 0xb6

    invoke-interface {v11, v13, v7, v9, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x36

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move-object/from16 v26, v3

    move/from16 v27, v6

    move-object/from16 v25, v12

    :goto_a
    const/4 v3, 0x2

    :goto_b
    const/16 v9, 0x3a

    :goto_c
    const/16 v10, 0xb6

    goto/16 :goto_e

    .line 125
    :cond_e
    sget-object v13, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    move-object/from16 v23, v10

    const-string v10, "([C)I"

    move-object/from16 v25, v12

    const-string v12, "scanFieldInt"

    if-ne v9, v13, :cond_f

    .line 126
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v13, 0x19

    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 127
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 128
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v9

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v26, v3

    iget-object v3, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v9, v3, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x36

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move/from16 v27, v6

    goto :goto_a

    :cond_f
    move-object/from16 v26, v3

    .line 131
    const-class v3, Ljava/lang/Byte;

    const-string v13, "valueOf"

    move/from16 v27, v6

    if-ne v9, v3, :cond_10

    .line 132
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v9, 0x19

    invoke-interface {v11, v9, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x0

    .line 133
    invoke-interface {v11, v9, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 134
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v6, "java/lang/Byte"

    const-string v7, "(B)Ljava/lang/Byte;"

    const/16 v9, 0xb8

    invoke-interface {v11, v9, v6, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 138
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 139
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v13, 0x19

    invoke-interface {v11, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xb4

    .line 140
    invoke-interface {v11, v7, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    .line 141
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 142
    invoke-interface {v11, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 143
    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 144
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 145
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_a

    .line 146
    :cond_10
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v9, v3, :cond_11

    .line 147
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v13, 0x19

    invoke-interface {v11, v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 148
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 149
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x36

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_a

    .line 152
    :cond_11
    const-class v3, Ljava/lang/Short;

    if-ne v9, v3, :cond_12

    .line 153
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v6, 0x19

    invoke-interface {v11, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 154
    invoke-interface {v11, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 155
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-string v6, "java/lang/Short"

    const-string v7, "(S)Ljava/lang/Short;"

    const/16 v9, 0xb8

    invoke-interface {v11, v9, v6, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 159
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 160
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v13, 0x19

    invoke-interface {v11, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xb4

    .line 161
    invoke-interface {v11, v7, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    .line 162
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 163
    invoke-interface {v11, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 164
    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 166
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_a

    .line 167
    :cond_12
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v9, v3, :cond_13

    .line 168
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v13, 0x19

    invoke-interface {v11, v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 169
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 170
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x36

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_a

    .line 173
    :cond_13
    const-class v3, Ljava/lang/Integer;

    if-ne v9, v3, :cond_14

    .line 174
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v6, 0x19

    invoke-interface {v11, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 175
    invoke-interface {v11, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 176
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb6

    invoke-interface {v11, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string v6, "java/lang/Integer"

    const-string v7, "(I)Ljava/lang/Integer;"

    const/16 v9, 0xb8

    invoke-interface {v11, v9, v6, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 180
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 181
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v13, 0x19

    invoke-interface {v11, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xb4

    .line 182
    invoke-interface {v11, v7, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 184
    invoke-interface {v11, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 185
    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 186
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 187
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_a

    .line 188
    :cond_14
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v9, v3, :cond_15

    .line 189
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v13, 0x19

    invoke-interface {v11, v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 190
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 191
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "scanFieldLong"

    const-string v7, "([C)J"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    move-result v2

    const/16 v3, 0x37

    invoke-interface {v11, v3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_a

    .line 194
    :cond_15
    const-class v3, Ljava/lang/Long;

    if-ne v9, v3, :cond_16

    .line 195
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v6, 0x19

    invoke-interface {v11, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 196
    invoke-interface {v11, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 197
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "scanFieldLong"

    const-string v7, "([C)J"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    const-string v6, "java/lang/Long"

    const-string v7, "(J)Ljava/lang/Long;"

    const/16 v9, 0xb8

    invoke-interface {v11, v9, v6, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 201
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 202
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v13, 0x19

    invoke-interface {v11, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xb4

    .line 203
    invoke-interface {v11, v7, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    .line 204
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 205
    invoke-interface {v11, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 206
    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 207
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 208
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_a

    .line 209
    :cond_16
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v9, v3, :cond_17

    .line 210
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v13, 0x19

    invoke-interface {v11, v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 211
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 212
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "scanFieldFloat"

    const-string v7, "([C)F"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x38

    invoke-interface {v11, v3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_a

    .line 215
    :cond_17
    const-class v3, Ljava/lang/Float;

    if-ne v9, v3, :cond_18

    .line 216
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v6, 0x19

    invoke-interface {v11, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 217
    invoke-interface {v11, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 218
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "scanFieldFloat"

    const-string v7, "([C)F"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const-string v6, "java/lang/Float"

    const-string v7, "(F)Ljava/lang/Float;"

    const/16 v9, 0xb8

    invoke-interface {v11, v9, v6, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 222
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 223
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v13, 0x19

    invoke-interface {v11, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xb4

    .line 224
    invoke-interface {v11, v7, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x5

    .line 225
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 226
    invoke-interface {v11, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 227
    invoke-interface {v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 228
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 229
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_a

    .line 230
    :cond_18
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v9, v3, :cond_19

    .line 231
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v13, 0x19

    invoke-interface {v11, v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 232
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 233
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v3, v6, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "scanFieldDouble"

    const-string v7, "([C)D"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    move-result v2

    const/16 v6, 0x39

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_b

    :cond_19
    const/4 v3, 0x2

    .line 236
    const-class v6, Ljava/lang/Double;

    if-ne v9, v6, :cond_1a

    .line 237
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v9, 0x19

    invoke-interface {v11, v9, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x0

    .line 238
    invoke-interface {v11, v9, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 239
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldDouble"

    const-string v9, "([C)D"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    const-string v7, "java/lang/Double"

    const-string v9, "(D)Ljava/lang/Double;"

    const/16 v10, 0xb8

    invoke-interface {v11, v10, v7, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v9, 0x3a

    invoke-interface {v11, v9, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 243
    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 244
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v13, 0x19

    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v10, 0xb4

    .line 245
    invoke-interface {v11, v10, v6, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x5

    .line 246
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v6, 0xa0

    .line 247
    invoke-interface {v11, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v6, 0x1

    .line 248
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 249
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v6, 0x3a

    invoke-interface {v11, v6, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 250
    invoke-interface {v11, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_b

    .line 251
    :cond_1a
    const-class v6, Ljava/lang/String;

    if-ne v9, v6, :cond_1b

    .line 252
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 253
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 254
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldString"

    const-string v9, "([C)Ljava/lang/String;"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    :goto_d
    move v9, v7

    goto/16 :goto_c

    .line 257
    :cond_1b
    const-class v6, Ljava/util/Date;

    if-ne v9, v6, :cond_1c

    .line 258
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 259
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 260
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldDate"

    const-string v9, "([C)Ljava/util/Date;"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_d

    .line 263
    :cond_1c
    const-class v6, Ljava/util/UUID;

    if-ne v9, v6, :cond_1d

    .line 264
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 265
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 266
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldUUID"

    const-string v9, "([C)Ljava/util/UUID;"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 269
    :cond_1d
    const-class v6, Ljava/math/BigDecimal;

    if-ne v9, v6, :cond_1e

    .line 270
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 271
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 272
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldDecimal"

    const-string v9, "([C)Ljava/math/BigDecimal;"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 275
    :cond_1e
    const-class v6, Ljava/math/BigInteger;

    if-ne v9, v6, :cond_1f

    .line 276
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 277
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 278
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldBigInteger"

    const-string v9, "([C)Ljava/math/BigInteger;"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 281
    :cond_1f
    const-class v6, [I

    if-ne v9, v6, :cond_20

    .line 282
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 283
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 284
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldIntArray"

    const-string v9, "([C)[I"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 287
    :cond_20
    const-class v6, [F

    if-ne v9, v6, :cond_21

    .line 288
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 289
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 290
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldFloatArray"

    const-string v9, "([C)[F"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 293
    :cond_21
    const-class v6, [[F

    if-ne v9, v6, :cond_22

    .line 294
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x0

    .line 295
    invoke-interface {v11, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 296
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v7, "scanFieldFloatArray2"

    const-string v9, "([C)[[F"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 299
    :cond_22
    invoke-virtual {v9}, Ljava/lang/Class;->isEnum()Z

    move-result v6

    if-eqz v6, :cond_23

    const/4 v6, 0x0

    const/16 v13, 0x19

    .line 300
    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 301
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v11, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 302
    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 303
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-direct {v0, v1, v11, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_getFieldDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 305
    const-class v6, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "(L"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ";[C"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v10, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 306
    invoke-static {v10}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ")Ljava/lang/Enum;"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 307
    const-string v10, "scanEnum"

    const/16 v13, 0xb6

    invoke-interface {v11, v13, v6, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xc0

    .line 308
    invoke-static {v9}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v11, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 309
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x3a

    invoke-interface {v11, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_d

    .line 310
    :cond_23
    const-class v6, Ljava/util/Collection;

    invoke-virtual {v6, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_26

    .line 311
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x0

    .line 312
    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 313
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    move-result-object v6

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0xb4

    invoke-interface {v11, v10, v6, v7, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    invoke-static/range {v23 .. v23}, Lcom/alibaba/fastjson/util/TypeUtils;->getCollectionItemClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v6

    .line 315
    const-class v7, Ljava/lang/String;

    if-ne v6, v7, :cond_25

    .line 316
    invoke-static {v9}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v6

    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 317
    sget-object v6, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "([CLjava/lang/Class;)"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v9, Ljava/util/Collection;

    .line 318
    invoke-static {v9}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 319
    const-string v9, "scanFieldStringArray"

    const/16 v10, 0xb6

    invoke-interface {v11, v10, v6, v9, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v9, 0x3a

    invoke-interface {v11, v9, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 321
    :goto_e
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v13, 0x19

    invoke-interface {v11, v13, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 322
    sget-object v2, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const/16 v7, 0xb4

    invoke-interface {v11, v7, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    const/16 v12, 0x9e

    .line 324
    invoke-interface {v11, v12, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    move/from16 v12, v27

    .line 325
    invoke-direct {v0, v11, v1, v12}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_setFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;I)V

    .line 326
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 327
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 328
    invoke-interface {v11, v7, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x59

    .line 329
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 330
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x36

    invoke-interface {v11, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, -0x1

    .line 331
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v6, 0x9f

    move-object/from16 v7, v26

    .line 332
    invoke-interface {v11, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 333
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v13, 0x19

    invoke-interface {v11, v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v6, 0xb4

    .line 334
    invoke-interface {v11, v6, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x9e

    move-object/from16 v13, v25

    .line 335
    invoke-interface {v11, v6, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 336
    const-string v6, "matchedCount"

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v14, 0x15

    invoke-interface {v11, v14, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x4

    .line 337
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    const/16 v6, 0x60

    .line 338
    invoke-interface {v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 339
    const-string v6, "matchedCount"

    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v14, 0x36

    invoke-interface {v11, v14, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 340
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v3, 0x19

    invoke-interface {v11, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v6, 0xb4

    .line 341
    invoke-interface {v11, v6, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v9, v24

    .line 342
    invoke-interface {v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v10, 0x9f

    move-object/from16 v14, v22

    .line 343
    invoke-interface {v11, v10, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 344
    invoke-interface {v11, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    add-int/lit8 v10, v20, -0x1

    if-ne v12, v10, :cond_24

    .line 345
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v11, v3, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 346
    invoke-interface {v11, v6, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    invoke-interface {v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v10, 0xa0

    .line 348
    invoke-interface {v11, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    :cond_24
    move-object v13, v4

    move/from16 v18, v6

    move-object v2, v11

    move v6, v12

    const/16 v10, 0xb6

    move v11, v3

    move-object v12, v5

    move-object v3, v7

    goto :goto_f

    :cond_25
    move-object v13, v4

    move-object v12, v5

    move-object v5, v9

    move-object/from16 v14, v22

    move-object/from16 v9, v24

    move-object/from16 v3, v26

    move/from16 v7, v27

    const/16 v10, 0xb6

    const/16 v18, 0xb4

    move-object v4, v2

    move-object v2, v11

    const/16 v11, 0x19

    .line 349
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserialze_list_obj(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;Ljava/lang/Class;I)V

    move v6, v7

    add-int/lit8 v7, v20, -0x1

    if-ne v6, v7, :cond_27

    .line 350
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserialize_endCheck(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;)V

    goto :goto_f

    :cond_26
    move-object v13, v4

    move-object v12, v5

    move-object v5, v9

    move-object/from16 v14, v22

    move-object/from16 v9, v24

    move-object/from16 v3, v26

    move/from16 v6, v27

    const/16 v10, 0xb6

    const/16 v18, 0xb4

    move-object v4, v2

    move-object v2, v11

    const/16 v11, 0x19

    .line 351
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserialze_obj(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;I)V

    add-int/lit8 v7, v20, -0x1

    if-ne v6, v7, :cond_27

    .line 352
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserialize_endCheck(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;)V

    :cond_27
    :goto_f
    add-int/lit8 v6, v6, 0x1

    move-object v11, v2

    move-object v5, v12

    move-object v4, v13

    move/from16 v7, v20

    goto/16 :goto_9

    :cond_28
    move/from16 v20, v7

    move-object v2, v11

    move-object/from16 v14, v22

    const/16 v10, 0xb6

    const/16 v11, 0x19

    .line 353
    invoke-interface {v2, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 354
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$400(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-nez v4, :cond_29

    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$400(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v4

    if-nez v4, :cond_29

    .line 355
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_batchSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    :cond_29
    move-object/from16 v4, v21

    .line 356
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 357
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_setContext(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    .line 358
    const-string v4, "instance"

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2, v11, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 359
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$000(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object v4

    iget-object v4, v4, Lcom/alibaba/fastjson/util/JavaBeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_2a

    .line 360
    invoke-virtual {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->getInstClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "()"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 362
    invoke-interface {v2, v10, v5, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2a
    const/16 v4, 0xb0

    .line 363
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 364
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 365
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_batchSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    const/4 v9, 0x0

    .line 366
    invoke-interface {v2, v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x1

    .line 367
    invoke-interface {v2, v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x2

    .line 368
    invoke-interface {v2, v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x3

    .line 369
    invoke-interface {v2, v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 370
    const-string v3, "instance"

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x4

    const/16 v14, 0x15

    .line 371
    invoke-interface {v2, v14, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 372
    div-int/lit8 v7, v20, 0x20

    if-eqz v20, :cond_2b

    .line 373
    rem-int/lit8 v3, v20, 0x20

    if-eqz v3, :cond_2b

    add-int/lit8 v7, v7, 0x1

    :cond_2b
    const/4 v3, 0x1

    if-ne v7, v3, :cond_2c

    const/4 v6, 0x4

    .line 374
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    goto :goto_10

    :cond_2c
    const/16 v3, 0x10

    .line 375
    invoke-interface {v2, v3, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    :goto_10
    const/16 v3, 0xbc

    const/16 v4, 0xa

    .line 376
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    const/4 v3, 0x0

    :goto_11
    if-ge v3, v7, :cond_2f

    const/16 v4, 0x59

    .line 377
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    if-nez v3, :cond_2d

    const/4 v6, 0x3

    .line 378
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    goto :goto_12

    :cond_2d
    const/4 v6, 0x1

    if-ne v3, v6, :cond_2e

    const/4 v6, 0x4

    .line 379
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    goto :goto_12

    :cond_2e
    const/16 v4, 0x10

    .line 380
    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    .line 381
    :goto_12
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "_asm_flag_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v14, 0x15

    invoke-interface {v2, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v4, 0x4f

    .line 382
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    .line 383
    :cond_2f
    const-class v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "(L"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v6, "parseRest"

    invoke-interface {v2, v10, v3, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$400(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc0

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v3, 0xb0

    .line 385
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    move-object/from16 v3, v19

    .line 386
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/4 v9, 0x0

    .line 387
    invoke-interface {v2, v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x1

    .line 388
    invoke-interface {v2, v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x2

    .line 389
    invoke-interface {v2, v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x3

    .line 390
    invoke-interface {v2, v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x4

    const/16 v14, 0x15

    .line 391
    invoke-interface {v2, v14, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 392
    const-class v3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "(L"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xb7

    const-string v6, "deserialze"

    invoke-interface {v2, v5, v3, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xb0

    .line 393
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    const/16 v3, 0xa

    .line 394
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$100(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)I

    move-result v1

    invoke-interface {v2, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 395
    invoke-interface {v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    return-void
.end method

.method private _deserialzeArrayMapping(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v6, 0x5

    .line 1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v8, 0x10

    .line 2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 3
    new-instance v2, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "(L"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x1

    const-string v13, "deserialzeArrayMapping"

    move-object/from16 v11, p1

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 4
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->defineVarLexer(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    .line 5
    const-string v10, "lexer"

    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v11, 0x19

    invoke-interface {v2, v11, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 6
    invoke-interface {v2, v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "()"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/SymbolTable;

    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v13, 0xb6

    const-string v5, "getSymbolTable"

    invoke-interface {v2, v13, v4, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "("

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v14, Lcom/alibaba/fastjson/parser/SymbolTable;

    invoke-static {v14}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ")Ljava/lang/String;"

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v14, "scanTypeName"

    invoke-interface {v2, v13, v3, v14, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    const-string v3, "typeName"

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v14, 0x3a

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 10
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 11
    const-string v5, "typeName"

    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xc6

    .line 12
    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 13
    invoke-interface {v2, v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 14
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "()"

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v15, Lcom/alibaba/fastjson/parser/ParserConfig;

    invoke-static {v15}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v15, "getConfig"

    invoke-interface {v2, v13, v4, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v15, 0x0

    .line 15
    invoke-interface {v2, v11, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 16
    const-class v16, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    const-class v17, Lcom/alibaba/fastjson/util/JavaBeanInfo;

    invoke-static/range {v17 .. v17}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    const/16 v15, 0xb4

    const-string v8, "beanInfo"

    invoke-interface {v2, v15, v5, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    const-string v5, "typeName"

    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 18
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "("

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v8, Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 19
    invoke-static {v8}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v8, Lcom/alibaba/fastjson/util/JavaBeanInfo;

    invoke-static {v8}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "Ljava/lang/String;)"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0xb8

    .line 20
    const-string v15, "getSeeAlso"

    invoke-interface {v2, v8, v5, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    const-string v5, "userTypeDeser"

    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v14, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 22
    const-string v5, "userTypeDeser"

    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xc1

    .line 23
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v5, 0x99

    .line 24
    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 25
    const-string v5, "userTypeDeser"

    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 26
    invoke-interface {v2, v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v5, 0x2

    .line 27
    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v5, 0x3

    .line 28
    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v5, 0x4

    .line 29
    invoke-interface {v2, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 30
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "(L"

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 31
    const-string v6, "deserialzeArrayMapping"

    invoke-interface {v2, v13, v5, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xb0

    .line 32
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 33
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 34
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_createInstance(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    .line 35
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$000(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Lcom/alibaba/fastjson/util/JavaBeanInfo;

    move-result-object v3

    iget-object v6, v3, Lcom/alibaba/fastjson/util/JavaBeanInfo;->sortedFields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 36
    array-length v15, v6

    const/4 v5, 0x0

    .line 37
    :goto_0
    const-string v3, "ch"

    const-string v4, "(I)V"

    const-string v12, "()C"

    if-ge v5, v15, :cond_1c

    add-int/lit8 v14, v15, -0x1

    if-ne v5, v14, :cond_0

    const/4 v14, 0x1

    goto :goto_1

    :cond_0
    const/4 v14, 0x0

    :goto_1
    if-eqz v14, :cond_1

    const/16 v18, 0x5d

    :goto_2
    move/from16 v8, v18

    goto :goto_3

    :cond_1
    const/16 v18, 0x2c

    goto :goto_2

    .line 38
    :goto_3
    aget-object v13, v6, v5

    .line 39
    iget-object v11, v13, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    move-object/from16 v19, v6

    .line 40
    iget-object v6, v13, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    move-object/from16 v20, v6

    .line 41
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    move/from16 v21, v14

    const-string v14, "_asm"

    if-eq v11, v6, :cond_2

    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v11, v6, :cond_2

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v11, v6, :cond_3

    :cond_2
    move/from16 v24, v5

    move-object/from16 v25, v7

    move-object v6, v9

    move-object v3, v13

    move-object v5, v14

    move/from16 v22, v15

    const/16 v7, 0x3a

    const/4 v11, 0x1

    goto/16 :goto_e

    .line 42
    :cond_3
    const-class v6, Ljava/lang/Byte;

    move/from16 v22, v15

    const-string v15, "I"

    move-object/from16 v23, v9

    const-string v9, "matchStat"

    move/from16 v24, v5

    const-string v5, "valueOf"

    if-ne v11, v6, :cond_4

    .line 43
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 44
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanInt"

    const-string v6, "(C)I"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v4, "java/lang/Byte"

    const-string v6, "(B)Ljava/lang/Byte;"

    const/16 v8, 0xb8

    invoke-interface {v2, v8, v4, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 48
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 49
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xb4

    .line 50
    invoke-interface {v2, v5, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 52
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 53
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 54
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 55
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    :goto_4
    move-object/from16 v25, v7

    :goto_5
    move-object/from16 v6, v23

    const/16 v7, 0x3a

    :goto_6
    const/4 v11, 0x1

    goto/16 :goto_f

    .line 56
    :cond_4
    const-class v6, Ljava/lang/Short;

    if-ne v11, v6, :cond_5

    .line 57
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 58
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 59
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanInt"

    const-string v6, "(C)I"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v4, "java/lang/Short"

    const-string v6, "(S)Ljava/lang/Short;"

    const/16 v8, 0xb8

    invoke-interface {v2, v8, v4, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 62
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 63
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xb4

    .line 64
    invoke-interface {v2, v5, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 66
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 67
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 68
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 69
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_4

    .line 70
    :cond_5
    const-class v6, Ljava/lang/Integer;

    if-ne v11, v6, :cond_6

    .line 71
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 72
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 73
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanInt"

    const-string v6, "(C)I"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const-string v4, "java/lang/Integer"

    const-string v6, "(I)Ljava/lang/Integer;"

    const/16 v8, 0xb8

    invoke-interface {v2, v8, v4, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 76
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 77
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xb4

    .line 78
    invoke-interface {v2, v5, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 80
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 81
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 82
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 83
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_4

    .line 84
    :cond_6
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v11, v6, :cond_7

    .line 85
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 86
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 87
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanLong"

    const-string v5, "(C)J"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v1, v3, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    move-result v3

    const/16 v4, 0x37

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_4

    .line 89
    :cond_7
    const-class v6, Ljava/lang/Long;

    if-ne v11, v6, :cond_8

    .line 90
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 91
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 92
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanLong"

    const-string v6, "(C)J"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v4, "java/lang/Long"

    const-string v6, "(J)Ljava/lang/Long;"

    const/16 v8, 0xb8

    invoke-interface {v2, v8, v4, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 95
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 96
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xb4

    .line 97
    invoke-interface {v2, v5, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 99
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 100
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 101
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 102
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_4

    .line 103
    :cond_8
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v11, v6, :cond_9

    .line 104
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 105
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 106
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanBoolean"

    const-string v5, "(C)Z"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x36

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_4

    .line 108
    :cond_9
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v11, v6, :cond_a

    .line 109
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 110
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 111
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanFloat"

    const-string v5, "(C)F"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x38

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_4

    .line 113
    :cond_a
    const-class v6, Ljava/lang/Float;

    if-ne v11, v6, :cond_b

    .line 114
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 115
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 116
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanFloat"

    const-string v6, "(C)F"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v4, "java/lang/Float"

    const-string v6, "(F)Ljava/lang/Float;"

    const/16 v8, 0xb8

    invoke-interface {v2, v8, v4, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 119
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 120
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xb4

    .line 121
    invoke-interface {v2, v5, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 123
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 124
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 125
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 126
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_4

    .line 127
    :cond_b
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v11, v6, :cond_c

    .line 128
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 129
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 130
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanDouble"

    const-string v5, "(C)D"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    invoke-virtual {v1, v3, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    move-result v3

    const/16 v4, 0x39

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_4

    .line 132
    :cond_c
    const-class v6, Ljava/lang/Double;

    if-ne v11, v6, :cond_d

    .line 133
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 134
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 135
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanDouble"

    const-string v6, "(C)D"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v4, "java/lang/Double"

    const-string v6, "(D)Ljava/lang/Double;"

    const/16 v8, 0xb8

    invoke-interface {v2, v8, v4, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 138
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 139
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xb4

    .line 140
    invoke-interface {v2, v5, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 142
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 143
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 144
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 145
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto/16 :goto_4

    .line 146
    :cond_d
    sget-object v6, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v11, v6, :cond_e

    .line 147
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 148
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 149
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanString"

    const-string v5, "(C)Ljava/lang/String;"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x3

    .line 150
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 151
    const-string v3, "charAt"

    const-string v4, "(I)C"

    const-string v5, "java/lang/String"

    invoke-interface {v2, v8, v5, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x36

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_4

    .line 153
    :cond_e
    const-class v6, Ljava/lang/String;

    if-ne v11, v6, :cond_f

    .line 154
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 155
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 156
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanString"

    const-string v5, "(C)Ljava/lang/String;"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    :goto_7
    move-object/from16 v25, v7

    move-object/from16 v6, v23

    const/4 v11, 0x1

    move v7, v5

    goto/16 :goto_f

    .line 158
    :cond_f
    const-class v6, Ljava/math/BigDecimal;

    if-ne v11, v6, :cond_10

    .line 159
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 160
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 161
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanDecimal"

    const-string v5, "(C)Ljava/math/BigDecimal;"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_7

    .line 163
    :cond_10
    const-class v6, Ljava/util/Date;

    if-ne v11, v6, :cond_11

    .line 164
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 165
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 166
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanDate"

    const-string v5, "(C)Ljava/util/Date;"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto :goto_7

    .line 168
    :cond_11
    const-class v6, Ljava/util/UUID;

    if-ne v11, v6, :cond_12

    .line 169
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 170
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 171
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v4, "scanUUID"

    const-string v5, "(C)Ljava/util/UUID;"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    goto/16 :goto_7

    .line 173
    :cond_12
    invoke-virtual {v11}, Ljava/lang/Class;->isEnum()Z

    move-result v6

    if-eqz v6, :cond_13

    .line 174
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 175
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 176
    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 177
    new-instance v15, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v15}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    move-object/from16 v25, v7

    .line 178
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    move-object/from16 v26, v11

    const/16 v11, 0x19

    invoke-interface {v2, v11, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 179
    sget-object v7, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v11, "getCurrent"

    move-object/from16 v27, v14

    const/16 v14, 0xb6

    invoke-interface {v2, v14, v7, v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0x59

    .line 180
    invoke-interface {v2, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 181
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v11

    const/16 v12, 0x36

    invoke-interface {v2, v12, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v11, 0x6e

    .line 182
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v11, 0x9f

    .line 183
    invoke-interface {v2, v11, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 184
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v11

    const/16 v12, 0x15

    invoke-interface {v2, v12, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v11, 0x22

    .line 185
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v11, 0xa0

    .line 186
    invoke-interface {v2, v11, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 187
    invoke-interface {v2, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 188
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v11

    const/16 v12, 0x19

    invoke-interface {v2, v12, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 189
    invoke-static/range {v26 .. v26}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v11

    invoke-interface {v2, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/4 v11, 0x1

    .line 190
    invoke-interface {v2, v12, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 191
    sget-object v11, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "()"

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v14, Lcom/alibaba/fastjson/parser/SymbolTable;

    invoke-static {v14}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v14, "getSymbolTable"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v11, v14, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0x10

    .line 192
    invoke-interface {v2, v11, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 193
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "(Ljava/lang/Class;"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v12, Lcom/alibaba/fastjson/parser/SymbolTable;

    .line 194
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "C)Ljava/lang/Enum;"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 195
    const-string v12, "scanEnum"

    const/16 v14, 0xb6

    invoke-interface {v2, v14, v7, v12, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0xa7

    .line 196
    invoke-interface {v2, v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 197
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 198
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x15

    invoke-interface {v2, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v4, 0x30

    .line 199
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v4, 0xa1

    .line 200
    invoke-interface {v2, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 201
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v12, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x39

    .line 202
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa3

    .line 203
    invoke-interface {v2, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 204
    invoke-direct {v0, v1, v2, v13}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_getFieldDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 205
    const-class v3, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xc0

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 206
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 207
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 208
    const-string v3, "scanInt"

    const-string v11, "(C)I"

    const/16 v14, 0xb6

    invoke-interface {v2, v14, v7, v3, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    const-class v3, Lcom/alibaba/fastjson/parser/deserializer/EnumDeserializer;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const-string v11, "(I)Ljava/lang/Enum;"

    invoke-interface {v2, v14, v3, v5, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0xa7

    .line 210
    invoke-interface {v2, v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 211
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x0

    .line 212
    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 213
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 214
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 215
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "(L"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";C)Ljava/lang/Enum;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "scanEnum"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/16 v3, 0xc0

    .line 217
    invoke-static/range {v26 .. v26}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 218
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v27

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move v7, v5

    move-object/from16 v6, v23

    goto/16 :goto_6

    :cond_13
    move-object/from16 v25, v7

    move-object/from16 v26, v11

    move-object v5, v14

    .line 219
    const-class v3, Ljava/util/Collection;

    move-object/from16 v6, v26

    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_18

    .line 220
    invoke-static/range {v20 .. v20}, Lcom/alibaba/fastjson/util/TypeUtils;->getCollectionItemClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    .line 221
    const-class v7, Ljava/lang/String;

    if-ne v3, v7, :cond_16

    .line 222
    const-class v3, Ljava/util/List;

    if-eq v6, v3, :cond_15

    const-class v3, Ljava/util/Collections;

    if-eq v6, v3, :cond_15

    const-class v3, Ljava/util/ArrayList;

    if-ne v6, v3, :cond_14

    goto :goto_8

    .line 223
    :cond_14
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 224
    const-class v3, Lcom/alibaba/fastjson/util/TypeUtils;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "createCollection"

    const-string v6, "(Ljava/lang/Class;)Ljava/util/Collection;"

    const/16 v7, 0xb8

    invoke-interface {v2, v7, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    .line 225
    :cond_15
    :goto_8
    const-class v3, Ljava/util/ArrayList;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xbb

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v3, 0x59

    .line 226
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 227
    const-class v3, Ljava/util/ArrayList;

    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "<init>"

    const-string v6, "()V"

    const/16 v7, 0xb7

    invoke-interface {v2, v7, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    :goto_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x3a

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 229
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 230
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x10

    .line 231
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 232
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v6, "scanStringArray"

    const-string v7, "(Ljava/util/Collection;C)V"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 234
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2, v4, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xb4

    .line 235
    invoke-interface {v2, v7, v3, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v9, v25

    .line 236
    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0xa0

    .line 237
    invoke-interface {v2, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x1

    .line 238
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 239
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 240
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    move/from16 v9, v24

    const/16 v7, 0xb8

    goto/16 :goto_b

    :cond_16
    move-object/from16 v9, v25

    const/16 v7, 0xb4

    .line 241
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 242
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v11

    const/16 v14, 0x19

    invoke-interface {v2, v14, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 243
    sget-object v11, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v14, "token"

    const-string v15, "()I"

    const/16 v7, 0xb6

    invoke-interface {v2, v7, v11, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    const-string v7, "token"

    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v14, 0x36

    invoke-interface {v2, v14, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 245
    const-string v7, "token"

    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v14, 0x15

    invoke-interface {v2, v14, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    if-nez v24, :cond_17

    const/16 v7, 0xe

    goto :goto_a

    :cond_17
    const/16 v7, 0x10

    .line 246
    :goto_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v2, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v14, 0x9f

    .line 247
    invoke-interface {v2, v14, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/16 v14, 0x19

    const/4 v15, 0x1

    .line 248
    invoke-interface {v2, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 249
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 250
    sget-object v7, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    const-string v14, "throwException"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v7, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 252
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v14, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v14}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 253
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v25, v9

    const/16 v9, 0x19

    invoke-interface {v2, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 254
    const-string v15, "getCurrent"

    const/16 v9, 0xb6

    invoke-interface {v2, v9, v11, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v15, 0x5b

    const/16 v9, 0x10

    .line 255
    invoke-interface {v2, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v9, 0xa0

    .line 256
    invoke-interface {v2, v9, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 257
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v15, 0x19

    invoke-interface {v2, v15, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 258
    const-string v9, "next"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v11, v9, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v9, 0x57

    .line 259
    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 260
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v12, 0x19

    invoke-interface {v2, v12, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v9, 0xe

    .line 261
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 262
    const-string v9, "setToken"

    invoke-interface {v2, v15, v11, v9, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v9, 0xa7

    .line 263
    invoke-interface {v2, v9, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 264
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 265
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v2, v12, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v8, 0xe

    .line 266
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 267
    const-string v8, "nextToken"

    invoke-interface {v2, v15, v11, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    invoke-interface {v2, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    move/from16 v9, v24

    const/4 v4, 0x0

    .line 269
    invoke-direct {v0, v2, v6, v9, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_newCollection(Lcom/alibaba/fastjson/asm/MethodVisitor;Ljava/lang/Class;IZ)V

    const/16 v4, 0x59

    .line 270
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 271
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 272
    invoke-direct {v0, v1, v2, v13, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_getCollectionFieldItemDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V

    const/16 v4, 0x19

    const/4 v15, 0x1

    .line 273
    invoke-interface {v2, v4, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 274
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/4 v3, 0x3

    .line 275
    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 276
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "(Ljava/util/Collection;"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 277
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "L"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)V"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 278
    const-string v5, "parseArray"

    const/16 v7, 0xb8

    invoke-interface {v2, v7, v3, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_b
    move/from16 v24, v9

    goto/16 :goto_5

    :cond_18
    move/from16 v9, v24

    const/16 v7, 0xb8

    .line 279
    invoke-virtual {v6}, Ljava/lang/Class;->isArray()Z

    move-result v3

    if-eqz v3, :cond_19

    .line 280
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v14, 0x19

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0xe

    .line 281
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 282
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v8, "nextToken"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v3, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x1

    .line 283
    invoke-interface {v2, v14, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x0

    .line 284
    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 285
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 286
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getFieldType"

    const-string v8, "(I)Ljava/lang/reflect/Type;"

    invoke-interface {v2, v15, v3, v4, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    const-string v4, "parseObject"

    const-string v8, "(Ljava/lang/reflect/Type;)Ljava/lang/Object;"

    invoke-interface {v2, v15, v3, v4, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xc0

    .line 288
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 289
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move v7, v5

    move/from16 v24, v9

    move-object/from16 v6, v23

    goto/16 :goto_f

    :cond_19
    const/4 v11, 0x1

    .line 290
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 291
    new-instance v14, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v14}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 292
    const-class v4, Ljava/util/Date;

    if-ne v6, v4, :cond_1a

    .line 293
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v15, 0x19

    invoke-interface {v2, v15, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 294
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v15, "getCurrent"

    const/16 v7, 0xb6

    invoke-interface {v2, v7, v4, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0x31

    .line 295
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v7, 0xa0

    .line 296
    invoke-interface {v2, v7, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 297
    const-class v7, Ljava/util/Date;

    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v7

    const/16 v12, 0xbb

    invoke-interface {v2, v12, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v7, 0x59

    .line 298
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 299
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v15, 0x19

    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0x10

    .line 300
    invoke-interface {v2, v7, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 301
    const-string v7, "scanLong"

    const-string v8, "(C)J"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v4, v7, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-class v4, Ljava/util/Date;

    invoke-static {v4}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "<init>"

    const-string v8, "(J)V"

    const/16 v12, 0xb7

    invoke-interface {v2, v12, v4, v7, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v13, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v7, 0x3a

    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v4, 0xa7

    .line 304
    invoke-interface {v2, v4, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    goto :goto_c

    :cond_1a
    const/16 v7, 0x3a

    .line 305
    :goto_c
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/16 v3, 0xe

    .line 306
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_quickNextToken(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;I)V

    move-object v4, v6

    move v5, v9

    move-object v3, v13

    .line 307
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserObject(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;I)V

    move/from16 v24, v5

    .line 308
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 309
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v5, "token"

    const-string v6, "()I"

    const/16 v8, 0xb6

    invoke-interface {v2, v8, v3, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xf

    .line 310
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v3, 0x9f

    .line 311
    invoke-interface {v2, v3, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x0

    .line 312
    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 313
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    if-nez v21, :cond_1b

    move-object/from16 v6, v23

    .line 314
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    goto :goto_d

    :cond_1b
    move-object/from16 v6, v23

    const/16 v3, 0xf

    .line 315
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 316
    :goto_d
    invoke-static/range {v16 .. v16}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v5, Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 317
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "I)V"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xb7

    .line 318
    const-string v8, "check"

    invoke-interface {v2, v5, v3, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    invoke-interface {v2, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto :goto_f

    .line 320
    :goto_e
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v14, 0x19

    invoke-interface {v2, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v9, 0x10

    .line 321
    invoke-interface {v2, v9, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 322
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v8, "scanInt"

    const-string v9, "(C)I"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v4, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x36

    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    :goto_f
    add-int/lit8 v5, v24, 0x1

    move-object v9, v6

    move v14, v7

    move v12, v11

    move-object/from16 v6, v19

    move/from16 v15, v22

    move-object/from16 v7, v25

    const/16 v8, 0xb8

    const/16 v11, 0x19

    const/16 v13, 0xb6

    goto/16 :goto_0

    :cond_1c
    move-object v6, v9

    const/4 v5, 0x0

    .line 324
    invoke-direct {v0, v1, v2, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_batchSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Z)V

    .line 325
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 326
    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 327
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v11

    const/16 v14, 0x19

    invoke-interface {v2, v14, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 328
    sget-object v11, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    const-string v13, "getCurrent"

    const/16 v15, 0xb6

    invoke-interface {v2, v15, v11, v13, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v13, 0x59

    .line 329
    invoke-interface {v2, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 330
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x36

    invoke-interface {v2, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v13, 0x2c

    const/16 v14, 0x10

    .line 331
    invoke-interface {v2, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v13, 0xa0

    .line 332
    invoke-interface {v2, v13, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 333
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    const/16 v14, 0x19

    invoke-interface {v2, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 334
    const-string v13, "next"

    invoke-interface {v2, v15, v11, v13, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v13, 0x57

    .line 335
    invoke-interface {v2, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 336
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v2, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 337
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 338
    const-string v13, "setToken"

    invoke-interface {v2, v15, v11, v13, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v13, 0xa7

    .line 339
    invoke-interface {v2, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 340
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 341
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v14, 0x15

    invoke-interface {v2, v14, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0x5d

    const/16 v14, 0x10

    .line 342
    invoke-interface {v2, v14, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v13, 0xa0

    .line 343
    invoke-interface {v2, v13, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 344
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v14, 0x19

    invoke-interface {v2, v14, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 345
    const-string v7, "next"

    invoke-interface {v2, v15, v11, v7, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v7, 0x57

    .line 346
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 347
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v2, v14, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v7, 0xf

    .line 348
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 349
    const-string v7, "setToken"

    invoke-interface {v2, v15, v11, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v13, 0xa7

    .line 350
    invoke-interface {v2, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 351
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 352
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v14, 0x15

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x1a

    const/16 v14, 0x10

    .line 353
    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0xa0

    .line 354
    invoke-interface {v2, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 355
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v14, 0x19

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 356
    const-string v3, "next"

    invoke-interface {v2, v15, v11, v3, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x57

    .line 357
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 358
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0x14

    .line 359
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 360
    const-string v3, "setToken"

    invoke-interface {v2, v15, v11, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v13, 0xa7

    .line 361
    invoke-interface {v2, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 362
    invoke-interface {v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 363
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 364
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 365
    const-string v3, "nextToken"

    invoke-interface {v2, v15, v11, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 367
    const-string v3, "instance"

    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v2, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v3, 0xb0

    .line 368
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 369
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$100(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)I

    move-result v1

    const/4 v3, 0x5

    invoke-interface {v2, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 370
    invoke-interface {v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    return-void
.end method

.method private _deserialze_list_obj(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;Ljava/lang/Class;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/asm/Label;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v5, p5

    .line 8
    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 12
    .line 13
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v9, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 17
    .line 18
    const-string v10, "matchField"

    .line 19
    .line 20
    const-string v11, "([C)Z"

    .line 21
    .line 22
    const/16 v12, 0xb6

    .line 23
    .line 24
    invoke-interface {v2, v12, v9, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/16 v10, 0x99

    .line 28
    .line 29
    invoke-interface {v2, v10, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v2, v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_setFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;I)V

    .line 33
    .line 34
    .line 35
    new-instance v10, Lcom/alibaba/fastjson/asm/Label;

    .line 36
    .line 37
    invoke-direct {v10}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v11, "lexer"

    .line 41
    .line 42
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v13

    .line 46
    const/16 v14, 0x19

    .line 47
    .line 48
    invoke-interface {v2, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 49
    .line 50
    .line 51
    const-string v13, "token"

    .line 52
    .line 53
    const-string v15, "()I"

    .line 54
    .line 55
    invoke-interface {v2, v12, v9, v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/16 v16, 0x8

    .line 59
    .line 60
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    invoke-interface {v2, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/16 v12, 0xa0

    .line 68
    .line 69
    invoke-interface {v2, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    invoke-interface {v2, v14, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 77
    .line 78
    .line 79
    const/16 v12, 0x10

    .line 80
    .line 81
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    invoke-interface {v2, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const-string v12, "nextToken"

    .line 89
    .line 90
    const-string v14, "(I)V"

    .line 91
    .line 92
    const/16 v6, 0xb6

    .line 93
    .line 94
    invoke-interface {v2, v6, v9, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/16 v6, 0xa7

    .line 98
    .line 99
    invoke-interface {v2, v6, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 103
    .line 104
    .line 105
    new-instance v10, Lcom/alibaba/fastjson/asm/Label;

    .line 106
    .line 107
    invoke-direct {v10}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 111
    .line 112
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 113
    .line 114
    .line 115
    move-object/from16 v17, v8

    .line 116
    .line 117
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 118
    .line 119
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    const/16 v3, 0x19

    .line 127
    .line 128
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 129
    .line 130
    .line 131
    const/16 v4, 0xb6

    .line 132
    .line 133
    invoke-interface {v2, v4, v9, v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/16 v18, 0x15

    .line 137
    .line 138
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    const/16 v4, 0xa0

    .line 146
    .line 147
    invoke-interface {v2, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 155
    .line 156
    .line 157
    const/16 v4, 0xe

    .line 158
    .line 159
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const/16 v4, 0xb6

    .line 167
    .line 168
    invoke-interface {v2, v4, v9, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/4 v4, 0x1

    .line 172
    invoke-direct {v0, v2, v5, v7, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_newCollection(Lcom/alibaba/fastjson/asm/MethodVisitor;Ljava/lang/Class;IZ)V

    .line 173
    .line 174
    .line 175
    const/16 v4, 0xa7

    .line 176
    .line 177
    invoke-interface {v2, v4, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 188
    .line 189
    .line 190
    const/16 v4, 0xb6

    .line 191
    .line 192
    invoke-interface {v2, v4, v9, v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/16 v6, 0xe

    .line 196
    .line 197
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    const/16 v6, 0x9f

    .line 205
    .line 206
    invoke-interface {v2, v6, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    invoke-interface {v2, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v2, v4, v9, v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/16 v3, 0xc

    .line 220
    .line 221
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v6, p3

    .line 229
    .line 230
    const/16 v3, 0xa0

    .line 231
    .line 232
    invoke-interface {v2, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 233
    .line 234
    .line 235
    const/4 v3, 0x0

    .line 236
    invoke-direct {v0, v2, v5, v7, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_newCollection(Lcom/alibaba/fastjson/asm/MethodVisitor;Ljava/lang/Class;IZ)V

    .line 237
    .line 238
    .line 239
    new-instance v3, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    move-object/from16 v6, p4

    .line 245
    .line 246
    move-object/from16 v20, v13

    .line 247
    .line 248
    iget-object v13, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string v13, "_asm"

    .line 254
    .line 255
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    move-object/from16 v21, v4

    .line 267
    .line 268
    const/16 v4, 0x3a

    .line 269
    .line 270
    invoke-interface {v2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v3, p6

    .line 274
    .line 275
    invoke-direct {v0, v1, v2, v6, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_getCollectionFieldItemDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v22, v9

    .line 279
    .line 280
    const/16 v4, 0x19

    .line 281
    .line 282
    const/4 v9, 0x1

    .line 283
    invoke-interface {v2, v4, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 284
    .line 285
    .line 286
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-static {v4}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    const/4 v4, 0x3

    .line 298
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 299
    .line 300
    .line 301
    const-string v4, "valueOf"

    .line 302
    .line 303
    const-string v9, "(I)Ljava/lang/Integer;"

    .line 304
    .line 305
    move-object/from16 v23, v12

    .line 306
    .line 307
    const/16 v12, 0xb8

    .line 308
    .line 309
    move-object/from16 v24, v14

    .line 310
    .line 311
    const-string v14, "java/lang/Integer"

    .line 312
    .line 313
    invoke-interface {v2, v12, v14, v4, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const-class v4, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 317
    .line 318
    invoke-static {v4}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    new-instance v12, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v14, "(L"

    .line 328
    .line 329
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    sget-object v14, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    move-object/from16 v25, v4

    .line 338
    .line 339
    const-string v4, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 340
    .line 341
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    const/16 v12, 0xb9

    .line 349
    .line 350
    move-object/from16 v26, v14

    .line 351
    .line 352
    const-string v14, "deserialze"

    .line 353
    .line 354
    invoke-interface {v2, v12, v9, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    const-string v4, "list_item_value"

    .line 358
    .line 359
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    const/16 v14, 0x3a

    .line 364
    .line 365
    invoke-interface {v2, v14, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 366
    .line 367
    .line 368
    new-instance v9, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    iget-object v14, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    const/16 v14, 0x19

    .line 390
    .line 391
    invoke-interface {v2, v14, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    invoke-interface {v2, v14, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v5}, Ljava/lang/Class;->isInterface()Z

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    const-string v14, "(Ljava/lang/Object;)Z"

    .line 406
    .line 407
    const-string v12, "add"

    .line 408
    .line 409
    if-eqz v9, :cond_0

    .line 410
    .line 411
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v9

    .line 415
    move-object/from16 v27, v4

    .line 416
    .line 417
    const/16 v4, 0xb9

    .line 418
    .line 419
    invoke-interface {v2, v4, v9, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    goto :goto_0

    .line 423
    :cond_0
    move-object/from16 v27, v4

    .line 424
    .line 425
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    const/16 v9, 0xb6

    .line 430
    .line 431
    invoke-interface {v2, v9, v4, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    :goto_0
    const/16 v4, 0x57

    .line 435
    .line 436
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 437
    .line 438
    .line 439
    move-object/from16 v9, v17

    .line 440
    .line 441
    const/16 v4, 0xa7

    .line 442
    .line 443
    invoke-interface {v2, v4, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 444
    .line 445
    .line 446
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 447
    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    invoke-direct {v0, v2, v5, v7, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_newCollection(Lcom/alibaba/fastjson/asm/MethodVisitor;Ljava/lang/Class;IZ)V

    .line 451
    .line 452
    .line 453
    invoke-interface {v2, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 454
    .line 455
    .line 456
    new-instance v4, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    iget-object v7, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    const/16 v7, 0x3a

    .line 478
    .line 479
    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 480
    .line 481
    .line 482
    iget-object v4, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 483
    .line 484
    invoke-static {v4}, Lcom/alibaba/fastjson/parser/ParserConfig;->isPrimitive2(Ljava/lang/Class;)Z

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    invoke-direct {v0, v1, v2, v6, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_getCollectionFieldItemDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V

    .line 489
    .line 490
    .line 491
    const-string v7, "fastMatchToken"

    .line 492
    .line 493
    if-eqz v4, :cond_1

    .line 494
    .line 495
    invoke-static/range {v25 .. v25}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    const-string v10, "getFastMatchToken"

    .line 500
    .line 501
    const/16 v3, 0xb9

    .line 502
    .line 503
    invoke-interface {v2, v3, v8, v10, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    const/16 v3, 0x36

    .line 507
    .line 508
    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    invoke-interface {v2, v3, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    const/16 v8, 0x19

    .line 520
    .line 521
    invoke-interface {v2, v8, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    move/from16 v8, v18

    .line 529
    .line 530
    invoke-interface {v2, v8, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 531
    .line 532
    .line 533
    move/from16 p7, v4

    .line 534
    .line 535
    move-object/from16 v3, v22

    .line 536
    .line 537
    move-object/from16 v10, v23

    .line 538
    .line 539
    move-object/from16 v4, v24

    .line 540
    .line 541
    const/16 v8, 0xb6

    .line 542
    .line 543
    invoke-interface {v2, v8, v3, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    :goto_1
    const/4 v5, 0x1

    .line 547
    const/16 v8, 0x19

    .line 548
    .line 549
    goto :goto_2

    .line 550
    :cond_1
    move/from16 p7, v4

    .line 551
    .line 552
    move-object/from16 v3, v22

    .line 553
    .line 554
    move-object/from16 v10, v23

    .line 555
    .line 556
    move-object/from16 v4, v24

    .line 557
    .line 558
    const/16 v8, 0x57

    .line 559
    .line 560
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v8, v21

    .line 564
    .line 565
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    const/16 v8, 0x36

    .line 569
    .line 570
    invoke-virtual {v1, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 571
    .line 572
    .line 573
    move-result v5

    .line 574
    invoke-interface {v2, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 575
    .line 576
    .line 577
    const/16 v5, 0xc

    .line 578
    .line 579
    invoke-direct {v0, v1, v2, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_quickNextToken(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;I)V

    .line 580
    .line 581
    .line 582
    goto :goto_1

    .line 583
    :goto_2
    invoke-interface {v2, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 584
    .line 585
    .line 586
    new-instance v5, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 589
    .line 590
    .line 591
    const-string v8, "()"

    .line 592
    .line 593
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-class v8, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 597
    .line 598
    invoke-static {v8}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v8

    .line 602
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    const-string v8, "getContext"

    .line 610
    .line 611
    move-object/from16 v21, v9

    .line 612
    .line 613
    move-object/from16 v9, v26

    .line 614
    .line 615
    const/16 v0, 0xb6

    .line 616
    .line 617
    invoke-interface {v2, v0, v9, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    const-string v0, "listContext"

    .line 621
    .line 622
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    const/16 v5, 0x3a

    .line 627
    .line 628
    invoke-interface {v2, v5, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 629
    .line 630
    .line 631
    const/4 v5, 0x1

    .line 632
    const/16 v8, 0x19

    .line 633
    .line 634
    invoke-interface {v2, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 635
    .line 636
    .line 637
    new-instance v0, Ljava/lang/StringBuilder;

    .line 638
    .line 639
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 640
    .line 641
    .line 642
    iget-object v5, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 643
    .line 644
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    invoke-interface {v2, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 659
    .line 660
    .line 661
    iget-object v0, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 662
    .line 663
    invoke-interface {v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    new-instance v0, Ljava/lang/StringBuilder;

    .line 667
    .line 668
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 669
    .line 670
    .line 671
    const-string v5, "(Ljava/lang/Object;Ljava/lang/Object;)"

    .line 672
    .line 673
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 677
    .line 678
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    const-string v5, "setContext"

    .line 690
    .line 691
    const/16 v8, 0xb6

    .line 692
    .line 693
    invoke-interface {v2, v8, v9, v5, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    const/16 v8, 0x57

    .line 697
    .line 698
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 699
    .line 700
    .line 701
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 702
    .line 703
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 704
    .line 705
    .line 706
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 707
    .line 708
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 709
    .line 710
    .line 711
    const/4 v8, 0x3

    .line 712
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 713
    .line 714
    .line 715
    const-string v8, "i"

    .line 716
    .line 717
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 718
    .line 719
    .line 720
    move-result v8

    .line 721
    move-object/from16 v24, v4

    .line 722
    .line 723
    const/16 v4, 0x36

    .line 724
    .line 725
    invoke-interface {v2, v4, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 732
    .line 733
    .line 734
    move-result v4

    .line 735
    const/16 v8, 0x19

    .line 736
    .line 737
    invoke-interface {v2, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 738
    .line 739
    .line 740
    move-object/from16 v8, v20

    .line 741
    .line 742
    const/16 v4, 0xb6

    .line 743
    .line 744
    invoke-interface {v2, v4, v3, v8, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    const/16 v4, 0xf

    .line 748
    .line 749
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    const/16 v4, 0x9f

    .line 757
    .line 758
    invoke-interface {v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 759
    .line 760
    .line 761
    move-object/from16 v19, v5

    .line 762
    .line 763
    const/16 v4, 0x19

    .line 764
    .line 765
    const/4 v5, 0x0

    .line 766
    invoke-interface {v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 767
    .line 768
    .line 769
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    new-instance v5, Ljava/lang/StringBuilder;

    .line 774
    .line 775
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 776
    .line 777
    .line 778
    move-object/from16 v23, v10

    .line 779
    .line 780
    iget-object v10, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 781
    .line 782
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    const-string v10, "_asm_list_item_deser__"

    .line 786
    .line 787
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    invoke-static/range {v25 .. v25}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v10

    .line 798
    move-object/from16 v20, v7

    .line 799
    .line 800
    const/16 v7, 0xb4

    .line 801
    .line 802
    invoke-interface {v2, v7, v4, v5, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    const/16 v4, 0x19

    .line 806
    .line 807
    const/4 v5, 0x1

    .line 808
    invoke-interface {v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 809
    .line 810
    .line 811
    invoke-static/range {p6 .. p6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v4

    .line 815
    invoke-static {v4}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 816
    .line 817
    .line 818
    move-result-object v4

    .line 819
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    const-string v4, "i"

    .line 823
    .line 824
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 825
    .line 826
    .line 827
    move-result v4

    .line 828
    const/16 v5, 0x15

    .line 829
    .line 830
    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 831
    .line 832
    .line 833
    const-string v4, "valueOf"

    .line 834
    .line 835
    const-string v5, "(I)Ljava/lang/Integer;"

    .line 836
    .line 837
    const/16 v7, 0xb8

    .line 838
    .line 839
    const-string v10, "java/lang/Integer"

    .line 840
    .line 841
    invoke-interface {v2, v7, v10, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-static/range {v25 .. v25}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    new-instance v5, Ljava/lang/StringBuilder;

    .line 849
    .line 850
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 851
    .line 852
    .line 853
    const-string v7, "(L"

    .line 854
    .line 855
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    const-string v7, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 862
    .line 863
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    const-string v7, "deserialze"

    .line 871
    .line 872
    const/16 v10, 0xb9

    .line 873
    .line 874
    invoke-interface {v2, v10, v4, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    move-object/from16 v4, v27

    .line 878
    .line 879
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 880
    .line 881
    .line 882
    move-result v5

    .line 883
    const/16 v7, 0x3a

    .line 884
    .line 885
    invoke-interface {v2, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 886
    .line 887
    .line 888
    const-string v5, "i"

    .line 889
    .line 890
    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 891
    .line 892
    .line 893
    move-result v5

    .line 894
    const/4 v7, 0x1

    .line 895
    invoke-interface {v2, v5, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIincInsn(II)V

    .line 896
    .line 897
    .line 898
    new-instance v5, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 901
    .line 902
    .line 903
    iget-object v7, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 904
    .line 905
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v5

    .line 915
    invoke-virtual {v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 916
    .line 917
    .line 918
    move-result v5

    .line 919
    const/16 v7, 0x19

    .line 920
    .line 921
    invoke-interface {v2, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Class;->isInterface()Z

    .line 932
    .line 933
    .line 934
    move-result v4

    .line 935
    if-eqz v4, :cond_2

    .line 936
    .line 937
    invoke-static/range {p5 .. p5}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    const/16 v10, 0xb9

    .line 942
    .line 943
    invoke-interface {v2, v10, v4, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    :goto_3
    const/16 v4, 0x57

    .line 947
    .line 948
    goto :goto_4

    .line 949
    :cond_2
    invoke-static/range {p5 .. p5}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v4

    .line 953
    const/16 v5, 0xb6

    .line 954
    .line 955
    invoke-interface {v2, v5, v4, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    goto :goto_3

    .line 959
    :goto_4
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 960
    .line 961
    .line 962
    const/4 v5, 0x1

    .line 963
    invoke-interface {v2, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 964
    .line 965
    .line 966
    new-instance v4, Ljava/lang/StringBuilder;

    .line 967
    .line 968
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 969
    .line 970
    .line 971
    iget-object v5, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 972
    .line 973
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v4

    .line 983
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 984
    .line 985
    .line 986
    move-result v4

    .line 987
    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 988
    .line 989
    .line 990
    const-string v4, "checkListResolve"

    .line 991
    .line 992
    const-string v5, "(Ljava/util/Collection;)V"

    .line 993
    .line 994
    const/16 v6, 0xb6

    .line 995
    .line 996
    invoke-interface {v2, v6, v9, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1000
    .line 1001
    .line 1002
    move-result v4

    .line 1003
    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1004
    .line 1005
    .line 1006
    invoke-interface {v2, v6, v3, v8, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    const/16 v4, 0x10

    .line 1010
    .line 1011
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 1016
    .line 1017
    .line 1018
    const/16 v4, 0xa0

    .line 1019
    .line 1020
    invoke-interface {v2, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 1021
    .line 1022
    .line 1023
    if-eqz p7, :cond_3

    .line 1024
    .line 1025
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v4, v20

    .line 1033
    .line 1034
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1035
    .line 1036
    .line 1037
    move-result v4

    .line 1038
    const/16 v5, 0x15

    .line 1039
    .line 1040
    invoke-interface {v2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1041
    .line 1042
    .line 1043
    move-object/from16 v10, v23

    .line 1044
    .line 1045
    move-object/from16 v4, v24

    .line 1046
    .line 1047
    invoke-interface {v2, v6, v3, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    move-object/from16 v4, p0

    .line 1051
    .line 1052
    :goto_5
    const/16 v5, 0xa7

    .line 1053
    .line 1054
    goto :goto_6

    .line 1055
    :cond_3
    const/16 v5, 0xc

    .line 1056
    .line 1057
    move-object/from16 v4, p0

    .line 1058
    .line 1059
    invoke-direct {v4, v1, v2, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_quickNextToken(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;I)V

    .line 1060
    .line 1061
    .line 1062
    goto :goto_5

    .line 1063
    :goto_6
    invoke-interface {v2, v5, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 1064
    .line 1065
    .line 1066
    move-object/from16 v0, v19

    .line 1067
    .line 1068
    invoke-interface {v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1069
    .line 1070
    .line 1071
    const/4 v5, 0x1

    .line 1072
    invoke-interface {v2, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1073
    .line 1074
    .line 1075
    const-string v0, "listContext"

    .line 1076
    .line 1077
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1078
    .line 1079
    .line 1080
    move-result v0

    .line 1081
    invoke-interface {v2, v7, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1082
    .line 1083
    .line 1084
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1087
    .line 1088
    .line 1089
    const-string v5, "("

    .line 1090
    .line 1091
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1092
    .line 1093
    .line 1094
    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 1095
    .line 1096
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v5

    .line 1100
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    const-string v5, ")V"

    .line 1104
    .line 1105
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    const-string v5, "setContext"

    .line 1113
    .line 1114
    const/16 v6, 0xb6

    .line 1115
    .line 1116
    invoke-interface {v2, v6, v9, v5, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v1, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1120
    .line 1121
    .line 1122
    move-result v0

    .line 1123
    const/16 v14, 0x19

    .line 1124
    .line 1125
    invoke-interface {v2, v14, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1126
    .line 1127
    .line 1128
    invoke-interface {v2, v6, v3, v8, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    const/16 v0, 0xf

    .line 1132
    .line 1133
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    invoke-interface {v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    move-object/from16 v3, p3

    .line 1141
    .line 1142
    const/16 v0, 0xa0

    .line 1143
    .line 1144
    invoke-interface {v2, v0, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 1145
    .line 1146
    .line 1147
    invoke-direct/range {p0 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_quickNextTokenComma(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V

    .line 1148
    .line 1149
    .line 1150
    move-object/from16 v9, v21

    .line 1151
    .line 1152
    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1153
    .line 1154
    .line 1155
    return-void
.end method

.method private _deserialze_obj(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/asm/Label;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/asm/Label;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Ljava/lang/Class<",
            "*>;I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p4

    .line 6
    .line 7
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 13
    .line 14
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v4, "lexer"

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v7, 0x19

    .line 24
    .line 25
    invoke-interface {v2, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 26
    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    invoke-interface {v2, v7, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v9, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v9, "_asm_prefix__"

    .line 47
    .line 48
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v9, "[C"

    .line 56
    .line 57
    const/16 v10, 0xb4

    .line 58
    .line 59
    invoke-interface {v2, v10, v4, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object v4, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 63
    .line 64
    const-string v5, "matchField"

    .line 65
    .line 66
    const-string v9, "([C)Z"

    .line 67
    .line 68
    const/16 v10, 0xb6

    .line 69
    .line 70
    invoke-interface {v2, v10, v4, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/16 v4, 0x9a

    .line 74
    .line 75
    invoke-interface {v2, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 76
    .line 77
    .line 78
    const/4 v9, 0x1

    .line 79
    invoke-interface {v2, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 80
    .line 81
    .line 82
    new-instance v4, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v5, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v5, "_asm"

    .line 93
    .line 94
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    const/16 v11, 0x3a

    .line 106
    .line 107
    invoke-interface {v2, v11, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 108
    .line 109
    .line 110
    const/16 v4, 0xa7

    .line 111
    .line 112
    invoke-interface {v2, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 116
    .line 117
    .line 118
    move/from16 v5, p6

    .line 119
    .line 120
    invoke-direct {p0, v2, v1, v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_setFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;I)V

    .line 121
    .line 122
    .line 123
    const-string v0, "matchedCount"

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    const/16 v12, 0x15

    .line 130
    .line 131
    invoke-interface {v2, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 132
    .line 133
    .line 134
    const/4 v4, 0x4

    .line 135
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 136
    .line 137
    .line 138
    const/16 v4, 0x60

    .line 139
    .line 140
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 141
    .line 142
    .line 143
    const/16 v4, 0x36

    .line 144
    .line 145
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-interface {v2, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 150
    .line 151
    .line 152
    move-object v0, p0

    .line 153
    move-object/from16 v4, p5

    .line 154
    .line 155
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserObject(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v2, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 162
    .line 163
    const-string v4, "getResolveStatus"

    .line 164
    .line 165
    const-string v5, "()I"

    .line 166
    .line 167
    invoke-interface {v2, v10, v0, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-interface {v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    const/16 v4, 0xa0

    .line 178
    .line 179
    invoke-interface {v2, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 180
    .line 181
    .line 182
    invoke-interface {v2, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 183
    .line 184
    .line 185
    new-instance v4, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string v5, "()"

    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-class v12, Lcom/alibaba/fastjson/parser/DefaultJSONParser$ResolveTask;

    .line 196
    .line 197
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    const-string v13, "getLastResolveTask"

    .line 209
    .line 210
    invoke-interface {v2, v10, v0, v13, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string v4, "resolveTask"

    .line 214
    .line 215
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v13

    .line 219
    invoke-interface {v2, v11, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    invoke-interface {v2, v7, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 227
    .line 228
    .line 229
    invoke-interface {v2, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 230
    .line 231
    .line 232
    new-instance v11, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-class v5, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 241
    .line 242
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v11

    .line 253
    const-string v13, "getContext"

    .line 254
    .line 255
    invoke-interface {v2, v10, v0, v13, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    const-string v13, "ownerContext"

    .line 263
    .line 264
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    const/16 v14, 0xb5

    .line 269
    .line 270
    invoke-interface {v2, v14, v11, v13, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-interface {v2, v7, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v2, v7, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 281
    .line 282
    .line 283
    iget-object v1, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 284
    .line 285
    invoke-interface {v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    const-class v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 289
    .line 290
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    new-instance v3, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    const-string v4, "(Ljava/lang/String;)"

    .line 300
    .line 301
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-class v4, Lcom/alibaba/fastjson/parser/deserializer/FieldDeserializer;

    .line 305
    .line 306
    invoke-static {v4}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    const-string v5, "getFieldDeserializer"

    .line 318
    .line 319
    invoke-interface {v2, v10, v1, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    const-string v3, "fieldDeserializer"

    .line 327
    .line 328
    invoke-static {v4}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-interface {v2, v14, v1, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-interface {v2, v7, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 336
    .line 337
    .line 338
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-interface {v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    const-string v1, "setResolveStatus"

    .line 346
    .line 347
    const-string v3, "(I)V"

    .line 348
    .line 349
    invoke-interface {v2, v10, v0, v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 353
    .line 354
    .line 355
    return-void
.end method

.method private _getCollectionFieldItemDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v5, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v5, "_asm_list_item_deser__"

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-class v6, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 36
    .line 37
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const/16 v8, 0xb4

    .line 42
    .line 43
    invoke-interface {p2, v8, v3, v4, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/16 v3, 0xc7

    .line 47
    .line 48
    invoke-interface {p2, v3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    invoke-interface {p2, v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 56
    .line 57
    .line 58
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v7, "()"

    .line 66
    .line 67
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-class v7, Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 71
    .line 72
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const/16 v9, 0xb6

    .line 84
    .line 85
    const-string v10, "getConfig"

    .line 86
    .line 87
    invoke-interface {p2, v9, v3, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p4}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-static {p4}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    invoke-interface {p2, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v4, "(Ljava/lang/reflect/Type;)"

    .line 111
    .line 112
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "getDeserializer"

    .line 127
    .line 128
    invoke-interface {p2, v9, p4, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    new-instance v3, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    iget-object v4, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    const/16 v7, 0xb5

    .line 157
    .line 158
    invoke-interface {p2, v7, p4, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    new-instance p4, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p4

    .line 192
    invoke-interface {p2, v8, p1, p3, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method private _getFieldDeser(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 11

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v5, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v5, "_asm_deser__"

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-class v6, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 36
    .line 37
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const/16 v8, 0xb4

    .line 42
    .line 43
    invoke-interface {p2, v8, v3, v4, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/16 v3, 0xc7

    .line 47
    .line 48
    invoke-interface {p2, v3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    invoke-interface {p2, v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 56
    .line 57
    .line 58
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v7, "()"

    .line 66
    .line 67
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-class v7, Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 71
    .line 72
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const/16 v9, 0xb6

    .line 84
    .line 85
    const-string v10, "getConfig"

    .line 86
    .line 87
    invoke-interface {p2, v9, v3, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 91
    .line 92
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v3}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {p2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    new-instance v4, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-string v7, "(Ljava/lang/reflect/Type;)"

    .line 113
    .line 114
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-string v7, "getDeserializer"

    .line 129
    .line 130
    invoke-interface {p2, v9, v3, v7, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    new-instance v4, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v7, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    const/16 v9, 0xb5

    .line 159
    .line 160
    invoke-interface {p2, v9, v3, v4, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-interface {p2, v8, p1, p3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method private _init(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    array-length v0, v0

    .line 8
    const/4 v7, 0x0

    .line 9
    move v2, v7

    .line 10
    :goto_0
    const-string v8, "[C"

    .line 11
    .line 12
    const-string v9, "_asm_prefix__"

    .line 13
    .line 14
    const/4 v10, 0x1

    .line 15
    if-ge v2, v0, :cond_0

    .line 16
    .line 17
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    aget-object v3, v3, v2

    .line 22
    .line 23
    new-instance v4, Lcom/alibaba/fastjson/asm/FieldWriter;

    .line 24
    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v4, v1, v10, v3, v8}, Lcom/alibaba/fastjson/asm/FieldWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lcom/alibaba/fastjson/asm/FieldWriter;->visitEnd()V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    array-length v0, v0

    .line 56
    move v2, v7

    .line 57
    :goto_1
    if-ge v2, v0, :cond_3

    .line 58
    .line 59
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    aget-object v3, v3, v2

    .line 64
    .line 65
    iget-object v4, v3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    const-class v5, Ljava/util/Collection;

    .line 75
    .line 76
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-class v5, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    new-instance v4, Lcom/alibaba/fastjson/asm/FieldWriter;

    .line 85
    .line 86
    new-instance v6, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v3, "_asm_list_item_deser__"

    .line 97
    .line 98
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-direct {v4, v1, v10, v3, v5}, Lcom/alibaba/fastjson/asm/FieldWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/alibaba/fastjson/asm/FieldWriter;->visitEnd()V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    new-instance v4, Lcom/alibaba/fastjson/asm/FieldWriter;

    .line 117
    .line 118
    new-instance v6, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v3, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v3, "_asm_deser__"

    .line 129
    .line 130
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-direct {v4, v1, v10, v3, v5}, Lcom/alibaba/fastjson/asm/FieldWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Lcom/alibaba/fastjson/asm/FieldWriter;->visitEnd()V

    .line 145
    .line 146
    .line 147
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    new-instance v0, Lcom/alibaba/fastjson/asm/MethodWriter;

    .line 151
    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string v11, "("

    .line 158
    .line 159
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-class v12, Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 163
    .line 164
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-class v13, Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 172
    .line 173
    invoke-static {v13}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v14, ")V"

    .line 181
    .line 182
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    const/4 v5, 0x0

    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v2, 0x1

    .line 192
    const-string v3, "<init>"

    .line 193
    .line 194
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    const/16 v1, 0x19

    .line 198
    .line 199
    invoke-interface {v0, v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v0, v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 203
    .line 204
    .line 205
    const/4 v2, 0x2

    .line 206
    invoke-interface {v0, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 207
    .line 208
    .line 209
    const-class v2, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 210
    .line 211
    invoke-static {v2}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    new-instance v3, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-static {v13}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    const/16 v4, 0xb7

    .line 245
    .line 246
    const-string v5, "<init>"

    .line 247
    .line 248
    invoke-interface {v0, v4, v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    array-length v2, v2

    .line 256
    move v3, v7

    .line 257
    :goto_3
    if-ge v3, v2, :cond_4

    .line 258
    .line 259
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$200(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    aget-object v4, v4, v3

    .line 264
    .line 265
    invoke-interface {v0, v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 266
    .line 267
    .line 268
    new-instance v5, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const-string v6, "\""

    .line 274
    .line 275
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    iget-object v6, v4, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v6, "\":"

    .line 284
    .line 285
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-interface {v0, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const-string v5, "toCharArray"

    .line 296
    .line 297
    const-string v6, "()[C"

    .line 298
    .line 299
    const/16 v10, 0xb6

    .line 300
    .line 301
    const-string v11, "java/lang/String"

    .line 302
    .line 303
    invoke-interface {v0, v10, v11, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->access$300(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    new-instance v6, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 313
    .line 314
    .line 315
    iget-object v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    const/16 v6, 0xb5

    .line 328
    .line 329
    invoke-interface {v0, v6, v5, v4, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    add-int/lit8 v3, v3, 0x1

    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_4
    const/16 v1, 0xb1

    .line 336
    .line 337
    invoke-interface {v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 338
    .line 339
    .line 340
    const/4 v1, 0x4

    .line 341
    invoke-interface {v0, v1, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    .line 345
    .line 346
    .line 347
    return-void
.end method

.method private _isFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;ILcom/alibaba/fastjson/asm/Label;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "_asm_flag_"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    div-int/lit8 v1, p3, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/16 v0, 0x15

    .line 25
    .line 26
    invoke-interface {p1, v0, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    shl-int/2addr p2, p3

    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/16 p2, 0x7e

    .line 39
    .line 40
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 41
    .line 42
    .line 43
    const/16 p2, 0x99

    .line 44
    .line 45
    invoke-interface {p1, p2, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private _loadAndSet(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 7

    .line 1
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    const/16 v3, 0x15

    .line 8
    .line 9
    const-string v4, "instance"

    .line 10
    .line 11
    const-string v5, "_asm"

    .line 12
    .line 13
    const/16 v6, 0x19

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-interface {p2, v3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    if-eq v0, v2, :cond_b

    .line 55
    .line 56
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    if-eq v0, v2, :cond_b

    .line 59
    .line 60
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-eq v0, v2, :cond_b

    .line 63
    .line 64
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    if-ne v0, v2, :cond_1

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :cond_1
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    if-ne v0, v2, :cond_4

    .line 74
    .line 75
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/16 v1, 0x16

    .line 104
    .line 105
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->getInstClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 127
    .line 128
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    const/16 v2, 0xb6

    .line 133
    .line 134
    invoke-interface {p2, v2, p1, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-nez p1, :cond_2

    .line 150
    .line 151
    const/16 p1, 0x57

    .line 152
    .line 153
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 154
    .line 155
    .line 156
    :cond_2
    return-void

    .line 157
    :cond_3
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->declaringClass:Ljava/lang/Class;

    .line 158
    .line 159
    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 170
    .line 171
    invoke-static {p3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p3

    .line 175
    const/16 v1, 0xb5

    .line 176
    .line 177
    invoke-interface {p2, v1, p1, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 182
    .line 183
    if-ne v0, v2, :cond_5

    .line 184
    .line 185
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    const/16 v1, 0x17

    .line 214
    .line 215
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 216
    .line 217
    .line 218
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_5
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 223
    .line 224
    if-ne v0, v2, :cond_6

    .line 225
    .line 226
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 231
    .line 232
    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {p1, v0, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    const/16 v1, 0x18

    .line 255
    .line 256
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 257
    .line 258
    .line 259
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :cond_6
    const-class v2, Ljava/lang/String;

    .line 264
    .line 265
    if-ne v0, v2, :cond_7

    .line 266
    .line 267
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 272
    .line 273
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 280
    .line 281
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 296
    .line 297
    .line 298
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_8

    .line 307
    .line 308
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 313
    .line 314
    .line 315
    new-instance v0, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 337
    .line 338
    .line 339
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_8
    const-class v3, Ljava/util/Collection;

    .line 344
    .line 345
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-eqz v3, :cond_a

    .line 350
    .line 351
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    invoke-interface {p2, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 356
    .line 357
    .line 358
    invoke-static {v1}, Lcom/alibaba/fastjson/util/TypeUtils;->getCollectionItemClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    if-ne v1, v2, :cond_9

    .line 363
    .line 364
    new-instance v1, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    iget-object v2, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 370
    .line 371
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-interface {p2, v6, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 386
    .line 387
    .line 388
    const/16 v1, 0xc0

    .line 389
    .line 390
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 395
    .line 396
    .line 397
    goto :goto_0

    .line 398
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 401
    .line 402
    .line 403
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 420
    .line 421
    .line 422
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :cond_a
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 431
    .line 432
    .line 433
    new-instance v0, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 436
    .line 437
    .line 438
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 455
    .line 456
    .line 457
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :cond_b
    :goto_1
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 462
    .line 463
    .line 464
    move-result v0

    .line 465
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 466
    .line 467
    .line 468
    new-instance v0, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 471
    .line 472
    .line 473
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    invoke-interface {p2, v3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 490
    .line 491
    .line 492
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 493
    .line 494
    .line 495
    return-void
.end method

.method private _newCollection(Lcom/alibaba/fastjson/asm/MethodVisitor;Ljava/lang/Class;IZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Ljava/lang/Class<",
            "*>;IZ)V"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "()V"

    .line 8
    .line 9
    const-string v2, "<init>"

    .line 10
    .line 11
    const/16 v3, 0xb7

    .line 12
    .line 13
    const/16 v4, 0x59

    .line 14
    .line 15
    const/16 v5, 0xbb

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    if-nez p4, :cond_0

    .line 20
    .line 21
    const-string p3, "java/util/ArrayList"

    .line 22
    .line 23
    invoke-interface {p1, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v3, p3, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_0

    .line 33
    .line 34
    :cond_0
    const-class v0, Ljava/util/LinkedList;

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    if-nez p4, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p1, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-interface {p1, v3, p3, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_1
    const-class v0, Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-interface {p1, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    invoke-interface {p1, v3, p3, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    const-class v6, Ljava/util/TreeSet;

    .line 90
    .line 91
    invoke-virtual {p2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-interface {p1, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-interface {p1, v3, p3, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    const-class v6, Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    invoke-virtual {p2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_4

    .line 122
    .line 123
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    invoke-interface {p1, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 131
    .line 132
    .line 133
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-interface {p1, v3, p3, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_4
    if-eqz p4, :cond_5

    .line 142
    .line 143
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-interface {p1, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-interface {p1, v3, p3, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_5
    const/16 p4, 0x19

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    invoke-interface {p1, p4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 165
    .line 166
    .line 167
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    invoke-interface {p1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    const-class p3, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 175
    .line 176
    invoke-static {p3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    const-string p4, "getFieldType"

    .line 181
    .line 182
    const-string v0, "(I)Ljava/lang/reflect/Type;"

    .line 183
    .line 184
    const/16 v1, 0xb6

    .line 185
    .line 186
    invoke-interface {p1, v1, p3, p4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const-class p3, Lcom/alibaba/fastjson/util/TypeUtils;

    .line 190
    .line 191
    invoke-static {p3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    const-string p4, "createCollection"

    .line 196
    .line 197
    const-string v0, "(Ljava/lang/reflect/Type;)Ljava/util/Collection;"

    .line 198
    .line 199
    const/16 v1, 0xb8

    .line 200
    .line 201
    invoke-interface {p1, v1, p3, p4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :goto_0
    const/16 p3, 0xc0

    .line 205
    .line 206
    invoke-static {p2}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method private _quickNextToken(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;I)V
    .locals 9

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/alibaba/fastjson/asm/Label;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "lexer"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v4, 0x19

    .line 18
    .line 19
    invoke-interface {p2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v5, 0xb6

    .line 25
    .line 26
    const-string v6, "getCurrent"

    .line 27
    .line 28
    const-string v7, "()C"

    .line 29
    .line 30
    invoke-interface {p2, v5, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/16 v6, 0xc

    .line 34
    .line 35
    const/16 v8, 0x10

    .line 36
    .line 37
    if-ne p3, v6, :cond_0

    .line 38
    .line 39
    const/16 v6, 0x7b

    .line 40
    .line 41
    invoke-interface {p2, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/16 v6, 0xe

    .line 46
    .line 47
    if-ne p3, v6, :cond_1

    .line 48
    .line 49
    const/16 v6, 0x5b

    .line 50
    .line 51
    invoke-interface {p2, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    :goto_0
    const/16 v6, 0xa0

    .line 55
    .line 56
    invoke-interface {p2, v6, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-interface {p2, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 64
    .line 65
    .line 66
    const-string v6, "next"

    .line 67
    .line 68
    invoke-interface {p2, v5, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/16 v6, 0x57

    .line 72
    .line 73
    invoke-interface {p2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-interface {p2, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 81
    .line 82
    .line 83
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-interface {p2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const-string v6, "setToken"

    .line 91
    .line 92
    const-string v7, "(I)V"

    .line 93
    .line 94
    invoke-interface {p2, v5, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/16 v6, 0xa7

    .line 98
    .line 99
    invoke-interface {p2, v6, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-interface {p2, v4, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 110
    .line 111
    .line 112
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const-string p1, "nextToken"

    .line 120
    .line 121
    invoke-interface {p2, v5, v3, p1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 131
    .line 132
    .line 133
    throw p1
.end method

.method private _quickNextTokenComma(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Lcom/alibaba/fastjson/asm/Label;

    .line 6
    .line 7
    invoke-direct {v2}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 11
    .line 12
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    .line 16
    .line 17
    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 21
    .line 22
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 26
    .line 27
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v7, "lexer"

    .line 31
    .line 32
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    const/16 v9, 0x19

    .line 37
    .line 38
    invoke-interface {v1, v9, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 39
    .line 40
    .line 41
    sget-object v8, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 42
    .line 43
    const/16 v10, 0xb6

    .line 44
    .line 45
    const-string v11, "getCurrent"

    .line 46
    .line 47
    const-string v12, "()C"

    .line 48
    .line 49
    invoke-interface {v1, v10, v8, v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/16 v11, 0x59

    .line 53
    .line 54
    invoke-interface {v1, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 55
    .line 56
    .line 57
    const-string v11, "ch"

    .line 58
    .line 59
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    const/16 v14, 0x36

    .line 64
    .line 65
    invoke-interface {v1, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 66
    .line 67
    .line 68
    const/16 v13, 0x2c

    .line 69
    .line 70
    const/16 v14, 0x10

    .line 71
    .line 72
    invoke-interface {v1, v14, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 73
    .line 74
    .line 75
    const/16 v13, 0xa0

    .line 76
    .line 77
    invoke-interface {v1, v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v15

    .line 84
    invoke-interface {v1, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 85
    .line 86
    .line 87
    const-string v15, "next"

    .line 88
    .line 89
    invoke-interface {v1, v10, v8, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/16 v13, 0x57

    .line 93
    .line 94
    invoke-interface {v1, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    invoke-interface {v1, v9, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 102
    .line 103
    .line 104
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    invoke-interface {v1, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const-string v13, "setToken"

    .line 112
    .line 113
    const-string v9, "(I)V"

    .line 114
    .line 115
    invoke-interface {v1, v10, v8, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const/16 v10, 0xa7

    .line 119
    .line 120
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    const/16 v10, 0x15

    .line 131
    .line 132
    invoke-interface {v1, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 133
    .line 134
    .line 135
    const/16 v3, 0x7d

    .line 136
    .line 137
    invoke-interface {v1, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 138
    .line 139
    .line 140
    const/16 v3, 0xa0

    .line 141
    .line 142
    invoke-interface {v1, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    const/16 v14, 0x19

    .line 150
    .line 151
    invoke-interface {v1, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 152
    .line 153
    .line 154
    const/16 v3, 0xb6

    .line 155
    .line 156
    invoke-interface {v1, v3, v8, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const/16 v10, 0x57

    .line 160
    .line 161
    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    invoke-interface {v1, v14, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 169
    .line 170
    .line 171
    const/16 v10, 0xd

    .line 172
    .line 173
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v1, v3, v8, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/16 v10, 0xa7

    .line 184
    .line 185
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    const/16 v10, 0x15

    .line 196
    .line 197
    invoke-interface {v1, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 198
    .line 199
    .line 200
    const/16 v4, 0x5d

    .line 201
    .line 202
    const/16 v10, 0x10

    .line 203
    .line 204
    invoke-interface {v1, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 205
    .line 206
    .line 207
    const/16 v4, 0xa0

    .line 208
    .line 209
    invoke-interface {v1, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    const/16 v14, 0x19

    .line 217
    .line 218
    invoke-interface {v1, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v1, v3, v8, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    const/16 v10, 0x57

    .line 225
    .line 226
    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    invoke-interface {v1, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 234
    .line 235
    .line 236
    const/16 v4, 0xf

    .line 237
    .line 238
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v1, v3, v8, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const/16 v10, 0xa7

    .line 249
    .line 250
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    const/16 v10, 0x15

    .line 261
    .line 262
    invoke-interface {v1, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 263
    .line 264
    .line 265
    const/16 v3, 0x1a

    .line 266
    .line 267
    const/16 v10, 0x10

    .line 268
    .line 269
    invoke-interface {v1, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 270
    .line 271
    .line 272
    const/16 v3, 0xa0

    .line 273
    .line 274
    invoke-interface {v1, v3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    const/16 v14, 0x19

    .line 282
    .line 283
    invoke-interface {v1, v14, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 284
    .line 285
    .line 286
    const/16 v3, 0x14

    .line 287
    .line 288
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-interface {v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const/16 v3, 0xb6

    .line 296
    .line 297
    invoke-interface {v1, v3, v8, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const/16 v10, 0xa7

    .line 301
    .line 302
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    invoke-interface {v1, v14, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 313
    .line 314
    .line 315
    const-string v0, "nextToken"

    .line 316
    .line 317
    const-string v2, "()V"

    .line 318
    .line 319
    invoke-interface {v1, v3, v8, v0, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v1, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 323
    .line 324
    .line 325
    return-void
.end method

.method private _set(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 3

    .line 1
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/16 v0, 0xb9

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v0, 0xb6

    .line 19
    .line 20
    :goto_0
    iget-object v1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->declaringClass:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p2, v0, v1, v2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    const/16 p1, 0x57

    .line 52
    .line 53
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :cond_2
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->declaringClass:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 70
    .line 71
    invoke-static {p3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    const/16 v1, 0xb5

    .line 76
    .line 77
    invoke-interface {p2, v1, p1, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private _setContext(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x19

    .line 3
    .line 4
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    const-string v0, "context"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "("

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-class v3, Lcom/alibaba/fastjson/parser/ParseContext;

    .line 29
    .line 30
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v4, ")V"

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/16 v4, 0xb6

    .line 47
    .line 48
    const-string v5, "setContext"

    .line 49
    .line 50
    invoke-interface {p2, v4, v0, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 54
    .line 55
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v2, "childContext"

    .line 59
    .line 60
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-interface {p2, v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 65
    .line 66
    .line 67
    const/16 v4, 0xc6

    .line 68
    .line 69
    invoke-interface {p2, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 77
    .line 78
    .line 79
    const-string v2, "instance"

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-interface {p2, v1, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v1, "object"

    .line 93
    .line 94
    const-string v2, "Ljava/lang/Object;"

    .line 95
    .line 96
    const/16 v3, 0xb5

    .line 97
    .line 98
    invoke-interface {p2, v3, p1, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method private _setFlag(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "_asm_flag_"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    div-int/lit8 v1, p3, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/16 v1, 0x15

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-interface {p1, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    shl-int p3, v1, p3

    .line 31
    .line 32
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-interface {p1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/16 p3, 0x80

    .line 40
    .line 41
    invoke-interface {p1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 42
    .line 43
    .line 44
    const/16 p3, 0x36

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private defineVarLexer(Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;)V
    .locals 4

    .line 1
    const/16 v0, 0x19

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {p2, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->DefaultJSONParser:Ljava/lang/String;

    .line 8
    .line 9
    const-class v1, Lcom/alibaba/fastjson/parser/JSONLexer;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/16 v2, 0xb4

    .line 16
    .line 17
    const-string v3, "lexer"

    .line 18
    .line 19
    invoke-interface {p2, v2, v0, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/16 v0, 0xc0

    .line 23
    .line 24
    sget-object v1, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->JSONLexerBase:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p2, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 v0, 0x3a

    .line 30
    .line 31
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;->var(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-interface {p2, v0, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public createJavaBeanDeserializer(Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;)Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;
    .locals 9

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson/util/JavaBeanInfo;->clazz:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "FastjsonASMDeserializer_"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->seed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, "_"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-class v1, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const/16 v3, 0x2e

    .line 62
    .line 63
    const/16 v4, 0x2f

    .line 64
    .line 65
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v3, "/"

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, "."

    .line 93
    .line 94
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v6, v2

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move-object v6, v0

    .line 107
    :goto_0
    new-instance v3, Lcom/alibaba/fastjson/asm/ClassWriter;

    .line 108
    .line 109
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/ClassWriter;-><init>()V

    .line 110
    .line 111
    .line 112
    const-class v1, Lcom/alibaba/fastjson/parser/deserializer/JavaBeanDeserializer;

    .line 113
    .line 114
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const/4 v8, 0x0

    .line 119
    const/16 v4, 0x31

    .line 120
    .line 121
    const/16 v5, 0x21

    .line 122
    .line 123
    invoke-virtual/range {v3 .. v8}, Lcom/alibaba/fastjson/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v1, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;

    .line 127
    .line 128
    const/4 v2, 0x3

    .line 129
    invoke-direct {v1, v6, p1, p2, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;I)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_init(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V

    .line 133
    .line 134
    .line 135
    new-instance v1, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;

    .line 136
    .line 137
    invoke-direct {v1, v6, p1, p2, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;I)V

    .line 138
    .line 139
    .line 140
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_createInstance(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;

    .line 144
    .line 145
    const/4 v2, 0x5

    .line 146
    invoke-direct {v1, v6, p1, p2, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;I)V

    .line 147
    .line 148
    .line 149
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserialze(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;

    .line 153
    .line 154
    const/4 v2, 0x4

    .line 155
    invoke-direct {v1, v6, p1, p2, v2}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson/parser/ParserConfig;Lcom/alibaba/fastjson/util/JavaBeanInfo;I)V

    .line 156
    .line 157
    .line 158
    invoke-direct {p0, v3, v1}, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->_deserialzeArrayMapping(Lcom/alibaba/fastjson/asm/ClassWriter;Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory$Context;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/alibaba/fastjson/asm/ClassWriter;->toByteArray()[B

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    iget-object v2, p0, Lcom/alibaba/fastjson/parser/deserializer/ASMDeserializerFactory;->classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 166
    .line 167
    const/4 v3, 0x0

    .line 168
    array-length v4, v1

    .line 169
    invoke-virtual {v2, v0, v1, v3, v4}, Lcom/alibaba/fastjson/util/ASMClassLoader;->defineClassPublic(Ljava/lang/String;[BII)Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-class v1, Lcom/alibaba/fastjson/parser/ParserConfig;

    .line 174
    .line 175
    const-class v2, Lcom/alibaba/fastjson/util/JavaBeanInfo;

    .line 176
    .line 177
    filled-new-array {v1, v2}, [Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Lcom/alibaba/fastjson/parser/deserializer/ObjectDeserializer;

    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 197
    .line 198
    new-instance p2, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    const-string v1, "not support type :"

    .line 204
    .line 205
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw p1
.end method
