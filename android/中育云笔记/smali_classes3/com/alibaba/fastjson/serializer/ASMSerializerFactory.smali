.class public Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/fastjson/asm/Opcodes;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;
    }
.end annotation


# static fields
.field static final JSONSerializer:Ljava/lang/String;

.field static final JavaBeanSerializer:Ljava/lang/String;

.field static final JavaBeanSerializer_desc:Ljava/lang/String;

.field static final ObjectSerializer:Ljava/lang/String;

.field static final ObjectSerializer_desc:Ljava/lang/String;

.field static final SerialContext_desc:Ljava/lang/String;

.field static final SerializeFilterable_desc:Ljava/lang/String;

.field static final SerializeWriter:Ljava/lang/String;

.field static final SerializeWriter_desc:Ljava/lang/String;


# instance fields
.field protected final classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

.field private final seed:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Lcom/alibaba/fastjson/serializer/JSONSerializer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 8
    .line 9
    const-class v0, Lcom/alibaba/fastjson/serializer/ObjectSerializer;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "L"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ";"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sput-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer_desc:Ljava/lang/String;

    .line 40
    .line 41
    const-class v1, Lcom/alibaba/fastjson/serializer/SerializeWriter;

    .line 42
    .line 43
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sput-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sput-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter_desc:Ljava/lang/String;

    .line 68
    .line 69
    const-class v1, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    .line 70
    .line 71
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sput-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v3, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer_desc:Ljava/lang/String;

    .line 100
    .line 101
    const-class v0, Lcom/alibaba/fastjson/serializer/SerialContext;

    .line 102
    .line 103
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerialContext_desc:Ljava/lang/String;

    .line 108
    .line 109
    const-class v0, Lcom/alibaba/fastjson/serializer/SerializeFilterable;

    .line 110
    .line 111
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeFilterable_desc:Ljava/lang/String;

    .line 116
    .line 117
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/alibaba/fastjson/util/ASMClassLoader;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->seed:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    .line 18
    return-void
.end method

.method private _after(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x19

    .line 3
    .line 4
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 13
    .line 14
    .line 15
    const-string v0, "seperator"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x15

    .line 22
    .line 23
    invoke-interface {p1, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "(L"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, ";Ljava/lang/Object;C)C"

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/16 v3, 0xb6

    .line 53
    .line 54
    const-string v4, "writeAfter"

    .line 55
    .line 56
    invoke-interface {p1, v3, v1, v4, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x36

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private _apply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 6

    .line 1
    iget-object p2, p2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x19

    .line 5
    .line 6
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 15
    .line 16
    .line 17
    sget v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 18
    .line 19
    invoke-interface {p1, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    const/16 v3, 0x15

    .line 25
    .line 26
    const-string v4, "valueOf"

    .line 27
    .line 28
    const/16 v5, 0xb8

    .line 29
    .line 30
    if-ne p2, v2, :cond_0

    .line 31
    .line 32
    const-string p2, "byte"

    .line 33
    .line 34
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 39
    .line 40
    .line 41
    const-string p2, "java/lang/Byte"

    .line 42
    .line 43
    const-string p3, "(B)Ljava/lang/Byte;"

    .line 44
    .line 45
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_0
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p2, v2, :cond_1

    .line 53
    .line 54
    const-string p2, "short"

    .line 55
    .line 56
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 61
    .line 62
    .line 63
    const-string p2, "java/lang/Short"

    .line 64
    .line 65
    const-string p3, "(S)Ljava/lang/Short;"

    .line 66
    .line 67
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_1
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    if-ne p2, v2, :cond_2

    .line 75
    .line 76
    const-string p2, "int"

    .line 77
    .line 78
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 83
    .line 84
    .line 85
    const-string p2, "java/lang/Integer"

    .line 86
    .line 87
    const-string p3, "(I)Ljava/lang/Integer;"

    .line 88
    .line 89
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_2
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    if-ne p2, v2, :cond_3

    .line 97
    .line 98
    const-string p2, "char"

    .line 99
    .line 100
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 105
    .line 106
    .line 107
    const-string p2, "java/lang/Character"

    .line 108
    .line 109
    const-string p3, "(C)Ljava/lang/Character;"

    .line 110
    .line 111
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_0

    .line 115
    .line 116
    :cond_3
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 117
    .line 118
    if-ne p2, v2, :cond_4

    .line 119
    .line 120
    const-string p2, "long"

    .line 121
    .line 122
    invoke-virtual {p3, p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    const/16 p3, 0x16

    .line 127
    .line 128
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 129
    .line 130
    .line 131
    const-string p2, "java/lang/Long"

    .line 132
    .line 133
    const-string p3, "(J)Ljava/lang/Long;"

    .line 134
    .line 135
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_4
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 141
    .line 142
    if-ne p2, v2, :cond_5

    .line 143
    .line 144
    const-string p2, "float"

    .line 145
    .line 146
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    const/16 p3, 0x17

    .line 151
    .line 152
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 153
    .line 154
    .line 155
    const-string p2, "java/lang/Float"

    .line 156
    .line 157
    const-string p3, "(F)Ljava/lang/Float;"

    .line 158
    .line 159
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_5
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 165
    .line 166
    if-ne p2, v2, :cond_6

    .line 167
    .line 168
    const-string p2, "double"

    .line 169
    .line 170
    invoke-virtual {p3, p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    const/16 p3, 0x18

    .line 175
    .line 176
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 177
    .line 178
    .line 179
    const-string p2, "java/lang/Double"

    .line 180
    .line 181
    const-string p3, "(D)Ljava/lang/Double;"

    .line 182
    .line 183
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 188
    .line 189
    if-ne p2, v0, :cond_7

    .line 190
    .line 191
    const-string p2, "boolean"

    .line 192
    .line 193
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 198
    .line 199
    .line 200
    const-string p2, "java/lang/Boolean"

    .line 201
    .line 202
    const-string p3, "(Z)Ljava/lang/Boolean;"

    .line 203
    .line 204
    invoke-interface {p1, v5, p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_7
    const-class v0, Ljava/math/BigDecimal;

    .line 209
    .line 210
    if-ne p2, v0, :cond_8

    .line 211
    .line 212
    const-string p2, "decimal"

    .line 213
    .line 214
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_8
    const-class v0, Ljava/lang/String;

    .line 223
    .line 224
    if-ne p2, v0, :cond_9

    .line 225
    .line 226
    const-string p2, "string"

    .line 227
    .line 228
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 233
    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_a

    .line 241
    .line 242
    const-string p2, "enum"

    .line 243
    .line 244
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result p2

    .line 248
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 249
    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_a
    const-class v0, Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    if-eqz p2, :cond_b

    .line 259
    .line 260
    const-string p2, "list"

    .line 261
    .line 262
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 267
    .line 268
    .line 269
    goto :goto_0

    .line 270
    :cond_b
    const-string p2, "object"

    .line 271
    .line 272
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 277
    .line 278
    .line 279
    :goto_0
    sget-object p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 280
    .line 281
    new-instance p3, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v0, "(L"

    .line 287
    .line 288
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string v0, ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z"

    .line 297
    .line 298
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p3

    .line 305
    const/16 v0, 0xb6

    .line 306
    .line 307
    const-string v1, "apply"

    .line 308
    .line 309
    invoke-interface {p1, v0, p2, v1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    return-void
.end method

.method private _before(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x19

    .line 3
    .line 4
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 13
    .line 14
    .line 15
    const-string v0, "seperator"

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v2, 0x15

    .line 22
    .line 23
    invoke-interface {p1, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "(L"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, ";Ljava/lang/Object;C)C"

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/16 v3, 0xb6

    .line 53
    .line 54
    const-string v4, "writeBefore"

    .line 55
    .line 56
    invoke-interface {p1, v3, v1, v4, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0x36

    .line 60
    .line 61
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private _decimal(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "decimal"

    .line 13
    .line 14
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x3a

    .line 19
    .line 20
    invoke-interface {p2, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lcom/alibaba/fastjson/asm/Label;

    .line 27
    .line 28
    invoke-direct {v1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lcom/alibaba/fastjson/asm/Label;

    .line 32
    .line 33
    invoke-direct {v2}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 37
    .line 38
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/16 v4, 0x19

    .line 49
    .line 50
    invoke-interface {p2, v4, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 51
    .line 52
    .line 53
    const/16 v1, 0xc7

    .line 54
    .line 55
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p2, p3, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_if_write_null(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 59
    .line 60
    .line 61
    const/16 p3, 0xa7

    .line 62
    .line 63
    invoke-interface {p2, p3, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p2, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 67
    .line 68
    .line 69
    const-string v1, "out"

    .line 70
    .line 71
    invoke-virtual {p4, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-interface {p2, v4, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 76
    .line 77
    .line 78
    const-string v1, "seperator"

    .line 79
    .line 80
    invoke-virtual {p4, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/16 v2, 0x15

    .line 85
    .line 86
    invoke-interface {p2, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 87
    .line 88
    .line 89
    sget v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 90
    .line 91
    invoke-interface {p2, v4, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-interface {p2, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 102
    .line 103
    const-string v1, "writeFieldValue"

    .line 104
    .line 105
    const-string v2, "(CLjava/lang/String;Ljava/math/BigDecimal;)V"

    .line 106
    .line 107
    const/16 v4, 0xb6

    .line 108
    .line 109
    invoke-interface {p2, v4, v0, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p2, p3, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method private _double(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "double"

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-virtual {p4, v0, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x39

    .line 20
    .line 21
    invoke-interface {p2, v3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 25
    .line 26
    .line 27
    const-string p3, "out"

    .line 28
    .line 29
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/16 v2, 0x19

    .line 34
    .line 35
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 36
    .line 37
    .line 38
    const-string p3, "seperator"

    .line 39
    .line 40
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    const/16 v3, 0x15

    .line 45
    .line 46
    invoke-interface {p2, v3, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 47
    .line 48
    .line 49
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 50
    .line 51
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    const/16 p3, 0x18

    .line 55
    .line 56
    invoke-virtual {p4, v0, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-interface {p2, p3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 61
    .line 62
    .line 63
    sget-object p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 64
    .line 65
    const-string v0, "writeFieldValue"

    .line 66
    .line 67
    const-string v1, "(CLjava/lang/String;D)V"

    .line 68
    .line 69
    const/16 v2, 0xb6

    .line 70
    .line 71
    invoke-interface {p2, v2, p3, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private _enum(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/alibaba/fastjson/asm/Label;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p2, p3, p4, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 20
    .line 21
    .line 22
    const/16 v2, 0xc0

    .line 23
    .line 24
    const-string v3, "java/lang/Enum"

    .line 25
    .line 26
    invoke-interface {p2, v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v2, "enum"

    .line 30
    .line 31
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/16 v5, 0x3a

    .line 36
    .line 37
    invoke-interface {p2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, p2, p3, p4, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/16 v5, 0x19

    .line 48
    .line 49
    invoke-interface {p2, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 50
    .line 51
    .line 52
    const/16 v4, 0xc7

    .line 53
    .line 54
    invoke-interface {p2, v4, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, p2, p3, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_if_write_null(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 58
    .line 59
    .line 60
    const/16 v4, 0xa7

    .line 61
    .line 62
    invoke-interface {p2, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const-string v4, "seperator"

    .line 73
    .line 74
    const/16 v6, 0x15

    .line 75
    .line 76
    const-string v7, "out"

    .line 77
    .line 78
    const/16 v8, 0xb6

    .line 79
    .line 80
    if-eqz p1, :cond_0

    .line 81
    .line 82
    invoke-virtual {p4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p4, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-interface {p2, v6, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 94
    .line 95
    .line 96
    sget p1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 97
    .line 98
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 106
    .line 107
    .line 108
    const-string p1, "name"

    .line 109
    .line 110
    const-string p3, "()Ljava/lang/String;"

    .line 111
    .line 112
    invoke-interface {p2, v8, v3, p1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object p1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 116
    .line 117
    const-string p3, "writeFieldValueStringWithDoubleQuote"

    .line 118
    .line 119
    const-string v2, "(CLjava/lang/String;Ljava/lang/String;)V"

    .line 120
    .line 121
    invoke-interface {p2, v8, p1, p3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p4, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-interface {p2, v6, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 137
    .line 138
    .line 139
    sget-object p1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 140
    .line 141
    const-string v3, "write"

    .line 142
    .line 143
    const-string v4, "(I)V"

    .line 144
    .line 145
    invoke-interface {p2, v8, p1, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    invoke-interface {p2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 153
    .line 154
    .line 155
    sget v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 156
    .line 157
    invoke-interface {p2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 158
    .line 159
    .line 160
    const/4 v3, 0x3

    .line 161
    invoke-interface {p2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 162
    .line 163
    .line 164
    const-string v3, "writeFieldName"

    .line 165
    .line 166
    const-string v4, "(Ljava/lang/String;Z)V"

    .line 167
    .line 168
    invoke-interface {p2, v8, p1, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/4 p1, 0x1

    .line 172
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p4, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 180
    .line 181
    .line 182
    sget p1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 183
    .line 184
    invoke-interface {p2, v5, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 188
    .line 189
    invoke-static {p1}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {p1}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget p1, p3, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 201
    .line 202
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    sget-object p1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 210
    .line 211
    const-string p3, "writeWithFieldName"

    .line 212
    .line 213
    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 214
    .line 215
    invoke-interface {p2, v8, p1, p3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :goto_0
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {p2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method private _filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 4

    .line 1
    iget-boolean v0, p2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldTransient:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "out"

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x19

    .line 12
    .line 13
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->SkipTransientField:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 17
    .line 18
    iget v0, v0, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "isEnabled"

    .line 30
    .line 31
    const-string v2, "(I)Z"

    .line 32
    .line 33
    const/16 v3, 0xb6

    .line 34
    .line 35
    invoke-interface {p1, v3, v0, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/16 v0, 0x9a

    .line 39
    .line 40
    invoke-interface {p1, v0, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_notWriteDefault(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_apply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 54
    .line 55
    .line 56
    const/16 v0, 0x99

    .line 57
    .line 58
    invoke-interface {p1, v0, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_processKey(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_processValue(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method private _float(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "float"

    .line 13
    .line 14
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x38

    .line 19
    .line 20
    invoke-interface {p2, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 24
    .line 25
    .line 26
    const-string p3, "out"

    .line 27
    .line 28
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    const/16 v1, 0x19

    .line 33
    .line 34
    invoke-interface {p2, v1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 35
    .line 36
    .line 37
    const-string p3, "seperator"

    .line 38
    .line 39
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    const/16 v2, 0x15

    .line 44
    .line 45
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 46
    .line 47
    .line 48
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 49
    .line 50
    invoke-interface {p2, v1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 51
    .line 52
    .line 53
    const/16 p3, 0x17

    .line 54
    .line 55
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-interface {p2, p3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 60
    .line 61
    .line 62
    sget-object p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 63
    .line 64
    const-string v0, "writeFieldValue"

    .line 65
    .line 66
    const-string v1, "(CLjava/lang/String;F)V"

    .line 67
    .line 68
    const/16 v2, 0xb6

    .line 69
    .line 70
    invoke-interface {p2, v2, p3, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method private _get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 5

    .line 1
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/16 v1, 0xc0

    .line 4
    .line 5
    const-string v2, "entity"

    .line 6
    .line 7
    const/16 v3, 0x19

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/16 v2, 0xb9

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/16 v2, 0xb6

    .line 32
    .line 33
    :goto_0
    invoke-static {p2}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {p1, v2, p2, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_2

    .line 59
    .line 60
    iget-object p2, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {p2}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {p2, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p3, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    .line 78
    .line 79
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->declaringClass:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/16 v4, 0xb4

    .line 98
    .line 99
    invoke-interface {p1, v4, v0, v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-nez p2, :cond_2

    .line 113
    .line 114
    iget-object p2, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 115
    .line 116
    invoke-static {p2}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-interface {p1, v1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    return-void
.end method

.method private _getFieldSer(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V
    .locals 10

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
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

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
    const-string v5, "_asm_ser_"

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
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer_desc:Ljava/lang/String;

    .line 36
    .line 37
    const/16 v7, 0xb4

    .line 38
    .line 39
    invoke-interface {p2, v7, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/16 v3, 0xc7

    .line 43
    .line 44
    invoke-interface {p2, v3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-interface {p2, v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {v3}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {p2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v8, "(Ljava/lang/Class;)"

    .line 75
    .line 76
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    const/16 v8, 0xb6

    .line 87
    .line 88
    const-string v9, "getObjectWriter"

    .line 89
    .line 90
    invoke-interface {p2, v8, v3, v9, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    new-instance v4, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-object v8, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const/16 v8, 0xb5

    .line 115
    .line 116
    invoke-interface {p2, v8, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    invoke-interface {p2, v7, p1, p3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method private _getListFieldItemSer(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
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
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

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
    const-string v5, "_asm_list_item_ser_"

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
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer_desc:Ljava/lang/String;

    .line 36
    .line 37
    const/16 v7, 0xb4

    .line 38
    .line 39
    invoke-interface {p2, v7, v3, v4, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/16 v3, 0xc7

    .line 43
    .line 44
    invoke-interface {p2, v3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-interface {p2, v1, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    invoke-static {p4}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-static {p4}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    invoke-interface {p2, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget-object p4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, "(Ljava/lang/Class;)"

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const/16 v4, 0xb6

    .line 85
    .line 86
    const-string v8, "getObjectWriter"

    .line 87
    .line 88
    invoke-interface {p2, v4, p4, v8, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    new-instance v3, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object v4, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const/16 v4, 0xb5

    .line 113
    .line 114
    invoke-interface {p2, v4, p4, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p2, v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance p4, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-interface {p2, v7, p1, p3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method private _if_write_null(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 17

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 10
    .line 11
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 12
    .line 13
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 17
    .line 18
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    .line 22
    .line 23
    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 27
    .line 28
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/alibaba/fastjson/util/FieldInfo;->getAnnotation()Lcom/alibaba/fastjson/annotation/JSONField;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-interface {v2}, Lcom/alibaba/fastjson/annotation/JSONField;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->of([Lcom/alibaba/fastjson/serializer/SerializerFeature;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v2, 0x0

    .line 50
    :goto_0
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    iget-object v9, v9, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->jsonType:Lcom/alibaba/fastjson/annotation/JSONType;

    .line 55
    .line 56
    if-eqz v9, :cond_1

    .line 57
    .line 58
    invoke-interface {v9}, Lcom/alibaba/fastjson/annotation/JSONType;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-static {v9}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->of([Lcom/alibaba/fastjson/serializer/SerializerFeature;)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    or-int/2addr v2, v9

    .line 67
    :cond_1
    const-class v9, Ljava/lang/Boolean;

    .line 68
    .line 69
    const-class v10, Ljava/util/Collection;

    .line 70
    .line 71
    const-class v11, Ljava/lang/Number;

    .line 72
    .line 73
    const-class v12, Ljava/lang/String;

    .line 74
    .line 75
    if-ne v4, v12, :cond_2

    .line 76
    .line 77
    sget-object v13, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteMapNullValue:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 78
    .line 79
    invoke-virtual {v13}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    sget-object v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 84
    .line 85
    invoke-virtual {v14}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    :goto_1
    or-int/2addr v13, v14

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    if-eqz v13, :cond_3

    .line 96
    .line 97
    sget-object v13, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteMapNullValue:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 98
    .line 99
    invoke-virtual {v13}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    sget-object v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 104
    .line 105
    invoke-virtual {v14}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    invoke-virtual {v10, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_4

    .line 115
    .line 116
    sget-object v13, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteMapNullValue:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 117
    .line 118
    invoke-virtual {v13}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    sget-object v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 123
    .line 124
    invoke-virtual {v14}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    goto :goto_1

    .line 129
    :cond_4
    if-ne v9, v4, :cond_5

    .line 130
    .line 131
    sget-object v13, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteMapNullValue:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 132
    .line 133
    invoke-virtual {v13}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    sget-object v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 138
    .line 139
    invoke-virtual {v14}, Lcom/alibaba/fastjson/serializer/SerializerFeature;->getMask()I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    goto :goto_1

    .line 144
    :cond_5
    sget v13, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WRITE_MAP_NULL_FEATURES:I

    .line 145
    .line 146
    :goto_2
    and-int v14, v2, v13

    .line 147
    .line 148
    const/16 p2, 0x0

    .line 149
    .line 150
    const-string v5, "out"

    .line 151
    .line 152
    const/16 v15, 0x19

    .line 153
    .line 154
    if-nez v14, :cond_6

    .line 155
    .line 156
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    invoke-interface {v1, v15, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 161
    .line 162
    .line 163
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    invoke-interface {v1, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sget-object v13, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 171
    .line 172
    const-string v14, "isEnabled"

    .line 173
    .line 174
    const-string v15, "(I)Z"

    .line 175
    .line 176
    move/from16 v16, v2

    .line 177
    .line 178
    const/16 v2, 0xb6

    .line 179
    .line 180
    invoke-interface {v1, v2, v13, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/16 v2, 0x99

    .line 184
    .line 185
    invoke-interface {v1, v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_6
    move/from16 v16, v2

    .line 190
    .line 191
    :goto_3
    invoke-interface {v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    const/16 v7, 0x19

    .line 199
    .line 200
    invoke-interface {v1, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 201
    .line 202
    .line 203
    const-string v2, "seperator"

    .line 204
    .line 205
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    const/16 v13, 0x15

    .line 210
    .line 211
    invoke-interface {v1, v13, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 212
    .line 213
    .line 214
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 215
    .line 216
    const-string v13, "write"

    .line 217
    .line 218
    const-string v14, "(I)V"

    .line 219
    .line 220
    const/16 v15, 0xb6

    .line 221
    .line 222
    invoke-interface {v1, v15, v2, v13, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_writeFieldName(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    invoke-interface {v1, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 233
    .line 234
    .line 235
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    if-eq v4, v12, :cond_c

    .line 243
    .line 244
    const-class v5, Ljava/lang/Character;

    .line 245
    .line 246
    if-ne v4, v5, :cond_7

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_7
    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-eqz v5, :cond_8

    .line 254
    .line 255
    sget-object v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 256
    .line 257
    iget v4, v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 258
    .line 259
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_8
    if-ne v4, v9, :cond_9

    .line 268
    .line 269
    sget-object v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 270
    .line 271
    iget v4, v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 272
    .line 273
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_9
    invoke-virtual {v10, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-nez v5, :cond_b

    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eqz v4, :cond_a

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_a
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_b
    :goto_4
    sget-object v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 303
    .line 304
    iget v4, v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 305
    .line 306
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_c
    :goto_5
    sget-object v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 315
    .line 316
    iget v4, v4, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 317
    .line 318
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :goto_6
    const-string v4, "writeNull"

    .line 326
    .line 327
    const-string v5, "(II)V"

    .line 328
    .line 329
    const/16 v15, 0xb6

    .line 330
    .line 331
    invoke-interface {v1, v15, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 335
    .line 336
    .line 337
    const/16 v2, 0xa7

    .line 338
    .line 339
    invoke-interface {v1, v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v1, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 343
    .line 344
    .line 345
    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method private _int(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;IC)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            "IC)V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x36

    .line 13
    .line 14
    invoke-interface {p2, v0, p5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 18
    .line 19
    .line 20
    const-string p3, "out"

    .line 21
    .line 22
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    const/16 v0, 0x19

    .line 27
    .line 28
    invoke-interface {p2, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 29
    .line 30
    .line 31
    const-string p3, "seperator"

    .line 32
    .line 33
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    const/16 v1, 0x15

    .line 38
    .line 39
    invoke-interface {p2, v1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 40
    .line 41
    .line 42
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 43
    .line 44
    invoke-interface {p2, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2, v1, p5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 48
    .line 49
    .line 50
    sget-object p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 51
    .line 52
    new-instance p5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v0, "(CLjava/lang/String;"

    .line 58
    .line 59
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p6, ")V"

    .line 66
    .line 67
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p5

    .line 74
    const/16 p6, 0xb6

    .line 75
    .line 76
    const-string v0, "writeFieldValue"

    .line 77
    .line 78
    invoke-interface {p2, p6, p3, v0, p5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method private _labelApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 2

    .line 1
    const/4 p3, 0x0

    .line 2
    const/16 v0, 0x19

    .line 3
    .line 4
    invoke-interface {p1, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 5
    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    invoke-interface {p1, v0, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p2, Lcom/alibaba/fastjson/util/FieldInfo;->label:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 17
    .line 18
    new-instance p3, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v0, "(L"

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ";Ljava/lang/String;)Z"

    .line 34
    .line 35
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    const/16 v0, 0xb6

    .line 43
    .line 44
    const-string v1, "applyLabel"

    .line 45
    .line 46
    invoke-interface {p1, v0, p2, v1, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/16 p2, 0x99

    .line 50
    .line 51
    invoke-interface {p1, p2, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private _list(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    invoke-static {v4}, Lcom/alibaba/fastjson/util/TypeUtils;->getCollectionItemType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    instance-of v5, v4, Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    move-object v5, v4

    .line 21
    check-cast v5, Ljava/lang/Class;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v5, v6

    .line 25
    :goto_0
    const-class v7, Ljava/lang/Object;

    .line 26
    .line 27
    if-eq v5, v7, :cond_2

    .line 28
    .line 29
    const-class v7, Ljava/io/Serializable;

    .line 30
    .line 31
    if-ne v5, v7, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v6, v5

    .line 35
    :cond_2
    :goto_1
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 36
    .line 37
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    .line 41
    .line 42
    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 46
    .line 47
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1, v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 54
    .line 55
    .line 56
    const/16 v9, 0xc0

    .line 57
    .line 58
    const-string v10, "java/util/List"

    .line 59
    .line 60
    invoke-interface {v1, v9, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v9, "list"

    .line 64
    .line 65
    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    const/16 v12, 0x3a

    .line 70
    .line 71
    invoke-interface {v1, v12, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v1, v2, v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    const/16 v13, 0x19

    .line 82
    .line 83
    invoke-interface {v1, v13, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 84
    .line 85
    .line 86
    const/16 v11, 0xc7

    .line 87
    .line 88
    invoke-interface {v1, v11, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v1, v2, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_if_write_null(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 92
    .line 93
    .line 94
    const/16 v11, 0xa7

    .line 95
    .line 96
    invoke-interface {v1, v11, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 100
    .line 101
    .line 102
    const-string v7, "out"

    .line 103
    .line 104
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v14

    .line 108
    invoke-interface {v1, v13, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 109
    .line 110
    .line 111
    const-string v14, "seperator"

    .line 112
    .line 113
    invoke-virtual {v3, v14}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    const/16 v15, 0x15

    .line 118
    .line 119
    invoke-interface {v1, v15, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 120
    .line 121
    .line 122
    sget-object v14, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 123
    .line 124
    const/16 v12, 0xb6

    .line 125
    .line 126
    const-string v11, "write"

    .line 127
    .line 128
    const-string v15, "(I)V"

    .line 129
    .line 130
    invoke-interface {v1, v12, v14, v11, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_writeFieldName(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    invoke-interface {v1, v13, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 141
    .line 142
    .line 143
    const-string v12, "()I"

    .line 144
    .line 145
    const/16 v13, 0xb9

    .line 146
    .line 147
    move-object/from16 v16, v5

    .line 148
    .line 149
    const-string v5, "size"

    .line 150
    .line 151
    invoke-interface {v1, v13, v10, v5, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/16 v12, 0x36

    .line 155
    .line 156
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    invoke-interface {v1, v12, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 161
    .line 162
    .line 163
    new-instance v12, Lcom/alibaba/fastjson/asm/Label;

    .line 164
    .line 165
    invoke-direct {v12}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance v13, Lcom/alibaba/fastjson/asm/Label;

    .line 169
    .line 170
    invoke-direct {v13}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 171
    .line 172
    .line 173
    move-object/from16 v17, v8

    .line 174
    .line 175
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    const/16 v0, 0x15

    .line 180
    .line 181
    invoke-interface {v1, v0, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 182
    .line 183
    .line 184
    const/4 v0, 0x3

    .line 185
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 186
    .line 187
    .line 188
    const/16 v0, 0xa0

    .line 189
    .line 190
    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    const/16 v8, 0x19

    .line 198
    .line 199
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 200
    .line 201
    .line 202
    const-string v0, "[]"

    .line 203
    .line 204
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    const-string v0, "(Ljava/lang/String;)V"

    .line 208
    .line 209
    const/16 v8, 0xb6

    .line 210
    .line 211
    invoke-interface {v1, v8, v14, v11, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/16 v0, 0xa7

    .line 215
    .line 216
    invoke-interface {v1, v0, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v1, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    const/4 v8, 0x1

    .line 227
    if-nez v0, :cond_3

    .line 228
    .line 229
    const/16 v0, 0x19

    .line 230
    .line 231
    invoke-interface {v1, v0, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v12

    .line 238
    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 239
    .line 240
    .line 241
    sget v12, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 242
    .line 243
    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 247
    .line 248
    const-string v12, "setContext"

    .line 249
    .line 250
    const-string v8, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    .line 251
    .line 252
    move-object/from16 v18, v13

    .line 253
    .line 254
    const/16 v13, 0xb6

    .line 255
    .line 256
    invoke-interface {v1, v13, v0, v12, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_3
    move-object/from16 v18, v13

    .line 261
    .line 262
    :goto_2
    const-class v0, Ljava/lang/String;

    .line 263
    .line 264
    if-ne v4, v0, :cond_4

    .line 265
    .line 266
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_4

    .line 271
    .line 272
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    const/16 v8, 0x19

    .line 277
    .line 278
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 286
    .line 287
    .line 288
    const-string v0, "(Ljava/util/List;)V"

    .line 289
    .line 290
    const/16 v13, 0xb6

    .line 291
    .line 292
    invoke-interface {v1, v13, v14, v11, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const/4 v9, 0x1

    .line 296
    goto/16 :goto_b

    .line 297
    .line 298
    :cond_4
    const/16 v8, 0x19

    .line 299
    .line 300
    const/16 v13, 0xb6

    .line 301
    .line 302
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 307
    .line 308
    .line 309
    const/16 v0, 0x5b

    .line 310
    .line 311
    const/16 v8, 0x10

    .line 312
    .line 313
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v1, v13, v14, v11, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 320
    .line 321
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 322
    .line 323
    .line 324
    new-instance v12, Lcom/alibaba/fastjson/asm/Label;

    .line 325
    .line 326
    invoke-direct {v12}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 327
    .line 328
    .line 329
    new-instance v13, Lcom/alibaba/fastjson/asm/Label;

    .line 330
    .line 331
    invoke-direct {v13}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 332
    .line 333
    .line 334
    const/4 v8, 0x3

    .line 335
    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 336
    .line 337
    .line 338
    const/16 v8, 0x36

    .line 339
    .line 340
    move-object/from16 v19, v4

    .line 341
    .line 342
    const-string v4, "i"

    .line 343
    .line 344
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    const/16 v8, 0x15

    .line 359
    .line 360
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 368
    .line 369
    .line 370
    const/16 v2, 0xa2

    .line 371
    .line 372
    invoke-interface {v1, v2, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 380
    .line 381
    .line 382
    const/16 v2, 0x99

    .line 383
    .line 384
    invoke-interface {v1, v2, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    const/16 v8, 0x19

    .line 392
    .line 393
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 394
    .line 395
    .line 396
    const/16 v2, 0x2c

    .line 397
    .line 398
    const/16 v5, 0x10

    .line 399
    .line 400
    invoke-interface {v1, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 401
    .line 402
    .line 403
    const/16 v2, 0xb6

    .line 404
    .line 405
    invoke-interface {v1, v2, v14, v11, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v1, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    const/16 v8, 0x15

    .line 423
    .line 424
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 425
    .line 426
    .line 427
    const-string v2, "get"

    .line 428
    .line 429
    const-string v5, "(I)Ljava/lang/Object;"

    .line 430
    .line 431
    const/16 v8, 0xb9

    .line 432
    .line 433
    invoke-interface {v1, v8, v10, v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    const-string v2, "list_item"

    .line 437
    .line 438
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    const/16 v8, 0x3a

    .line 443
    .line 444
    invoke-interface {v1, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 445
    .line 446
    .line 447
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 448
    .line 449
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 450
    .line 451
    .line 452
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 453
    .line 454
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    const/16 v10, 0x19

    .line 462
    .line 463
    invoke-interface {v1, v10, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 464
    .line 465
    .line 466
    const/16 v9, 0xc7

    .line 467
    .line 468
    invoke-interface {v1, v9, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    invoke-interface {v1, v10, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 476
    .line 477
    .line 478
    const-string v9, "writeNull"

    .line 479
    .line 480
    const-string v10, "()V"

    .line 481
    .line 482
    const/16 v12, 0xb6

    .line 483
    .line 484
    invoke-interface {v1, v12, v14, v9, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    const/16 v9, 0xa7

    .line 488
    .line 489
    invoke-interface {v1, v9, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 493
    .line 494
    .line 495
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 496
    .line 497
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 498
    .line 499
    .line 500
    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    .line 501
    .line 502
    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 503
    .line 504
    .line 505
    const-string v10, "(I)Ljava/lang/Integer;"

    .line 506
    .line 507
    const-string v12, "valueOf"

    .line 508
    .line 509
    move-object/from16 v20, v14

    .line 510
    .line 511
    const-string v14, "java/lang/Integer"

    .line 512
    .line 513
    move-object/from16 v21, v15

    .line 514
    .line 515
    if-eqz v6, :cond_9

    .line 516
    .line 517
    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    .line 518
    .line 519
    .line 520
    move-result v22

    .line 521
    invoke-static/range {v22 .. v22}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 522
    .line 523
    .line 524
    move-result v22

    .line 525
    if-eqz v22, :cond_9

    .line 526
    .line 527
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 528
    .line 529
    .line 530
    move-result v15

    .line 531
    move-object/from16 v23, v7

    .line 532
    .line 533
    const/16 v7, 0x19

    .line 534
    .line 535
    invoke-interface {v1, v7, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 536
    .line 537
    .line 538
    const-string v7, "getClass"

    .line 539
    .line 540
    const-string v15, "()Ljava/lang/Class;"

    .line 541
    .line 542
    move-object/from16 v24, v13

    .line 543
    .line 544
    const-string v13, "java/lang/Object"

    .line 545
    .line 546
    move-object/from16 v25, v0

    .line 547
    .line 548
    const/16 v0, 0xb6

    .line 549
    .line 550
    invoke-interface {v1, v0, v13, v7, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    invoke-static {v6}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    const/16 v0, 0xa6

    .line 565
    .line 566
    invoke-interface {v1, v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 567
    .line 568
    .line 569
    move-object/from16 v0, p0

    .line 570
    .line 571
    move-object/from16 v7, p3

    .line 572
    .line 573
    invoke-direct {v0, v3, v1, v7, v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_getListFieldItemSer(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V

    .line 574
    .line 575
    .line 576
    const-string v13, "list_item_desc"

    .line 577
    .line 578
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 579
    .line 580
    .line 581
    move-result v15

    .line 582
    move-object/from16 v26, v6

    .line 583
    .line 584
    const/16 v6, 0x3a

    .line 585
    .line 586
    invoke-interface {v1, v6, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 587
    .line 588
    .line 589
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 590
    .line 591
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 592
    .line 593
    .line 594
    new-instance v15, Lcom/alibaba/fastjson/asm/Label;

    .line 595
    .line 596
    invoke-direct {v15}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 597
    .line 598
    .line 599
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 600
    .line 601
    .line 602
    move-result v27

    .line 603
    if-eqz v27, :cond_7

    .line 604
    .line 605
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 606
    .line 607
    .line 608
    move-result v27

    .line 609
    if-eqz v27, :cond_5

    .line 610
    .line 611
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 612
    .line 613
    .line 614
    move-result v27

    .line 615
    if-eqz v27, :cond_5

    .line 616
    .line 617
    const-string v27, "writeDirectNonContext"

    .line 618
    .line 619
    move-object/from16 v0, v27

    .line 620
    .line 621
    :goto_3
    move-object/from16 p1, v5

    .line 622
    .line 623
    goto :goto_4

    .line 624
    :cond_5
    move-object v0, v11

    .line 625
    goto :goto_3

    .line 626
    :goto_4
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 627
    .line 628
    .line 629
    move-result v5

    .line 630
    move-object/from16 v27, v9

    .line 631
    .line 632
    const/16 v9, 0x19

    .line 633
    .line 634
    invoke-interface {v1, v9, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 635
    .line 636
    .line 637
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 638
    .line 639
    const/16 v9, 0xc1

    .line 640
    .line 641
    invoke-interface {v1, v9, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 642
    .line 643
    .line 644
    const/16 v9, 0x99

    .line 645
    .line 646
    invoke-interface {v1, v9, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 650
    .line 651
    .line 652
    move-result v9

    .line 653
    move-object/from16 v28, v8

    .line 654
    .line 655
    const/16 v8, 0x19

    .line 656
    .line 657
    invoke-interface {v1, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 658
    .line 659
    .line 660
    const/16 v9, 0xc0

    .line 661
    .line 662
    invoke-interface {v1, v9, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 663
    .line 664
    .line 665
    const/4 v9, 0x1

    .line 666
    invoke-interface {v1, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 670
    .line 671
    .line 672
    move-result v9

    .line 673
    invoke-interface {v1, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 674
    .line 675
    .line 676
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 677
    .line 678
    .line 679
    move-result v8

    .line 680
    if-eqz v8, :cond_6

    .line 681
    .line 682
    const/4 v9, 0x1

    .line 683
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 684
    .line 685
    .line 686
    goto :goto_5

    .line 687
    :cond_6
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    const/16 v9, 0x15

    .line 692
    .line 693
    invoke-interface {v1, v9, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 694
    .line 695
    .line 696
    const/16 v8, 0xb8

    .line 697
    .line 698
    invoke-interface {v1, v8, v14, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    :goto_5
    invoke-static/range {v26 .. v26}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v8

    .line 705
    invoke-static {v8}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 706
    .line 707
    .line 708
    move-result-object v8

    .line 709
    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    iget v8, v7, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 713
    .line 714
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object v8

    .line 718
    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    new-instance v8, Ljava/lang/StringBuilder;

    .line 722
    .line 723
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 724
    .line 725
    .line 726
    const-string v9, "(L"

    .line 727
    .line 728
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    sget-object v9, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 732
    .line 733
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    const-string v9, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 737
    .line 738
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v8

    .line 745
    const/16 v9, 0xb6

    .line 746
    .line 747
    invoke-interface {v1, v9, v5, v0, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    const/16 v0, 0xa7

    .line 751
    .line 752
    invoke-interface {v1, v0, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 753
    .line 754
    .line 755
    invoke-interface {v1, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 756
    .line 757
    .line 758
    goto :goto_6

    .line 759
    :cond_7
    move-object/from16 p1, v5

    .line 760
    .line 761
    move-object/from16 v28, v8

    .line 762
    .line 763
    move-object/from16 v27, v9

    .line 764
    .line 765
    :goto_6
    invoke-virtual {v3, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    const/16 v8, 0x19

    .line 770
    .line 771
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 772
    .line 773
    .line 774
    const/4 v9, 0x1

    .line 775
    invoke-interface {v1, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 783
    .line 784
    .line 785
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 786
    .line 787
    .line 788
    move-result v0

    .line 789
    if-eqz v0, :cond_8

    .line 790
    .line 791
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 792
    .line 793
    .line 794
    goto :goto_7

    .line 795
    :cond_8
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    const/16 v8, 0x15

    .line 800
    .line 801
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 802
    .line 803
    .line 804
    const/16 v8, 0xb8

    .line 805
    .line 806
    invoke-interface {v1, v8, v14, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    :goto_7
    invoke-static/range {v26 .. v26}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    iget v0, v7, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 821
    .line 822
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer:Ljava/lang/String;

    .line 830
    .line 831
    new-instance v5, Ljava/lang/StringBuilder;

    .line 832
    .line 833
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 834
    .line 835
    .line 836
    const-string v6, "(L"

    .line 837
    .line 838
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 842
    .line 843
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    const-string v6, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 847
    .line 848
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v5

    .line 855
    const/16 v8, 0xb9

    .line 856
    .line 857
    invoke-interface {v1, v8, v0, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-interface {v1, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 861
    .line 862
    .line 863
    move-object/from16 v0, v28

    .line 864
    .line 865
    const/16 v9, 0xa7

    .line 866
    .line 867
    invoke-interface {v1, v9, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 868
    .line 869
    .line 870
    move-object/from16 v5, v27

    .line 871
    .line 872
    goto :goto_8

    .line 873
    :cond_9
    move-object/from16 v25, v0

    .line 874
    .line 875
    move-object/from16 p1, v5

    .line 876
    .line 877
    move-object/from16 v26, v6

    .line 878
    .line 879
    move-object/from16 v23, v7

    .line 880
    .line 881
    move-object v0, v8

    .line 882
    move-object/from16 v24, v13

    .line 883
    .line 884
    move-object/from16 v7, p3

    .line 885
    .line 886
    move-object v5, v9

    .line 887
    :goto_8
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 888
    .line 889
    .line 890
    const/16 v8, 0x19

    .line 891
    .line 892
    const/4 v9, 0x1

    .line 893
    invoke-interface {v1, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 901
    .line 902
    .line 903
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 904
    .line 905
    .line 906
    move-result v2

    .line 907
    if-eqz v2, :cond_a

    .line 908
    .line 909
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 910
    .line 911
    .line 912
    goto :goto_9

    .line 913
    :cond_a
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    const/16 v8, 0x15

    .line 918
    .line 919
    invoke-interface {v1, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 920
    .line 921
    .line 922
    const/16 v8, 0xb8

    .line 923
    .line 924
    invoke-interface {v1, v8, v14, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    :goto_9
    if-eqz v26, :cond_b

    .line 928
    .line 929
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getModifiers()I

    .line 930
    .line 931
    .line 932
    move-result v2

    .line 933
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 934
    .line 935
    .line 936
    move-result v2

    .line 937
    if-eqz v2, :cond_b

    .line 938
    .line 939
    move-object/from16 v2, v19

    .line 940
    .line 941
    check-cast v2, Ljava/lang/Class;

    .line 942
    .line 943
    invoke-static {v2}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    invoke-static {v2}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    iget v2, v7, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 955
    .line 956
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 964
    .line 965
    const-string v5, "writeWithFieldName"

    .line 966
    .line 967
    const-string v6, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 968
    .line 969
    const/16 v13, 0xb6

    .line 970
    .line 971
    invoke-interface {v1, v13, v2, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    goto :goto_a

    .line 975
    :cond_b
    const/16 v13, 0xb6

    .line 976
    .line 977
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 978
    .line 979
    const-string v5, "writeWithFieldName"

    .line 980
    .line 981
    const-string v6, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    .line 982
    .line 983
    invoke-interface {v1, v13, v2, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    :goto_a
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 987
    .line 988
    .line 989
    move-object/from16 v0, p1

    .line 990
    .line 991
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    const/4 v9, 0x1

    .line 999
    invoke-interface {v1, v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIincInsn(II)V

    .line 1000
    .line 1001
    .line 1002
    move-object/from16 v0, v25

    .line 1003
    .line 1004
    const/16 v2, 0xa7

    .line 1005
    .line 1006
    invoke-interface {v1, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 1007
    .line 1008
    .line 1009
    move-object/from16 v0, v24

    .line 1010
    .line 1011
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1012
    .line 1013
    .line 1014
    move-object/from16 v0, v23

    .line 1015
    .line 1016
    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1017
    .line 1018
    .line 1019
    move-result v0

    .line 1020
    const/16 v8, 0x19

    .line 1021
    .line 1022
    invoke-interface {v1, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1023
    .line 1024
    .line 1025
    const/16 v0, 0x5d

    .line 1026
    .line 1027
    const/16 v5, 0x10

    .line 1028
    .line 1029
    invoke-interface {v1, v5, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1030
    .line 1031
    .line 1032
    move-object/from16 v0, v20

    .line 1033
    .line 1034
    move-object/from16 v2, v21

    .line 1035
    .line 1036
    const/16 v13, 0xb6

    .line 1037
    .line 1038
    invoke-interface {v1, v13, v0, v11, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    :goto_b
    invoke-interface {v1, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1042
    .line 1043
    .line 1044
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 1045
    .line 1046
    const-string v2, "popContext"

    .line 1047
    .line 1048
    const-string v4, "()V"

    .line 1049
    .line 1050
    invoke-interface {v1, v13, v0, v2, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    move-object/from16 v0, v18

    .line 1054
    .line 1055
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1056
    .line 1057
    .line 1058
    move-object/from16 v0, p0

    .line 1059
    .line 1060
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1061
    .line 1062
    .line 1063
    move-object/from16 v2, v17

    .line 1064
    .line 1065
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1066
    .line 1067
    .line 1068
    move-object/from16 v2, v16

    .line 1069
    .line 1070
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1071
    .line 1072
    .line 1073
    return-void
.end method

.method private _long(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "long"

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-virtual {p4, v0, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0x37

    .line 20
    .line 21
    invoke-interface {p2, v3, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 25
    .line 26
    .line 27
    const-string p3, "out"

    .line 28
    .line 29
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    const/16 v2, 0x19

    .line 34
    .line 35
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 36
    .line 37
    .line 38
    const-string p3, "seperator"

    .line 39
    .line 40
    invoke-virtual {p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    const/16 v3, 0x15

    .line 45
    .line 46
    invoke-interface {p2, v3, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 47
    .line 48
    .line 49
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 50
    .line 51
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    .line 53
    .line 54
    const/16 p3, 0x16

    .line 55
    .line 56
    invoke-virtual {p4, v0, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-interface {p2, p3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 61
    .line 62
    .line 63
    sget-object p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 64
    .line 65
    const-string v0, "writeFieldValue"

    .line 66
    .line 67
    const-string v1, "(CLjava/lang/String;J)V"

    .line 68
    .line 69
    const/16 v2, 0xb6

    .line 70
    .line 71
    invoke-interface {p2, v2, p3, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method private _nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 5

    .line 1
    invoke-static {p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xb6

    .line 6
    .line 7
    const/16 v2, 0x19

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-interface {p1, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-interface {p1, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-interface {p1, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 21
    .line 22
    .line 23
    sget v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 24
    .line 25
    invoke-interface {p1, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v4, "(L"

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    sget-object v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, ";Ljava/lang/Object;Ljava/lang/String;)Z"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "applyName"

    .line 55
    .line 56
    invoke-interface {p1, v1, v0, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x99

    .line 60
    .line 61
    invoke-interface {p1, v0, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_labelApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget-object p2, p2, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    .line 68
    .line 69
    if-nez p2, :cond_1

    .line 70
    .line 71
    const-string p2, "out"

    .line 72
    .line 73
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 78
    .line 79
    .line 80
    sget-object p2, Lcom/alibaba/fastjson/serializer/SerializerFeature;->IgnoreNonFieldGetter:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 81
    .line 82
    iget p2, p2, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 83
    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 92
    .line 93
    const-string p3, "isEnabled"

    .line 94
    .line 95
    const-string v0, "(I)Z"

    .line 96
    .line 97
    invoke-interface {p1, v1, p2, p3, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/16 p2, 0x9a

    .line 101
    .line 102
    invoke-interface {p1, p2, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method private _notWriteDefault(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 4

    .line 1
    invoke-static {p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "notWriteDefaultValue"

    .line 14
    .line 15
    invoke-virtual {p3, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/16 v2, 0x15

    .line 20
    .line 21
    invoke-interface {p1, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x99

    .line 25
    .line 26
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 30
    .line 31
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-ne p2, v3, :cond_1

    .line 34
    .line 35
    const-string p2, "boolean"

    .line 36
    .line 37
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_1
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p2, v3, :cond_2

    .line 52
    .line 53
    const-string p2, "byte"

    .line 54
    .line 55
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_2
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne p2, v3, :cond_3

    .line 70
    .line 71
    const-string p2, "short"

    .line 72
    .line 73
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    if-ne p2, v3, :cond_4

    .line 87
    .line 88
    const-string p2, "int"

    .line 89
    .line 90
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 102
    .line 103
    if-ne p2, v2, :cond_5

    .line 104
    .line 105
    const-string p2, "long"

    .line 106
    .line 107
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    const/16 p3, 0x16

    .line 112
    .line 113
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 114
    .line 115
    .line 116
    const/16 p2, 0x9

    .line 117
    .line 118
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 119
    .line 120
    .line 121
    const/16 p2, 0x94

    .line 122
    .line 123
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_5
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 131
    .line 132
    if-ne p2, v2, :cond_6

    .line 133
    .line 134
    const-string p2, "float"

    .line 135
    .line 136
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    const/16 p3, 0x17

    .line 141
    .line 142
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 143
    .line 144
    .line 145
    const/16 p2, 0xb

    .line 146
    .line 147
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 148
    .line 149
    .line 150
    const/16 p2, 0x95

    .line 151
    .line 152
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 156
    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_6
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 160
    .line 161
    if-ne p2, v2, :cond_7

    .line 162
    .line 163
    const-string p2, "double"

    .line 164
    .line 165
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    const/16 p3, 0x18

    .line 170
    .line 171
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 172
    .line 173
    .line 174
    const/16 p2, 0xe

    .line 175
    .line 176
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 177
    .line 178
    .line 179
    const/16 p2, 0x97

    .line 180
    .line 181
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p1, v1, p4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 185
    .line 186
    .line 187
    :cond_7
    :goto_0
    invoke-interface {p1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 188
    .line 189
    .line 190
    return-void
.end method

.method private _object(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "object"

    .line 13
    .line 14
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0x3a

    .line 19
    .line 20
    invoke-interface {p2, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_writeObject(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private _processKey(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "hasNameFilters"

    .line 7
    .line 8
    invoke-virtual {p3, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-interface {p1, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x99

    .line 18
    .line 19
    invoke-interface {p1, v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/16 v3, 0x19

    .line 26
    .line 27
    invoke-interface {p1, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-interface {p1, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    invoke-interface {p1, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 36
    .line 37
    .line 38
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 39
    .line 40
    invoke-interface {p1, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 41
    .line 42
    .line 43
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    const-string v5, "valueOf"

    .line 46
    .line 47
    const/16 v6, 0xb8

    .line 48
    .line 49
    if-ne p2, v4, :cond_0

    .line 50
    .line 51
    const-string p2, "byte"

    .line 52
    .line 53
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 58
    .line 59
    .line 60
    const-string p2, "java/lang/Byte"

    .line 61
    .line 62
    const-string p3, "(B)Ljava/lang/Byte;"

    .line 63
    .line 64
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_0
    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    if-ne p2, v4, :cond_1

    .line 72
    .line 73
    const-string p2, "short"

    .line 74
    .line 75
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 80
    .line 81
    .line 82
    const-string p2, "java/lang/Short"

    .line 83
    .line 84
    const-string p3, "(S)Ljava/lang/Short;"

    .line 85
    .line 86
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_1
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 92
    .line 93
    if-ne p2, v4, :cond_2

    .line 94
    .line 95
    const-string p2, "int"

    .line 96
    .line 97
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 102
    .line 103
    .line 104
    const-string p2, "java/lang/Integer"

    .line 105
    .line 106
    const-string p3, "(I)Ljava/lang/Integer;"

    .line 107
    .line 108
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_2
    sget-object v4, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 114
    .line 115
    if-ne p2, v4, :cond_3

    .line 116
    .line 117
    const-string p2, "char"

    .line 118
    .line 119
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 124
    .line 125
    .line 126
    const-string p2, "java/lang/Character"

    .line 127
    .line 128
    const-string p3, "(C)Ljava/lang/Character;"

    .line 129
    .line 130
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_3
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 136
    .line 137
    if-ne p2, v4, :cond_4

    .line 138
    .line 139
    const-string p2, "long"

    .line 140
    .line 141
    invoke-virtual {p3, p2, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    const/16 p3, 0x16

    .line 146
    .line 147
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 148
    .line 149
    .line 150
    const-string p2, "java/lang/Long"

    .line 151
    .line 152
    const-string p3, "(J)Ljava/lang/Long;"

    .line 153
    .line 154
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_4
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 160
    .line 161
    if-ne p2, v4, :cond_5

    .line 162
    .line 163
    const-string p2, "float"

    .line 164
    .line 165
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    const/16 p3, 0x17

    .line 170
    .line 171
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 172
    .line 173
    .line 174
    const-string p2, "java/lang/Float"

    .line 175
    .line 176
    const-string p3, "(F)Ljava/lang/Float;"

    .line 177
    .line 178
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_5
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 184
    .line 185
    if-ne p2, v4, :cond_6

    .line 186
    .line 187
    const-string p2, "double"

    .line 188
    .line 189
    invoke-virtual {p3, p2, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    const/16 p3, 0x18

    .line 194
    .line 195
    invoke-interface {p1, p3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 196
    .line 197
    .line 198
    const-string p2, "java/lang/Double"

    .line 199
    .line 200
    const-string p3, "(D)Ljava/lang/Double;"

    .line 201
    .line 202
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    goto :goto_0

    .line 206
    :cond_6
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 207
    .line 208
    if-ne p2, v1, :cond_7

    .line 209
    .line 210
    const-string p2, "boolean"

    .line 211
    .line 212
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    invoke-interface {p1, v2, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 217
    .line 218
    .line 219
    const-string p2, "java/lang/Boolean"

    .line 220
    .line 221
    const-string p3, "(Z)Ljava/lang/Boolean;"

    .line 222
    .line 223
    invoke-interface {p1, v6, p2, v5, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_7
    const-class v1, Ljava/math/BigDecimal;

    .line 228
    .line 229
    if-ne p2, v1, :cond_8

    .line 230
    .line 231
    const-string p2, "decimal"

    .line 232
    .line 233
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 238
    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_8
    const-class v1, Ljava/lang/String;

    .line 242
    .line 243
    if-ne p2, v1, :cond_9

    .line 244
    .line 245
    const-string p2, "string"

    .line 246
    .line 247
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    move-result p2

    .line 251
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 252
    .line 253
    .line 254
    goto :goto_0

    .line 255
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_a

    .line 260
    .line 261
    const-string p2, "enum"

    .line 262
    .line 263
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 268
    .line 269
    .line 270
    goto :goto_0

    .line 271
    :cond_a
    const-class v1, Ljava/util/List;

    .line 272
    .line 273
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_b

    .line 278
    .line 279
    const-string p2, "list"

    .line 280
    .line 281
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 286
    .line 287
    .line 288
    goto :goto_0

    .line 289
    :cond_b
    const-string p2, "object"

    .line 290
    .line 291
    invoke-virtual {p3, p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 296
    .line 297
    .line 298
    :goto_0
    sget-object p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 299
    .line 300
    new-instance p3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const-string v1, "(L"

    .line 306
    .line 307
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    sget-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    const-string v1, ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;"

    .line 316
    .line 317
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p3

    .line 324
    const/16 v1, 0xb6

    .line 325
    .line 326
    const-string v2, "processKey"

    .line 327
    .line 328
    invoke-interface {p1, v1, p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const/16 p2, 0x3a

    .line 332
    .line 333
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 334
    .line 335
    invoke-interface {p1, p2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 336
    .line 337
    .line 338
    invoke-interface {p1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 339
    .line 340
    .line 341
    return-void
.end method

.method private _processValue(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 16

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
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 8
    .line 9
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v4, v1, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/16 v6, 0xa7

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    const/16 v8, 0x15

    .line 22
    .line 23
    const/16 v9, 0x59

    .line 24
    .line 25
    const/16 v10, 0x3a

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 30
    .line 31
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v11, "checkValue"

    .line 35
    .line 36
    invoke-virtual {v2, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    invoke-interface {v0, v8, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 41
    .line 42
    .line 43
    const/16 v11, 0x9a

    .line 44
    .line 45
    invoke-interface {v0, v11, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 52
    .line 53
    .line 54
    sget v11, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 55
    .line 56
    invoke-interface {v0, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 57
    .line 58
    .line 59
    sget v11, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->processValue:I

    .line 60
    .line 61
    invoke-interface {v0, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    const/16 v5, 0x19

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    invoke-interface {v0, v5, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v5, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v5, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 80
    .line 81
    .line 82
    iget-object v7, v1, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v2, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->getFieldOrinal(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-interface {v0, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 96
    .line 97
    new-instance v11, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v12, "(I)"

    .line 103
    .line 104
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-class v12, Lcom/alibaba/fastjson/serializer/BeanContext;

    .line 108
    .line 109
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v13

    .line 113
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    const/16 v13, 0xb6

    .line 121
    .line 122
    const-string v14, "getBeanContext"

    .line 123
    .line 124
    invoke-interface {v0, v13, v7, v14, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v11, 0x2

    .line 128
    invoke-interface {v0, v5, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 129
    .line 130
    .line 131
    sget v14, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 132
    .line 133
    invoke-interface {v0, v5, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 134
    .line 135
    .line 136
    sget-object v14, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    const-string v15, "valueOf"

    .line 139
    .line 140
    const/16 v6, 0xb8

    .line 141
    .line 142
    if-ne v4, v14, :cond_1

    .line 143
    .line 144
    const-string v4, "byte"

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 151
    .line 152
    .line 153
    const-string v4, "java/lang/Byte"

    .line 154
    .line 155
    const-string v8, "(B)Ljava/lang/Byte;"

    .line 156
    .line 157
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 161
    .line 162
    .line 163
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 164
    .line 165
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_1
    sget-object v14, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 171
    .line 172
    if-ne v4, v14, :cond_2

    .line 173
    .line 174
    const-string v4, "short"

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 181
    .line 182
    .line 183
    const-string v4, "java/lang/Short"

    .line 184
    .line 185
    const-string v8, "(S)Ljava/lang/Short;"

    .line 186
    .line 187
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 191
    .line 192
    .line 193
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 194
    .line 195
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_2
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 201
    .line 202
    if-ne v4, v14, :cond_3

    .line 203
    .line 204
    const-string v4, "int"

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 211
    .line 212
    .line 213
    const-string v4, "java/lang/Integer"

    .line 214
    .line 215
    const-string v8, "(I)Ljava/lang/Integer;"

    .line 216
    .line 217
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 221
    .line 222
    .line 223
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 224
    .line 225
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 226
    .line 227
    .line 228
    goto/16 :goto_0

    .line 229
    .line 230
    :cond_3
    sget-object v14, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 231
    .line 232
    if-ne v4, v14, :cond_4

    .line 233
    .line 234
    const-string v4, "char"

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 241
    .line 242
    .line 243
    const-string v4, "java/lang/Character"

    .line 244
    .line 245
    const-string v8, "(C)Ljava/lang/Character;"

    .line 246
    .line 247
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 251
    .line 252
    .line 253
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 254
    .line 255
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_4
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 261
    .line 262
    if-ne v4, v14, :cond_5

    .line 263
    .line 264
    const-string v4, "long"

    .line 265
    .line 266
    invoke-virtual {v2, v4, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    const/16 v8, 0x16

    .line 271
    .line 272
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 273
    .line 274
    .line 275
    const-string v4, "java/lang/Long"

    .line 276
    .line 277
    const-string v8, "(J)Ljava/lang/Long;"

    .line 278
    .line 279
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 283
    .line 284
    .line 285
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 286
    .line 287
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_5
    sget-object v14, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 293
    .line 294
    if-ne v4, v14, :cond_6

    .line 295
    .line 296
    const-string v4, "float"

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    const/16 v8, 0x17

    .line 303
    .line 304
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 305
    .line 306
    .line 307
    const-string v4, "java/lang/Float"

    .line 308
    .line 309
    const-string v8, "(F)Ljava/lang/Float;"

    .line 310
    .line 311
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 315
    .line 316
    .line 317
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 318
    .line 319
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_0

    .line 323
    .line 324
    :cond_6
    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 325
    .line 326
    if-ne v4, v14, :cond_7

    .line 327
    .line 328
    const-string v4, "double"

    .line 329
    .line 330
    invoke-virtual {v2, v4, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;I)I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    const/16 v8, 0x18

    .line 335
    .line 336
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 337
    .line 338
    .line 339
    const-string v4, "java/lang/Double"

    .line 340
    .line 341
    const-string v8, "(D)Ljava/lang/Double;"

    .line 342
    .line 343
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 347
    .line 348
    .line 349
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 350
    .line 351
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :cond_7
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 357
    .line 358
    if-ne v4, v11, :cond_8

    .line 359
    .line 360
    const-string v4, "boolean"

    .line 361
    .line 362
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    invoke-interface {v0, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 367
    .line 368
    .line 369
    const-string v4, "java/lang/Boolean"

    .line 370
    .line 371
    const-string v8, "(Z)Ljava/lang/Boolean;"

    .line 372
    .line 373
    invoke-interface {v0, v6, v4, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v0, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 377
    .line 378
    .line 379
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 380
    .line 381
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_8
    const-class v6, Ljava/math/BigDecimal;

    .line 387
    .line 388
    if-ne v4, v6, :cond_9

    .line 389
    .line 390
    const-string v4, "decimal"

    .line 391
    .line 392
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 397
    .line 398
    .line 399
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 400
    .line 401
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 402
    .line 403
    .line 404
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 405
    .line 406
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 407
    .line 408
    .line 409
    goto :goto_0

    .line 410
    :cond_9
    const-class v6, Ljava/lang/String;

    .line 411
    .line 412
    if-ne v4, v6, :cond_a

    .line 413
    .line 414
    const-string v4, "string"

    .line 415
    .line 416
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 421
    .line 422
    .line 423
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 424
    .line 425
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 426
    .line 427
    .line 428
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 429
    .line 430
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 431
    .line 432
    .line 433
    goto :goto_0

    .line 434
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Class;->isEnum()Z

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    if-eqz v6, :cond_b

    .line 439
    .line 440
    const-string v4, "enum"

    .line 441
    .line 442
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 447
    .line 448
    .line 449
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 450
    .line 451
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 452
    .line 453
    .line 454
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 455
    .line 456
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 457
    .line 458
    .line 459
    goto :goto_0

    .line 460
    :cond_b
    const-class v6, Ljava/util/List;

    .line 461
    .line 462
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_c

    .line 467
    .line 468
    const-string v4, "list"

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 475
    .line 476
    .line 477
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 478
    .line 479
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 480
    .line 481
    .line 482
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 483
    .line 484
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 485
    .line 486
    .line 487
    goto :goto_0

    .line 488
    :cond_c
    const-string v4, "object"

    .line 489
    .line 490
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 495
    .line 496
    .line 497
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 498
    .line 499
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 500
    .line 501
    .line 502
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 503
    .line 504
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 505
    .line 506
    .line 507
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const-string v6, "(L"

    .line 513
    .line 514
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 518
    .line 519
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    const-string v6, ";"

    .line 523
    .line 524
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v6

    .line 531
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    const-string v6, "Ljava/lang/Object;Ljava/lang/String;"

    .line 535
    .line 536
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    const-string v6, "Ljava/lang/Object;"

    .line 540
    .line 541
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    const-string v6, ")Ljava/lang/Object;"

    .line 545
    .line 546
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    const-string v6, "processValue"

    .line 554
    .line 555
    invoke-interface {v0, v13, v7, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->processValue:I

    .line 559
    .line 560
    invoke-interface {v0, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 561
    .line 562
    .line 563
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->original:I

    .line 564
    .line 565
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 566
    .line 567
    .line 568
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->processValue:I

    .line 569
    .line 570
    invoke-interface {v0, v5, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 571
    .line 572
    .line 573
    const/16 v4, 0xa5

    .line 574
    .line 575
    invoke-interface {v0, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 576
    .line 577
    .line 578
    invoke-direct/range {p0 .. p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_writeObject(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v1, p4

    .line 582
    .line 583
    const/16 v2, 0xa7

    .line 584
    .line 585
    invoke-interface {v0, v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 586
    .line 587
    .line 588
    invoke-interface {v0, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 589
    .line 590
    .line 591
    return-void
.end method

.method private _seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x2c

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 6
    .line 7
    .line 8
    const-string v0, "seperator"

    .line 9
    .line 10
    invoke-virtual {p2, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/16 v0, 0x36

    .line 15
    .line 16
    invoke-interface {p1, v0, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private _string(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/alibaba/fastjson/asm/Label;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->typeKey:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0xb6

    .line 19
    .line 20
    const/16 v2, 0x19

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-interface {p2, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    invoke-interface {p2, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-interface {p2, v2, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 37
    .line 38
    const-string v3, "isWriteClassName"

    .line 39
    .line 40
    const-string v4, "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z"

    .line 41
    .line 42
    invoke-interface {p2, v1, v0, v3, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/16 v0, 0x9a

    .line 46
    .line 47
    invoke-interface {p2, v0, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_nameApply(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p2, p4, p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "string"

    .line 57
    .line 58
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/16 v4, 0x3a

    .line 63
    .line 64
    invoke-interface {p2, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p2, p3, p4, p1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_filters(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V

    .line 68
    .line 69
    .line 70
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 71
    .line 72
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 76
    .line 77
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-interface {p2, v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 85
    .line 86
    .line 87
    const/16 v6, 0xc7

    .line 88
    .line 89
    invoke-interface {p2, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p2, p3, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_if_write_null(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 93
    .line 94
    .line 95
    const/16 v6, 0xa7

    .line 96
    .line 97
    invoke-interface {p2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 101
    .line 102
    .line 103
    iget-object p3, p3, Lcom/alibaba/fastjson/util/FieldInfo;->format:Ljava/lang/String;

    .line 104
    .line 105
    const-string v3, "trim"

    .line 106
    .line 107
    invoke-virtual {v3, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    if-eqz p3, :cond_1

    .line 112
    .line 113
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 118
    .line 119
    .line 120
    const-string p3, "java/lang/String"

    .line 121
    .line 122
    const-string v6, "()Ljava/lang/String;"

    .line 123
    .line 124
    invoke-interface {p2, v1, p3, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    invoke-interface {p2, v4, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 132
    .line 133
    .line 134
    :cond_1
    invoke-static {p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    const-string v3, "(CLjava/lang/String;Ljava/lang/String;)V"

    .line 139
    .line 140
    const-string v4, "seperator"

    .line 141
    .line 142
    const/16 v6, 0x15

    .line 143
    .line 144
    const-string v7, "out"

    .line 145
    .line 146
    if-eqz p3, :cond_2

    .line 147
    .line 148
    invoke-virtual {p4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p4, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result p3

    .line 159
    invoke-interface {p2, v6, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 160
    .line 161
    .line 162
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 163
    .line 164
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 172
    .line 173
    .line 174
    sget-object p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 175
    .line 176
    const-string v0, "writeFieldValueStringWithDoubleQuoteCheck"

    .line 177
    .line 178
    invoke-interface {p2, v1, p3, v0, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_2
    invoke-virtual {p4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result p3

    .line 186
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p4, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    invoke-interface {p2, v6, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 194
    .line 195
    .line 196
    sget p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 197
    .line 198
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 202
    .line 203
    .line 204
    move-result p3

    .line 205
    invoke-interface {p2, v2, p3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 206
    .line 207
    .line 208
    sget-object p3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 209
    .line 210
    const-string v0, "writeFieldValue"

    .line 211
    .line 212
    invoke-interface {p2, v1, p3, v0, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :goto_0
    invoke-direct {p0, p2, p4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {p2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p2, p1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method private _writeFieldName(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 4

    .line 1
    invoke-static {p2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xb6

    .line 6
    .line 7
    const-string v2, "out"

    .line 8
    .line 9
    const/16 v3, 0x19

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 18
    .line 19
    .line 20
    sget p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 21
    .line 22
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 23
    .line 24
    .line 25
    sget-object p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "writeFieldNameDirect"

    .line 28
    .line 29
    const-string v2, "(Ljava/lang/String;)V"

    .line 30
    .line 31
    invoke-interface {p1, v1, p2, v0, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {p2, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 40
    .line 41
    .line 42
    sget p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 43
    .line 44
    invoke-interface {p1, v3, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x3

    .line 48
    invoke-interface {p1, p2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 52
    .line 53
    const-string v0, "writeFieldName"

    .line 54
    .line 55
    const-string v2, "(Ljava/lang/String;Z)V"

    .line 56
    .line 57
    invoke-interface {p1, v1, p2, v0, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private _writeObject(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/Label;)V
    .locals 20

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/alibaba/fastjson/util/FieldInfo;->getFormat()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-object v5, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 14
    .line 15
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 16
    .line 17
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    const-string v8, "object"

    .line 25
    .line 26
    const/16 v9, 0x19

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-interface {v1, v9, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->processValue:I

    .line 39
    .line 40
    invoke-interface {v1, v9, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 41
    .line 42
    .line 43
    :goto_0
    const/16 v7, 0x59

    .line 44
    .line 45
    invoke-interface {v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    const/16 v10, 0x3a

    .line 53
    .line 54
    invoke-interface {v1, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 55
    .line 56
    .line 57
    const/16 v7, 0xc7

    .line 58
    .line 59
    invoke-interface {v1, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 60
    .line 61
    .line 62
    invoke-direct/range {p0 .. p3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_if_write_null(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 63
    .line 64
    .line 65
    const/16 v7, 0xa7

    .line 66
    .line 67
    move-object/from16 v11, p4

    .line 68
    .line 69
    invoke-interface {v1, v7, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 73
    .line 74
    .line 75
    const-string v6, "out"

    .line 76
    .line 77
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-interface {v1, v9, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 82
    .line 83
    .line 84
    const-string v6, "seperator"

    .line 85
    .line 86
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const/16 v11, 0x15

    .line 91
    .line 92
    invoke-interface {v1, v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 93
    .line 94
    .line 95
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 96
    .line 97
    const-string v11, "(I)V"

    .line 98
    .line 99
    const/16 v12, 0xb6

    .line 100
    .line 101
    const-string v13, "write"

    .line 102
    .line 103
    invoke-interface {v1, v12, v6, v13, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_writeFieldName(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 107
    .line 108
    .line 109
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 110
    .line 111
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance v11, Lcom/alibaba/fastjson/asm/Label;

    .line 115
    .line 116
    invoke-direct {v11}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Class;->getModifiers()I

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 124
    .line 125
    .line 126
    move-result v14

    .line 127
    const-string v15, "Ljava/lang/reflect/Type;"

    .line 128
    .line 129
    const-string v7, "_asm_fieldType"

    .line 130
    .line 131
    if-eqz v14, :cond_7

    .line 132
    .line 133
    invoke-static {v5}, Lcom/alibaba/fastjson/parser/ParserConfig;->isPrimitive2(Ljava/lang/Class;)Z

    .line 134
    .line 135
    .line 136
    move-result v14

    .line 137
    if-nez v14, :cond_7

    .line 138
    .line 139
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v14

    .line 143
    invoke-interface {v1, v9, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 144
    .line 145
    .line 146
    const-string v14, "getClass"

    .line 147
    .line 148
    const-string v10, "()Ljava/lang/Class;"

    .line 149
    .line 150
    const-string v9, "java/lang/Object"

    .line 151
    .line 152
    invoke-interface {v1, v12, v9, v14, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-static {v5}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const/16 v5, 0xa6

    .line 167
    .line 168
    invoke-interface {v1, v5, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 169
    .line 170
    .line 171
    invoke-direct {v0, v3, v1, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_getFieldSer(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 172
    .line 173
    .line 174
    const-string v5, "fied_ser"

    .line 175
    .line 176
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    const/16 v10, 0x3a

    .line 181
    .line 182
    invoke-interface {v1, v10, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 183
    .line 184
    .line 185
    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    .line 186
    .line 187
    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 188
    .line 189
    .line 190
    new-instance v10, Lcom/alibaba/fastjson/asm/Label;

    .line 191
    .line 192
    invoke-direct {v10}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v14

    .line 199
    const/16 v12, 0x19

    .line 200
    .line 201
    invoke-interface {v1, v12, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 202
    .line 203
    .line 204
    sget-object v12, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 205
    .line 206
    const/16 v14, 0xc1

    .line 207
    .line 208
    invoke-interface {v1, v14, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const/16 v14, 0x99

    .line 212
    .line 213
    invoke-interface {v1, v14, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 214
    .line 215
    .line 216
    iget v14, v2, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 217
    .line 218
    move/from16 v16, v14

    .line 219
    .line 220
    sget-object v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->DisableCircularReferenceDetect:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 221
    .line 222
    iget v14, v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 223
    .line 224
    and-int v14, v16, v14

    .line 225
    .line 226
    if-eqz v14, :cond_1

    .line 227
    .line 228
    const/16 v17, 0x1

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_1
    const/16 v17, 0x0

    .line 232
    .line 233
    :goto_1
    sget-object v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->BeanToArray:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 234
    .line 235
    iget v14, v14, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 236
    .line 237
    and-int v14, v16, v14

    .line 238
    .line 239
    if-eqz v14, :cond_2

    .line 240
    .line 241
    const/4 v14, 0x1

    .line 242
    goto :goto_2

    .line 243
    :cond_2
    const/4 v14, 0x0

    .line 244
    :goto_2
    if-nez v17, :cond_5

    .line 245
    .line 246
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 247
    .line 248
    .line 249
    move-result v16

    .line 250
    if-eqz v16, :cond_3

    .line 251
    .line 252
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 253
    .line 254
    .line 255
    move-result v16

    .line 256
    if-eqz v16, :cond_3

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_3
    if-eqz v14, :cond_4

    .line 260
    .line 261
    const-string v14, "writeAsArray"

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_4
    move-object v14, v13

    .line 265
    goto :goto_4

    .line 266
    :cond_5
    :goto_3
    if-eqz v14, :cond_6

    .line 267
    .line 268
    const-string v14, "writeAsArrayNonContext"

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_6
    const-string v14, "writeDirectNonContext"

    .line 272
    .line 273
    :goto_4
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    move-object/from16 v16, v4

    .line 278
    .line 279
    const/16 v4, 0x19

    .line 280
    .line 281
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 282
    .line 283
    .line 284
    const/16 v0, 0xc0

    .line 285
    .line 286
    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 287
    .line 288
    .line 289
    const/4 v0, 0x1

    .line 290
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 298
    .line 299
    .line 300
    sget v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 301
    .line 302
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 303
    .line 304
    .line 305
    const/4 v0, 0x0

    .line 306
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 307
    .line 308
    .line 309
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    new-instance v4, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    move-object/from16 v17, v11

    .line 319
    .line 320
    iget-object v11, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    const/16 v11, 0xb4

    .line 333
    .line 334
    invoke-interface {v1, v11, v0, v4, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    iget v0, v2, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 338
    .line 339
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    new-instance v0, Ljava/lang/StringBuilder;

    .line 347
    .line 348
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const-string v4, "(L"

    .line 352
    .line 353
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    sget-object v11, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 357
    .line 358
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    move-object/from16 v18, v6

    .line 362
    .line 363
    const-string v6, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 364
    .line 365
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    move-object/from16 v19, v13

    .line 373
    .line 374
    const/16 v13, 0xb6

    .line 375
    .line 376
    invoke-interface {v1, v13, v12, v14, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    const/16 v0, 0xa7

    .line 380
    .line 381
    invoke-interface {v1, v0, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    const/16 v12, 0x19

    .line 392
    .line 393
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 394
    .line 395
    .line 396
    const/4 v0, 0x1

    .line 397
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 405
    .line 406
    .line 407
    sget v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 408
    .line 409
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 410
    .line 411
    .line 412
    const/4 v0, 0x0

    .line 413
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 414
    .line 415
    .line 416
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    new-instance v5, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 423
    .line 424
    .line 425
    iget-object v9, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    const/16 v9, 0xb4

    .line 438
    .line 439
    invoke-interface {v1, v9, v0, v5, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iget v0, v2, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 443
    .line 444
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer:Ljava/lang/String;

    .line 452
    .line 453
    new-instance v5, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    const/16 v5, 0xb9

    .line 472
    .line 473
    move-object/from16 v6, v19

    .line 474
    .line 475
    invoke-interface {v1, v5, v0, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 479
    .line 480
    .line 481
    move-object/from16 v0, v18

    .line 482
    .line 483
    const/16 v4, 0xa7

    .line 484
    .line 485
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 486
    .line 487
    .line 488
    move-object/from16 v4, v17

    .line 489
    .line 490
    goto :goto_5

    .line 491
    :cond_7
    move-object/from16 v16, v4

    .line 492
    .line 493
    move-object v0, v6

    .line 494
    move-object v4, v11

    .line 495
    :goto_5
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 496
    .line 497
    .line 498
    const/4 v4, 0x1

    .line 499
    const/16 v12, 0x19

    .line 500
    .line 501
    invoke-interface {v1, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 502
    .line 503
    .line 504
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    if-eqz v4, :cond_8

    .line 509
    .line 510
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    invoke-interface {v1, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 515
    .line 516
    .line 517
    goto :goto_6

    .line 518
    :cond_8
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->processValue:I

    .line 519
    .line 520
    invoke-interface {v1, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 521
    .line 522
    .line 523
    :goto_6
    if-eqz v16, :cond_9

    .line 524
    .line 525
    move-object/from16 v4, v16

    .line 526
    .line 527
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 531
    .line 532
    const-string v4, "writeWithFormat"

    .line 533
    .line 534
    const-string v5, "(Ljava/lang/Object;Ljava/lang/String;)V"

    .line 535
    .line 536
    const/16 v13, 0xb6

    .line 537
    .line 538
    invoke-interface {v1, v13, v2, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    goto :goto_8

    .line 542
    :cond_9
    sget v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 543
    .line 544
    invoke-interface {v1, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 545
    .line 546
    .line 547
    iget-object v4, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 548
    .line 549
    instance-of v5, v4, Ljava/lang/Class;

    .line 550
    .line 551
    const-string v6, "writeWithFieldName"

    .line 552
    .line 553
    if-eqz v5, :cond_a

    .line 554
    .line 555
    check-cast v4, Ljava/lang/Class;

    .line 556
    .line 557
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    if-eqz v4, :cond_a

    .line 562
    .line 563
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 564
    .line 565
    const-string v4, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    .line 566
    .line 567
    const/16 v13, 0xb6

    .line 568
    .line 569
    invoke-interface {v1, v13, v2, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    goto :goto_8

    .line 573
    :cond_a
    iget-object v4, v2, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 574
    .line 575
    const-class v5, Ljava/lang/String;

    .line 576
    .line 577
    if-ne v4, v5, :cond_b

    .line 578
    .line 579
    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-static {v4}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto :goto_7

    .line 591
    :cond_b
    const/4 v4, 0x0

    .line 592
    const/16 v12, 0x19

    .line 593
    .line 594
    invoke-interface {v1, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 595
    .line 596
    .line 597
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    new-instance v5, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 604
    .line 605
    .line 606
    iget-object v8, v2, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 607
    .line 608
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    const/16 v11, 0xb4

    .line 619
    .line 620
    invoke-interface {v1, v11, v4, v5, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    :goto_7
    iget v2, v2, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    .line 624
    .line 625
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 633
    .line 634
    const-string v4, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 635
    .line 636
    const/16 v13, 0xb6

    .line 637
    .line 638
    invoke-interface {v1, v13, v2, v6, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    :goto_8
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 642
    .line 643
    .line 644
    move-object/from16 v0, p0

    .line 645
    .line 646
    invoke-direct {v0, v1, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_seperator(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 647
    .line 648
    .line 649
    return-void
.end method

.method private generateWriteAsArray(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;[Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "[",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    .line 1
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    const/16 v5, 0x19

    const/4 v6, 0x1

    .line 2
    invoke-interface {v1, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v7, 0x0

    .line 3
    invoke-interface {v1, v5, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 4
    sget-object v8, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "("

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeFilterable_desc:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ")Z"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0xb6

    const-string v11, "hasPropertyFilters"

    invoke-interface {v1, v10, v8, v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v9, 0x9a

    .line 5
    invoke-interface {v1, v9, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 6
    invoke-interface {v1, v5, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 7
    invoke-interface {v1, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x2

    .line 8
    invoke-interface {v1, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x3

    .line 9
    invoke-interface {v1, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x4

    .line 10
    invoke-interface {v1, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x5

    const/16 v11, 0x15

    .line 11
    invoke-interface {v1, v11, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 12
    sget-object v9, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "(L"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0xb7

    const-string v15, "writeNoneASM"

    invoke-interface {v1, v14, v9, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v9, 0xb1

    .line 13
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 14
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 15
    const-string v4, "out"

    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v1, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v9, 0x5b

    const/16 v12, 0x10

    .line 16
    invoke-interface {v1, v12, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 17
    sget-object v9, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v14, "write"

    const-string v15, "(I)V"

    invoke-interface {v1, v10, v9, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move/from16 p1, v7

    .line 18
    array-length v7, v2

    if-nez v7, :cond_0

    .line 19
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v5, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0x5d

    .line 20
    invoke-interface {v1, v12, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 21
    invoke-interface {v1, v10, v9, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    move/from16 v9, p1

    :goto_0
    if-ge v9, v7, :cond_19

    add-int/lit8 v6, v7, -0x1

    if-ne v9, v6, :cond_1

    const/16 v6, 0x5d

    goto :goto_1

    :cond_1
    const/16 v6, 0x2c

    .line 22
    :goto_1
    aget-object v11, v2, v9

    .line 23
    iget-object v12, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 24
    iget-object v10, v11, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 25
    sget v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    const/16 v5, 0x3a

    invoke-interface {v1, v5, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 26
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const/16 v5, 0x59

    if-eq v12, v10, :cond_2

    sget-object v10, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v12, v10, :cond_2

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v12, v10, :cond_3

    :cond_2
    move/from16 v0, p1

    move-object v2, v4

    move v4, v6

    move/from16 v20, v7

    move-object v7, v8

    move/from16 v21, v9

    move-object v6, v13

    move-object v5, v15

    const/16 v12, 0xb6

    const/16 v13, 0x19

    const/4 v15, 0x1

    goto/16 :goto_12

    .line 27
    :cond_3
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v12, v10, :cond_4

    .line 28
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-interface {v1, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 29
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 30
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 31
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v10, "writeLong"

    const-string v11, "(J)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v5, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x10

    .line 32
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 33
    invoke-interface {v1, v12, v5, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    move-object v10, v0

    move-object v2, v4

    move/from16 v20, v7

    move-object v7, v8

    move/from16 v21, v9

    move-object v6, v13

    move-object v5, v15

    :goto_3
    const/16 v11, 0x10

    const/16 v13, 0x19

    const/4 v15, 0x1

    :goto_4
    move/from16 v0, p1

    goto/16 :goto_13

    .line 34
    :cond_4
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v12, v10, :cond_5

    .line 35
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-interface {v1, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 36
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 37
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    const/4 v5, 0x4

    .line 38
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 39
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v10, "writeFloat"

    const-string v11, "(FZ)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v5, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x10

    .line 40
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 41
    invoke-interface {v1, v12, v5, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 42
    :cond_5
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v12, v10, :cond_6

    .line 43
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-interface {v1, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 44
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 45
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    const/4 v5, 0x4

    .line 46
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 47
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v10, "writeDouble"

    const-string v11, "(DZ)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v5, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x10

    .line 48
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 49
    invoke-interface {v1, v12, v5, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 50
    :cond_6
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v12, v10, :cond_7

    .line 51
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-interface {v1, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 52
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 53
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 54
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v10, "(Z)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v5, v14, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x10

    .line 55
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 56
    invoke-interface {v1, v12, v5, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 57
    :cond_7
    sget-object v10, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const/16 v5, 0xb8

    if-ne v12, v10, :cond_8

    .line 58
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-interface {v1, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 59
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 60
    const-string v10, "toString"

    const-string v11, "(C)Ljava/lang/String;"

    const-string v12, "java/lang/Character"

    invoke-interface {v1, v5, v12, v10, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0x10

    .line 61
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 62
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v6, "writeString"

    const-string v11, "(Ljava/lang/String;C)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v5, v6, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v4

    move/from16 v20, v7

    move-object v7, v8

    move/from16 v21, v9

    move v11, v10

    move-object v6, v13

    move-object v5, v15

    :goto_5
    const/16 v13, 0x19

    const/4 v15, 0x1

    move-object v10, v0

    goto/16 :goto_4

    :cond_8
    const/16 v10, 0x10

    .line 63
    const-class v5, Ljava/lang/String;

    if-ne v12, v5, :cond_9

    .line 64
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v12, 0x19

    invoke-interface {v1, v12, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 65
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 66
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 67
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v6, "writeString"

    const-string v10, "(Ljava/lang/String;C)V"

    const/16 v11, 0xb6

    invoke-interface {v1, v11, v5, v6, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v0

    move-object v2, v4

    move/from16 v20, v7

    move-object v7, v8

    move/from16 v21, v9

    move-object v6, v13

    move-object v5, v15

    const/4 v15, 0x1

    move/from16 v0, p1

    move v13, v12

    move v12, v11

    :goto_6
    const/16 v11, 0x10

    goto/16 :goto_13

    :cond_9
    const/16 v5, 0x19

    const/16 v10, 0xb6

    .line 68
    invoke-virtual {v12}, Ljava/lang/Class;->isEnum()Z

    move-result v16

    if-eqz v16, :cond_a

    .line 69
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v12

    invoke-interface {v1, v5, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0x59

    .line 70
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 71
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 72
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v11, "writeEnum"

    const-string v12, "(Ljava/lang/Enum;)V"

    invoke-interface {v1, v10, v5, v11, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0x10

    .line 73
    invoke-interface {v1, v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 74
    invoke-interface {v1, v10, v5, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v4

    move/from16 v20, v7

    move-object v7, v8

    move/from16 v21, v9

    move v12, v10

    move-object v6, v13

    move-object v5, v15

    const/16 v11, 0x10

    goto :goto_5

    .line 75
    :cond_a
    const-class v5, Ljava/util/List;

    invoke-virtual {v5, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    const-string v10, "writeWithFieldName"

    if-eqz v5, :cond_15

    .line 76
    iget-object v5, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    .line 77
    instance-of v12, v5, Ljava/lang/Class;

    if-eqz v12, :cond_b

    .line 78
    const-class v5, Ljava/lang/Object;

    goto :goto_7

    .line 79
    :cond_b
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    aget-object v5, v5, p1

    .line 80
    :goto_7
    instance-of v12, v5, Ljava/lang/Class;

    if-eqz v12, :cond_c

    .line 81
    move-object v12, v5

    check-cast v12, Ljava/lang/Class;

    .line 82
    const-class v2, Ljava/lang/Object;

    if-ne v12, v2, :cond_d

    :cond_c
    const/4 v12, 0x0

    .line 83
    :cond_d
    invoke-direct {v0, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    const/16 v2, 0xc0

    move-object/from16 v18, v5

    .line 84
    const-string v5, "java/util/List"

    invoke-interface {v1, v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 85
    const-string v2, "list"

    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    move/from16 v20, v7

    const/16 v7, 0x3a

    invoke-interface {v1, v7, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 86
    const-class v5, Ljava/lang/String;

    if-ne v12, v5, :cond_e

    .line 87
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 88
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v12, 0x19

    invoke-interface {v1, v12, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 89
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v12, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 90
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v5, "(Ljava/util/List;)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v2, v14, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v4

    move/from16 v22, v6

    move-object v7, v8

    move/from16 v21, v9

    move v8, v12

    move-object v6, v13

    move-object v4, v15

    const/16 v10, 0x10

    const/16 v12, 0x19

    const/16 v13, 0x15

    goto/16 :goto_e

    .line 91
    :cond_e
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    move/from16 v21, v9

    .line 92
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    move/from16 v22, v6

    const/16 v6, 0x19

    invoke-interface {v1, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v9, 0xc7

    .line 93
    invoke-interface {v1, v9, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 94
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    invoke-interface {v1, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 95
    sget-object v9, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v6, "writeNull"

    move-object/from16 v23, v10

    const-string v10, "()V"

    move-object/from16 v24, v8

    const/16 v8, 0xb6

    invoke-interface {v1, v8, v9, v6, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xa7

    .line 96
    invoke-interface {v1, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 97
    invoke-interface {v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 98
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x19

    invoke-interface {v1, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 99
    const-string v6, "size"

    const-string v8, "()I"

    const-string v10, "java/util/List"

    const/16 v7, 0xb9

    invoke-interface {v1, v7, v10, v6, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v6, "size"

    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x36

    invoke-interface {v1, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 101
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x19

    invoke-interface {v1, v7, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v6, 0x5b

    const/16 v10, 0x10

    .line 102
    invoke-interface {v1, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v8, 0xb6

    .line 103
    invoke-interface {v1, v8, v9, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    const/4 v10, 0x3

    .line 105
    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    const/16 v10, 0x36

    move-object/from16 v25, v5

    .line 106
    const-string v5, "i"

    move-object/from16 v26, v13

    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v1, v10, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 107
    invoke-interface {v1, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 108
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v13, 0x15

    invoke-interface {v1, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 109
    const-string v10, "size"

    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v1, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v10, 0xa2

    .line 110
    invoke-interface {v1, v10, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 111
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v1, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v10, 0x99

    .line 112
    invoke-interface {v1, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 113
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v13, 0x19

    invoke-interface {v1, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v10, 0x2c

    const/16 v13, 0x10

    .line 114
    invoke-interface {v1, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v10, 0xb6

    .line 115
    invoke-interface {v1, v10, v9, v14, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    invoke-interface {v1, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 117
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x19

    invoke-interface {v1, v7, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 118
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v13, 0x15

    invoke-interface {v1, v13, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 119
    const-string v2, "get"

    const-string v7, "(I)Ljava/lang/Object;"

    const-string v10, "java/util/List"

    const/16 v13, 0xb9

    invoke-interface {v1, v13, v10, v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v2, "list_item"

    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v7

    const/16 v10, 0x3a

    invoke-interface {v1, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 121
    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v10, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v10}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 122
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    move-object/from16 v27, v15

    const/16 v15, 0x19

    invoke-interface {v1, v15, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v13, 0xc7

    .line 123
    invoke-interface {v1, v13, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 124
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    invoke-interface {v1, v15, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 125
    const-string v13, "writeNull"

    const-string v15, "()V"

    move-object/from16 v28, v4

    const/16 v4, 0xb6

    invoke-interface {v1, v4, v9, v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xa7

    .line 126
    invoke-interface {v1, v4, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 127
    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 128
    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v10, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v10}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    if-eqz v12, :cond_12

    .line 129
    invoke-virtual {v12}, Ljava/lang/Class;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v13

    if-eqz v13, :cond_12

    .line 130
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v13

    const/16 v15, 0x19

    invoke-interface {v1, v15, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 131
    const-string v13, "getClass"

    const-string v15, "()Ljava/lang/Class;"

    move-object/from16 v29, v9

    const-string v9, "java/lang/Object"

    move-object/from16 v30, v8

    const/16 v8, 0xb6

    invoke-interface {v1, v8, v9, v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-static {v12}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v8

    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v8, 0xa6

    .line 133
    invoke-interface {v1, v8, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 134
    invoke-direct {v0, v3, v1, v11, v12}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_getListFieldItemSer(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Ljava/lang/Class;)V

    .line 135
    const-string v8, "list_item_desc"

    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v13, 0x3a

    invoke-interface {v1, v13, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 136
    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v13, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v13}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 137
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v15

    if-eqz v15, :cond_10

    .line 138
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v17, v12

    const/16 v12, 0x19

    invoke-interface {v1, v12, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 139
    sget-object v15, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    const/16 v12, 0xc1

    invoke-interface {v1, v12, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v12, 0x99

    .line 140
    invoke-interface {v1, v12, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 141
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v12

    const/16 v0, 0x19

    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v12, 0xc0

    .line 142
    invoke-interface {v1, v12, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/4 v12, 0x1

    .line 143
    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 144
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v12

    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 145
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v12, 0x1

    .line 146
    invoke-interface {v1, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    move-object/from16 v31, v6

    move-object/from16 v32, v7

    goto :goto_8

    .line 147
    :cond_f
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/16 v12, 0x15

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 148
    const-string v0, "valueOf"

    const-string v12, "(I)Ljava/lang/Integer;"

    move-object/from16 v31, v6

    const-string v6, "java/lang/Integer"

    move-object/from16 v32, v7

    const/16 v7, 0xb8

    invoke-interface {v1, v7, v6, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :goto_8
    invoke-static/range {v17 .. v17}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 150
    iget v0, v11, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v6, v26

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v24

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v12, "writeAsArrayNonContext"

    move-object/from16 v24, v10

    const/16 v10, 0xb6

    invoke-interface {v1, v10, v15, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xa7

    .line 152
    invoke-interface {v1, v0, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 153
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto :goto_9

    :cond_10
    move-object/from16 v31, v6

    move-object/from16 v32, v7

    move-object/from16 v17, v12

    move-object/from16 v7, v24

    move-object/from16 v6, v26

    move-object/from16 v24, v10

    .line 154
    :goto_9
    invoke-virtual {v3, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/16 v12, 0x19

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v0, 0x1

    .line 155
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 156
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v12, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 157
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v8

    if-eqz v8, :cond_11

    .line 158
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    goto :goto_a

    .line 159
    :cond_11
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/16 v12, 0x15

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 160
    const-string v0, "valueOf"

    const-string v8, "(I)Ljava/lang/Integer;"

    const-string v9, "java/lang/Integer"

    const/16 v10, 0xb8

    invoke-interface {v1, v10, v9, v0, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    :goto_a
    invoke-static/range {v17 .. v17}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 162
    iget v0, v11, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 163
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xb9

    invoke-interface {v1, v9, v0, v14, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-interface {v1, v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/16 v0, 0xa7

    .line 165
    invoke-interface {v1, v0, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    move-object/from16 v0, v24

    goto :goto_b

    :cond_12
    move-object/from16 v31, v6

    move-object/from16 v32, v7

    move-object/from16 v30, v8

    move-object/from16 v29, v9

    move-object/from16 v17, v12

    move-object/from16 v7, v24

    move-object/from16 v6, v26

    move-object v0, v10

    .line 166
    :goto_b
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/4 v0, 0x1

    const/16 v12, 0x19

    .line 167
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 168
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v12, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 169
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 170
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    const/16 v13, 0x15

    goto :goto_c

    .line 171
    :cond_13
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/16 v13, 0x15

    invoke-interface {v1, v13, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 172
    const-string v0, "valueOf"

    const-string v2, "(I)Ljava/lang/Integer;"

    const-string v8, "java/lang/Integer"

    const/16 v10, 0xb8

    invoke-interface {v1, v10, v8, v0, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_c
    if-eqz v17, :cond_14

    .line 173
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 174
    move-object/from16 v0, v18

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 175
    iget v0, v11, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 176
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    move-object/from16 v8, v23

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v0, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    :cond_14
    move-object/from16 v8, v23

    const/16 v12, 0xb6

    .line 177
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    invoke-interface {v1, v12, v0, v8, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :goto_d
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    move-object/from16 v0, v32

    .line 179
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 180
    invoke-virtual {v3, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/4 v12, 0x1

    invoke-interface {v1, v0, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIincInsn(II)V

    move-object/from16 v0, v31

    const/16 v4, 0xa7

    .line 181
    invoke-interface {v1, v4, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    move-object/from16 v0, v30

    .line 182
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    move-object/from16 v0, v28

    .line 183
    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    const/16 v12, 0x19

    invoke-interface {v1, v12, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0x5d

    const/16 v10, 0x10

    .line 184
    invoke-interface {v1, v10, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move-object/from16 v4, v27

    move-object/from16 v2, v29

    const/16 v8, 0xb6

    .line 185
    invoke-interface {v1, v8, v2, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, v25

    .line 186
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 187
    :goto_e
    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v12, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move/from16 v2, v22

    .line 188
    invoke-interface {v1, v10, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 189
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    invoke-interface {v1, v8, v2, v14, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v10, p0

    move-object v2, v0

    move-object v5, v4

    move v12, v8

    goto/16 :goto_3

    :cond_15
    move-object v0, v4

    move v2, v6

    move/from16 v20, v7

    move-object v7, v8

    move/from16 v21, v9

    move-object v8, v10

    move-object v6, v13

    move-object v4, v15

    const/16 v13, 0x15

    .line 190
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    move-object/from16 v10, p0

    .line 191
    invoke-direct {v10, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    const/16 v15, 0x59

    .line 192
    invoke-interface {v1, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 193
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "field_"

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v18, v12

    iget-object v12, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v12

    const/16 v15, 0x3a

    invoke-interface {v1, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v12, 0xc7

    .line 194
    invoke-interface {v1, v12, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 195
    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v12

    const/16 v15, 0x19

    invoke-interface {v1, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 196
    sget-object v12, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v15, "writeNull"

    move-object/from16 v27, v4

    const-string v4, "()V"

    move/from16 v22, v2

    const/16 v2, 0xb6

    invoke-interface {v1, v2, v12, v15, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0xa7

    .line 197
    invoke-interface {v1, v4, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 198
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 199
    new-instance v2, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v2}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v4, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v4}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 200
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v9

    const/16 v15, 0x19

    invoke-interface {v1, v15, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 201
    const-string v9, "getClass"

    const-string v15, "()Ljava/lang/Class;"

    move-object/from16 v19, v12

    const-string v12, "java/lang/Object"

    move-object/from16 v28, v0

    const/16 v0, 0xb6

    invoke-interface {v1, v0, v12, v9, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-static/range {v18 .. v18}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    const/16 v0, 0xa6

    .line 203
    invoke-interface {v1, v0, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 204
    invoke-direct {v10, v3, v1, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_getFieldSer(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 205
    const-string v0, "fied_ser"

    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/16 v15, 0x3a

    invoke-interface {v1, v15, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 206
    new-instance v0, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v0}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    new-instance v9, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v9}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 207
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v12

    if-eqz v12, :cond_16

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getModifiers()I

    move-result v12

    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v12

    if-eqz v12, :cond_16

    .line 208
    const-string v12, "fied_ser"

    invoke-virtual {v3, v12}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v12

    const/16 v15, 0x19

    invoke-interface {v1, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 209
    sget-object v12, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    const/16 v15, 0xc1

    invoke-interface {v1, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/16 v15, 0x99

    .line 210
    invoke-interface {v1, v15, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 211
    const-string v15, "fied_ser"

    invoke-virtual {v3, v15}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v15

    const/16 v10, 0x19

    invoke-interface {v1, v10, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v15, 0xc0

    .line 212
    invoke-interface {v1, v15, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    const/4 v15, 0x1

    .line 213
    invoke-interface {v1, v10, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 214
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v10

    const/16 v15, 0x19

    invoke-interface {v1, v15, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 215
    sget v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    invoke-interface {v1, v15, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 216
    invoke-static/range {v18 .. v18}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v10

    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 217
    iget v10, v11, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v1, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 218
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v15, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v15, "writeAsArrayNonContext"

    move-object/from16 v17, v5

    const/16 v5, 0xb6

    invoke-interface {v1, v5, v12, v15, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0xa7

    .line 219
    invoke-interface {v1, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 220
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    goto :goto_f

    :cond_16
    move-object/from16 v17, v5

    .line 221
    :goto_f
    const-string v0, "fied_ser"

    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    const/16 v12, 0x19

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v0, 0x1

    .line 222
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 224
    sget v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 225
    invoke-static/range {v18 .. v18}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 226
    iget v0, v11, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 227
    sget-object v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v12, 0xb9

    invoke-interface {v1, v12, v0, v14, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    invoke-interface {v1, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/16 v0, 0xa7

    .line 229
    invoke-interface {v1, v0, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 230
    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 231
    invoke-virtual {v11}, Lcom/alibaba/fastjson/util/FieldInfo;->getFormat()Ljava/lang/String;

    move-result-object v0

    const/16 v12, 0x19

    const/4 v15, 0x1

    .line 232
    invoke-interface {v1, v12, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 233
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v12, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    if-eqz v0, :cond_17

    .line 234
    invoke-interface {v1, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 235
    const-string v0, "writeWithFormat"

    const-string v4, "(Ljava/lang/Object;Ljava/lang/String;)V"

    const/16 v5, 0xb6

    invoke-interface {v1, v5, v10, v0, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_10
    move/from16 v0, p1

    move v12, v5

    goto :goto_11

    :cond_17
    const/16 v5, 0xb6

    .line 236
    sget v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 237
    iget-object v0, v11, Lcom/alibaba/fastjson/util/FieldInfo;->fieldType:Ljava/lang/reflect/Type;

    instance-of v4, v0, Ljava/lang/Class;

    if-eqz v4, :cond_18

    check-cast v0, Ljava/lang/Class;

    .line 238
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_18

    .line 239
    const-string v0, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    invoke-interface {v1, v5, v10, v8, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10

    :cond_18
    move/from16 v0, p1

    const/16 v12, 0x19

    .line 240
    invoke-interface {v1, v12, v0}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 241
    invoke-static {v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v11, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_asm_fieldType"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v9, "Ljava/lang/reflect/Type;"

    const/16 v12, 0xb4

    invoke-interface {v1, v12, v4, v5, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    iget v4, v11, Lcom/alibaba/fastjson/util/FieldInfo;->serialzeFeatures:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 243
    const-string v4, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    const/16 v12, 0xb6

    invoke-interface {v1, v12, v10, v8, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    :goto_11
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    move-object/from16 v2, v17

    .line 245
    invoke-interface {v1, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    move-object/from16 v2, v28

    .line 246
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v4

    const/16 v13, 0x19

    invoke-interface {v1, v13, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move/from16 v4, v22

    const/16 v10, 0x10

    .line 247
    invoke-interface {v1, v10, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move-object/from16 v4, v19

    move-object/from16 v5, v27

    .line 248
    invoke-interface {v1, v12, v4, v14, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v10, p0

    goto/16 :goto_6

    .line 249
    :goto_12
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v1, v13, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v8, 0x59

    .line 250
    invoke-interface {v1, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    move-object/from16 v10, p0

    .line 251
    invoke-direct {v10, v1, v3, v11}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_get(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;Lcom/alibaba/fastjson/util/FieldInfo;)V

    .line 252
    sget-object v8, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v9, "writeInt"

    invoke-interface {v1, v12, v8, v9, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v11, 0x10

    .line 253
    invoke-interface {v1, v11, v4}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 254
    invoke-interface {v1, v12, v8, v14, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_13
    add-int/lit8 v9, v21, 0x1

    move/from16 p1, v15

    move-object v15, v5

    move v5, v13

    move-object v13, v6

    move/from16 v6, p1

    move/from16 p1, v0

    move-object v4, v2

    move-object v8, v7

    move-object v0, v10

    move v10, v12

    move/from16 v7, v20

    move-object/from16 v2, p3

    move v12, v11

    const/16 v11, 0x15

    goto/16 :goto_0

    :cond_19
    move-object v10, v0

    return-void
.end method

.method private generateWriteMethod(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;[Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/alibaba/fastjson/asm/MethodVisitor;",
            "[",
            "Lcom/alibaba/fastjson/util/FieldInfo;",
            "Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;",
            ")V"
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
    move-object/from16 v7, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    new-instance v8, Lcom/alibaba/fastjson/asm/Label;

    .line 12
    .line 13
    invoke-direct {v8}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 14
    .line 15
    .line 16
    array-length v9, v7

    .line 17
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const-string v5, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    .line 22
    .line 23
    const-string v6, "(I)Z"

    .line 24
    .line 25
    const-string v10, "isEnabled"

    .line 26
    .line 27
    const-string v12, "write"

    .line 28
    .line 29
    const-string v11, "(L"

    .line 30
    .line 31
    const-string v13, "out"

    .line 32
    .line 33
    const/16 v15, 0x19

    .line 34
    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 38
    .line 39
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v14, Lcom/alibaba/fastjson/asm/Label;

    .line 43
    .line 44
    invoke-direct {v14}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 45
    .line 46
    .line 47
    move-object/from16 v17, v8

    .line 48
    .line 49
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    invoke-interface {v2, v15, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 54
    .line 55
    .line 56
    sget-object v8, Lcom/alibaba/fastjson/serializer/SerializerFeature;->PrettyFormat:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 57
    .line 58
    iget v8, v8, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 59
    .line 60
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object v8, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 68
    .line 69
    const/16 v15, 0xb6

    .line 70
    .line 71
    invoke-interface {v2, v15, v8, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/16 v8, 0x9a

    .line 75
    .line 76
    invoke-interface {v2, v8, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 77
    .line 78
    .line 79
    array-length v8, v7

    .line 80
    const/4 v15, 0x0

    .line 81
    :goto_0
    if-ge v15, v8, :cond_1

    .line 82
    .line 83
    aget-object v7, p3, v15

    .line 84
    .line 85
    iget-object v7, v7, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    .line 86
    .line 87
    if-eqz v7, :cond_0

    .line 88
    .line 89
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    const/16 v8, 0x19

    .line 94
    .line 95
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 96
    .line 97
    .line 98
    sget-object v7, Lcom/alibaba/fastjson/serializer/SerializerFeature;->IgnoreErrorGetter:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 99
    .line 100
    iget v7, v7, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 101
    .line 102
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 110
    .line 111
    const/16 v15, 0xb6

    .line 112
    .line 113
    invoke-interface {v2, v15, v7, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/16 v7, 0x99

    .line 117
    .line 118
    invoke-interface {v2, v7, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    add-int/lit8 v15, v15, 0x1

    .line 123
    .line 124
    move-object/from16 v7, p3

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    const/16 v7, 0xa7

    .line 128
    .line 129
    invoke-interface {v2, v7, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 130
    .line 131
    .line 132
    :goto_1
    invoke-interface {v2, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 133
    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    const/16 v8, 0x19

    .line 137
    .line 138
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 139
    .line 140
    .line 141
    const/4 v7, 0x1

    .line 142
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 143
    .line 144
    .line 145
    const/4 v7, 0x2

    .line 146
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 147
    .line 148
    .line 149
    const/4 v7, 0x3

    .line 150
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 151
    .line 152
    .line 153
    const/4 v7, 0x4

    .line 154
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 155
    .line 156
    .line 157
    const/4 v7, 0x5

    .line 158
    const/16 v8, 0x15

    .line 159
    .line 160
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 161
    .line 162
    .line 163
    sget-object v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 164
    .line 165
    new-instance v8, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    sget-object v14, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    const/16 v14, 0xb7

    .line 186
    .line 187
    invoke-interface {v2, v14, v7, v12, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const/16 v7, 0xb1

    .line 191
    .line 192
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 193
    .line 194
    .line 195
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    move-object/from16 v17, v8

    .line 200
    .line 201
    :goto_2
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_3

    .line 206
    .line 207
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 208
    .line 209
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 210
    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/16 v8, 0x19

    .line 214
    .line 215
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 216
    .line 217
    .line 218
    const/4 v7, 0x1

    .line 219
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 220
    .line 221
    .line 222
    const/4 v7, 0x2

    .line 223
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 224
    .line 225
    .line 226
    const/4 v7, 0x5

    .line 227
    const/16 v8, 0x15

    .line 228
    .line 229
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 230
    .line 231
    .line 232
    sget-object v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 233
    .line 234
    new-instance v8, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    sget-object v14, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v14, ";Ljava/lang/Object;I)Z"

    .line 248
    .line 249
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    const-string v14, "writeReference"

    .line 257
    .line 258
    const/16 v15, 0xb6

    .line 259
    .line 260
    invoke-interface {v2, v15, v7, v14, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    const/16 v7, 0x99

    .line 264
    .line 265
    invoke-interface {v2, v7, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 266
    .line 267
    .line 268
    const/16 v7, 0xb1

    .line 269
    .line 270
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 274
    .line 275
    .line 276
    :cond_3
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_5

    .line 281
    .line 282
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-eqz v3, :cond_4

    .line 287
    .line 288
    const-string v3, "writeAsArrayNonContext"

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_4
    const-string v3, "writeAsArray"

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_5
    const-string v3, "writeAsArrayNormal"

    .line 295
    .line 296
    :goto_3
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    iget v7, v7, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->features:I

    .line 301
    .line 302
    sget-object v8, Lcom/alibaba/fastjson/serializer/SerializerFeature;->BeanToArray:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 303
    .line 304
    iget v14, v8, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 305
    .line 306
    and-int/2addr v7, v14

    .line 307
    if-nez v7, :cond_6

    .line 308
    .line 309
    new-instance v7, Lcom/alibaba/fastjson/asm/Label;

    .line 310
    .line 311
    invoke-direct {v7}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v14

    .line 318
    const/16 v15, 0x19

    .line 319
    .line 320
    invoke-interface {v2, v15, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 321
    .line 322
    .line 323
    iget v8, v8, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 324
    .line 325
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    invoke-interface {v2, v8}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    sget-object v8, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 333
    .line 334
    const/16 v14, 0xb6

    .line 335
    .line 336
    invoke-interface {v2, v14, v8, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    const/16 v6, 0x99

    .line 340
    .line 341
    invoke-interface {v2, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 342
    .line 343
    .line 344
    const/4 v6, 0x0

    .line 345
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 346
    .line 347
    .line 348
    const/4 v6, 0x1

    .line 349
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 350
    .line 351
    .line 352
    const/4 v6, 0x2

    .line 353
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 354
    .line 355
    .line 356
    const/4 v6, 0x3

    .line 357
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 358
    .line 359
    .line 360
    const/4 v6, 0x4

    .line 361
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 362
    .line 363
    .line 364
    const/4 v6, 0x5

    .line 365
    const/16 v8, 0x15

    .line 366
    .line 367
    invoke-interface {v2, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 368
    .line 369
    .line 370
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    new-instance v8, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    sget-object v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    const/16 v15, 0xb6

    .line 395
    .line 396
    invoke-interface {v2, v15, v6, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    const/16 v3, 0xb1

    .line 400
    .line 401
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 402
    .line 403
    .line 404
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 405
    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_6
    const/4 v7, 0x0

    .line 409
    const/16 v8, 0x19

    .line 410
    .line 411
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 412
    .line 413
    .line 414
    const/4 v7, 0x1

    .line 415
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 416
    .line 417
    .line 418
    const/4 v7, 0x2

    .line 419
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 420
    .line 421
    .line 422
    const/4 v6, 0x3

    .line 423
    invoke-interface {v2, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 424
    .line 425
    .line 426
    const/4 v6, 0x4

    .line 427
    invoke-interface {v2, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 428
    .line 429
    .line 430
    const/4 v7, 0x5

    .line 431
    const/16 v8, 0x15

    .line 432
    .line 433
    invoke-interface {v2, v8, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 434
    .line 435
    .line 436
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$300(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    new-instance v7, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    sget-object v8, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 449
    .line 450
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    const/16 v15, 0xb6

    .line 461
    .line 462
    invoke-interface {v2, v15, v6, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    const/16 v7, 0xb1

    .line 466
    .line 467
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 468
    .line 469
    .line 470
    :goto_4
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    const-string v7, "parent"

    .line 475
    .line 476
    const-string v8, "("

    .line 477
    .line 478
    if-nez v3, :cond_7

    .line 479
    .line 480
    const/4 v6, 0x1

    .line 481
    const/16 v15, 0x19

    .line 482
    .line 483
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 484
    .line 485
    .line 486
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 487
    .line 488
    new-instance v5, Ljava/lang/StringBuilder;

    .line 489
    .line 490
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    const-string v6, "()"

    .line 494
    .line 495
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerialContext_desc:Ljava/lang/String;

    .line 499
    .line 500
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    const-string v10, "getContext"

    .line 508
    .line 509
    const/16 v15, 0xb6

    .line 510
    .line 511
    invoke-interface {v2, v15, v3, v10, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    const/16 v5, 0x3a

    .line 515
    .line 516
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 517
    .line 518
    .line 519
    move-result v10

    .line 520
    invoke-interface {v2, v5, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 521
    .line 522
    .line 523
    const/4 v5, 0x1

    .line 524
    const/16 v15, 0x19

    .line 525
    .line 526
    invoke-interface {v2, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    invoke-interface {v2, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 534
    .line 535
    .line 536
    const/4 v5, 0x2

    .line 537
    invoke-interface {v2, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 538
    .line 539
    .line 540
    const/4 v5, 0x3

    .line 541
    invoke-interface {v2, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 542
    .line 543
    .line 544
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    iget v5, v5, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->features:I

    .line 549
    .line 550
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-interface {v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    new-instance v5, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const-string v6, "Ljava/lang/Object;Ljava/lang/Object;I)V"

    .line 569
    .line 570
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    const-string v6, "setContext"

    .line 578
    .line 579
    const/16 v15, 0xb6

    .line 580
    .line 581
    invoke-interface {v2, v15, v3, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    :cond_7
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    iget v3, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->features:I

    .line 589
    .line 590
    sget-object v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->WriteClassName:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    .line 591
    .line 592
    iget v5, v5, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    .line 593
    .line 594
    and-int/2addr v3, v5

    .line 595
    if-eqz v3, :cond_8

    .line 596
    .line 597
    const/4 v3, 0x1

    .line 598
    goto :goto_5

    .line 599
    :cond_8
    const/4 v3, 0x0

    .line 600
    :goto_5
    const/16 v10, 0x7b

    .line 601
    .line 602
    const/16 v14, 0x10

    .line 603
    .line 604
    if-nez v3, :cond_a

    .line 605
    .line 606
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    if-nez v5, :cond_9

    .line 611
    .line 612
    goto :goto_6

    .line 613
    :cond_9
    invoke-interface {v2, v14, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 614
    .line 615
    .line 616
    move-object/from16 v16, v7

    .line 617
    .line 618
    goto/16 :goto_b

    .line 619
    .line 620
    :cond_a
    :goto_6
    new-instance v5, Lcom/alibaba/fastjson/asm/Label;

    .line 621
    .line 622
    invoke-direct {v5}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 623
    .line 624
    .line 625
    new-instance v6, Lcom/alibaba/fastjson/asm/Label;

    .line 626
    .line 627
    invoke-direct {v6}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 628
    .line 629
    .line 630
    new-instance v15, Lcom/alibaba/fastjson/asm/Label;

    .line 631
    .line 632
    invoke-direct {v15}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 633
    .line 634
    .line 635
    if-nez v3, :cond_b

    .line 636
    .line 637
    const/4 v3, 0x1

    .line 638
    const/16 v10, 0x19

    .line 639
    .line 640
    invoke-interface {v2, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 641
    .line 642
    .line 643
    const/4 v3, 0x4

    .line 644
    invoke-interface {v2, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 645
    .line 646
    .line 647
    const/4 v14, 0x2

    .line 648
    invoke-interface {v2, v10, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 649
    .line 650
    .line 651
    sget-object v14, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 652
    .line 653
    const-string v3, "isWriteClassName"

    .line 654
    .line 655
    const-string v10, "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z"

    .line 656
    .line 657
    move-object/from16 v16, v7

    .line 658
    .line 659
    const/16 v7, 0xb6

    .line 660
    .line 661
    invoke-interface {v2, v7, v14, v3, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    const/16 v3, 0x99

    .line 665
    .line 666
    invoke-interface {v2, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 667
    .line 668
    .line 669
    :goto_7
    const/4 v3, 0x4

    .line 670
    const/16 v10, 0x19

    .line 671
    .line 672
    goto :goto_8

    .line 673
    :cond_b
    move-object/from16 v16, v7

    .line 674
    .line 675
    const/16 v7, 0xb6

    .line 676
    .line 677
    goto :goto_7

    .line 678
    :goto_8
    invoke-interface {v2, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 679
    .line 680
    .line 681
    const/4 v14, 0x2

    .line 682
    invoke-interface {v2, v10, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 683
    .line 684
    .line 685
    const-string v3, "getClass"

    .line 686
    .line 687
    const-string v14, "()Ljava/lang/Class;"

    .line 688
    .line 689
    const-string v10, "java/lang/Object"

    .line 690
    .line 691
    invoke-interface {v2, v7, v10, v3, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    const/16 v3, 0xa5

    .line 695
    .line 696
    invoke-interface {v2, v3, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 697
    .line 698
    .line 699
    invoke-interface {v2, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    const/16 v15, 0x19

    .line 707
    .line 708
    invoke-interface {v2, v15, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 709
    .line 710
    .line 711
    const/16 v3, 0x7b

    .line 712
    .line 713
    const/16 v10, 0x10

    .line 714
    .line 715
    invoke-interface {v2, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 716
    .line 717
    .line 718
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 719
    .line 720
    const-string v10, "(I)V"

    .line 721
    .line 722
    invoke-interface {v2, v7, v3, v12, v10}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 727
    .line 728
    .line 729
    const/4 v7, 0x1

    .line 730
    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 731
    .line 732
    .line 733
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    iget-object v3, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->typeKey:Ljava/lang/String;

    .line 738
    .line 739
    if-eqz v3, :cond_c

    .line 740
    .line 741
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$400(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    iget-object v3, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->typeKey:Ljava/lang/String;

    .line 746
    .line 747
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    :goto_9
    const/4 v7, 0x2

    .line 751
    goto :goto_a

    .line 752
    :cond_c
    invoke-interface {v2, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 753
    .line 754
    .line 755
    goto :goto_9

    .line 756
    :goto_a
    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 757
    .line 758
    .line 759
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    .line 760
    .line 761
    new-instance v7, Ljava/lang/StringBuilder;

    .line 762
    .line 763
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    sget-object v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    .line 773
    .line 774
    const-string v10, ";Ljava/lang/String;Ljava/lang/Object;)V"

    .line 775
    .line 776
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    const-string v10, "writeClassName"

    .line 784
    .line 785
    const/16 v15, 0xb6

    .line 786
    .line 787
    invoke-interface {v2, v15, v3, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    const/16 v3, 0x2c

    .line 791
    .line 792
    const/16 v10, 0x10

    .line 793
    .line 794
    invoke-interface {v2, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 795
    .line 796
    .line 797
    const/16 v3, 0xa7

    .line 798
    .line 799
    invoke-interface {v2, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 800
    .line 801
    .line 802
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 803
    .line 804
    .line 805
    const/16 v3, 0x7b

    .line 806
    .line 807
    invoke-interface {v2, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 808
    .line 809
    .line 810
    invoke-interface {v2, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 811
    .line 812
    .line 813
    :goto_b
    const-string v3, "seperator"

    .line 814
    .line 815
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 816
    .line 817
    .line 818
    move-result v3

    .line 819
    const/16 v5, 0x36

    .line 820
    .line 821
    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 822
    .line 823
    .line 824
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    if-nez v3, :cond_d

    .line 829
    .line 830
    invoke-direct {v0, v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_before(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 831
    .line 832
    .line 833
    :cond_d
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    if-nez v3, :cond_e

    .line 838
    .line 839
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    const/16 v15, 0x19

    .line 844
    .line 845
    invoke-interface {v2, v15, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 846
    .line 847
    .line 848
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 849
    .line 850
    const-string v6, "isNotWriteDefaultValue"

    .line 851
    .line 852
    const-string v7, "()Z"

    .line 853
    .line 854
    const/16 v14, 0xb6

    .line 855
    .line 856
    invoke-interface {v2, v14, v3, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    const-string v3, "notWriteDefaultValue"

    .line 860
    .line 861
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 866
    .line 867
    .line 868
    const/4 v7, 0x1

    .line 869
    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 870
    .line 871
    .line 872
    const/4 v7, 0x0

    .line 873
    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 874
    .line 875
    .line 876
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 877
    .line 878
    new-instance v6, Ljava/lang/StringBuilder;

    .line 879
    .line 880
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    sget-object v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeFilterable_desc:Ljava/lang/String;

    .line 887
    .line 888
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    const-string v10, ")Z"

    .line 892
    .line 893
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v6

    .line 900
    const-string v10, "checkValue"

    .line 901
    .line 902
    const/16 v15, 0xb6

    .line 903
    .line 904
    invoke-interface {v2, v15, v3, v10, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    const-string v6, "checkValue"

    .line 908
    .line 909
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 910
    .line 911
    .line 912
    move-result v6

    .line 913
    invoke-interface {v2, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 914
    .line 915
    .line 916
    const/4 v6, 0x1

    .line 917
    const/16 v15, 0x19

    .line 918
    .line 919
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 920
    .line 921
    .line 922
    const/4 v6, 0x0

    .line 923
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 924
    .line 925
    .line 926
    new-instance v10, Ljava/lang/StringBuilder;

    .line 927
    .line 928
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 935
    .line 936
    .line 937
    const-string v7, ")Z"

    .line 938
    .line 939
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v7

    .line 946
    const-string v10, "hasNameFilters"

    .line 947
    .line 948
    const/16 v15, 0xb6

    .line 949
    .line 950
    invoke-interface {v2, v15, v3, v10, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    const-string v3, "hasNameFilters"

    .line 954
    .line 955
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 956
    .line 957
    .line 958
    move-result v3

    .line 959
    invoke-interface {v2, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 960
    .line 961
    .line 962
    goto :goto_c

    .line 963
    :cond_e
    const/4 v6, 0x0

    .line 964
    :goto_c
    move v14, v6

    .line 965
    :goto_d
    if-ge v14, v9, :cond_1a

    .line 966
    .line 967
    aget-object v3, p3, v14

    .line 968
    .line 969
    iget-object v5, v3, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    .line 970
    .line 971
    iget-object v6, v3, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    .line 972
    .line 973
    invoke-interface {v2, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 974
    .line 975
    .line 976
    const/16 v6, 0x3a

    .line 977
    .line 978
    sget v7, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->fieldName:I

    .line 979
    .line 980
    invoke-interface {v2, v6, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 981
    .line 982
    .line 983
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 984
    .line 985
    if-eq v5, v6, :cond_19

    .line 986
    .line 987
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 988
    .line 989
    if-eq v5, v6, :cond_19

    .line 990
    .line 991
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 992
    .line 993
    if-ne v5, v6, :cond_f

    .line 994
    .line 995
    goto/16 :goto_e

    .line 996
    .line 997
    :cond_f
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 998
    .line 999
    if-ne v5, v6, :cond_10

    .line 1000
    .line 1001
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_long(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1002
    .line 1003
    .line 1004
    goto/16 :goto_f

    .line 1005
    .line 1006
    :cond_10
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 1007
    .line 1008
    if-ne v5, v6, :cond_11

    .line 1009
    .line 1010
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_float(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1011
    .line 1012
    .line 1013
    goto/16 :goto_f

    .line 1014
    .line 1015
    :cond_11
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 1016
    .line 1017
    if-ne v5, v6, :cond_12

    .line 1018
    .line 1019
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_double(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1020
    .line 1021
    .line 1022
    goto/16 :goto_f

    .line 1023
    .line 1024
    :cond_12
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1025
    .line 1026
    if-ne v5, v6, :cond_13

    .line 1027
    .line 1028
    const-string v5, "boolean"

    .line 1029
    .line 1030
    invoke-virtual {v4, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1031
    .line 1032
    .line 1033
    move-result v5

    .line 1034
    const/16 v6, 0x5a

    .line 1035
    .line 1036
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_int(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;IC)V

    .line 1037
    .line 1038
    .line 1039
    move-object/from16 v0, p0

    .line 1040
    .line 1041
    move-object/from16 v2, p2

    .line 1042
    .line 1043
    goto :goto_f

    .line 1044
    :cond_13
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 1045
    .line 1046
    if-ne v5, v0, :cond_14

    .line 1047
    .line 1048
    const-string v0, "char"

    .line 1049
    .line 1050
    invoke-virtual {v4, v0}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1051
    .line 1052
    .line 1053
    move-result v5

    .line 1054
    const/16 v6, 0x43

    .line 1055
    .line 1056
    move-object/from16 v0, p0

    .line 1057
    .line 1058
    move-object/from16 v1, p1

    .line 1059
    .line 1060
    move-object/from16 v2, p2

    .line 1061
    .line 1062
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_int(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;IC)V

    .line 1063
    .line 1064
    .line 1065
    goto :goto_f

    .line 1066
    :cond_14
    move-object/from16 v0, p0

    .line 1067
    .line 1068
    move-object/from16 v1, p1

    .line 1069
    .line 1070
    move-object/from16 v2, p2

    .line 1071
    .line 1072
    const-class v6, Ljava/lang/String;

    .line 1073
    .line 1074
    if-ne v5, v6, :cond_15

    .line 1075
    .line 1076
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_string(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_f

    .line 1080
    :cond_15
    const-class v6, Ljava/math/BigDecimal;

    .line 1081
    .line 1082
    if-ne v5, v6, :cond_16

    .line 1083
    .line 1084
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_decimal(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1085
    .line 1086
    .line 1087
    goto :goto_f

    .line 1088
    :cond_16
    const-class v6, Ljava/util/List;

    .line 1089
    .line 1090
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v6

    .line 1094
    if-eqz v6, :cond_17

    .line 1095
    .line 1096
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_list(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1097
    .line 1098
    .line 1099
    goto :goto_f

    .line 1100
    :cond_17
    invoke-virtual {v5}, Ljava/lang/Class;->isEnum()Z

    .line 1101
    .line 1102
    .line 1103
    move-result v5

    .line 1104
    if-eqz v5, :cond_18

    .line 1105
    .line 1106
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_enum(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_f

    .line 1110
    :cond_18
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_object(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1111
    .line 1112
    .line 1113
    goto :goto_f

    .line 1114
    :cond_19
    :goto_e
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v5

    .line 1118
    invoke-virtual {v4, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    const/16 v6, 0x49

    .line 1123
    .line 1124
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_int(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;IC)V

    .line 1125
    .line 1126
    .line 1127
    :goto_f
    add-int/lit8 v14, v14, 0x1

    .line 1128
    .line 1129
    move-object/from16 v1, p1

    .line 1130
    .line 1131
    goto/16 :goto_d

    .line 1132
    .line 1133
    :cond_1a
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v1

    .line 1137
    if-nez v1, :cond_1b

    .line 1138
    .line 1139
    invoke-direct {v0, v2, v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->_after(Lcom/alibaba/fastjson/asm/MethodVisitor;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 1140
    .line 1141
    .line 1142
    :cond_1b
    new-instance v1, Lcom/alibaba/fastjson/asm/Label;

    .line 1143
    .line 1144
    invoke-direct {v1}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 1145
    .line 1146
    .line 1147
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    .line 1148
    .line 1149
    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 1150
    .line 1151
    .line 1152
    const-string v5, "seperator"

    .line 1153
    .line 1154
    invoke-virtual {v4, v5}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1155
    .line 1156
    .line 1157
    move-result v5

    .line 1158
    const/16 v6, 0x15

    .line 1159
    .line 1160
    invoke-interface {v2, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1161
    .line 1162
    .line 1163
    const/16 v5, 0x7b

    .line 1164
    .line 1165
    const/16 v10, 0x10

    .line 1166
    .line 1167
    invoke-interface {v2, v10, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitIntInsn(II)V

    .line 1168
    .line 1169
    .line 1170
    const/16 v6, 0xa0

    .line 1171
    .line 1172
    invoke-interface {v2, v6, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1176
    .line 1177
    .line 1178
    move-result v6

    .line 1179
    const/16 v15, 0x19

    .line 1180
    .line 1181
    invoke-interface {v2, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1182
    .line 1183
    .line 1184
    invoke-interface {v2, v10, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1185
    .line 1186
    .line 1187
    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    .line 1188
    .line 1189
    const-string v6, "(I)V"

    .line 1190
    .line 1191
    const/16 v14, 0xb6

    .line 1192
    .line 1193
    invoke-interface {v2, v14, v5, v12, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    invoke-interface {v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v4, v13}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1200
    .line 1201
    .line 1202
    move-result v1

    .line 1203
    invoke-interface {v2, v15, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1204
    .line 1205
    .line 1206
    const/16 v1, 0x7d

    .line 1207
    .line 1208
    invoke-interface {v2, v10, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1209
    .line 1210
    .line 1211
    const-string v1, "(I)V"

    .line 1212
    .line 1213
    invoke-interface {v2, v14, v5, v12, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    invoke-interface {v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1217
    .line 1218
    .line 1219
    move-object/from16 v1, v17

    .line 1220
    .line 1221
    invoke-interface {v2, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-static {v4}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$200(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v1

    .line 1228
    if-nez v1, :cond_1c

    .line 1229
    .line 1230
    const/4 v7, 0x1

    .line 1231
    invoke-interface {v2, v15, v7}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1232
    .line 1233
    .line 1234
    move-object/from16 v1, v16

    .line 1235
    .line 1236
    invoke-virtual {v4, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    .line 1237
    .line 1238
    .line 1239
    move-result v1

    .line 1240
    invoke-interface {v2, v15, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 1241
    .line 1242
    .line 1243
    sget-object v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    .line 1244
    .line 1245
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1246
    .line 1247
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1251
    .line 1252
    .line 1253
    sget-object v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerialContext_desc:Ljava/lang/String;

    .line 1254
    .line 1255
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1256
    .line 1257
    .line 1258
    const-string v4, ")V"

    .line 1259
    .line 1260
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v3

    .line 1267
    const-string v4, "setContext"

    .line 1268
    .line 1269
    const/16 v15, 0xb6

    .line 1270
    .line 1271
    invoke-interface {v2, v15, v1, v4, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    :cond_1c
    return-void
.end method


# virtual methods
.method public createJavaBeanSerializer(Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;)Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    .line 1
    iget-object v7, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->beanType:Ljava/lang/Class;

    .line 2
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_1b

    .line 3
    const-class v1, Lcom/alibaba/fastjson/annotation/JSONType;

    invoke-static {v7, v1}, Lcom/alibaba/fastjson/util/TypeUtils;->getAnnotation(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/alibaba/fastjson/annotation/JSONType;

    .line 4
    iget-object v9, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 5
    array-length v1, v9

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v9, v2

    .line 6
    iget-object v5, v4, Lcom/alibaba/fastjson/util/FieldInfo;->field:Ljava/lang/reflect/Field;

    if-nez v5, :cond_0

    iget-object v4, v4, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_0

    .line 7
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 8
    new-instance v1, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    invoke-direct {v1, v3}, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;-><init>(Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;)V

    return-object v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_1
    iget-object v2, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->sortedFields:[Lcom/alibaba/fastjson/util/FieldInfo;

    .line 10
    iget-object v1, v3, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;->fields:[Lcom/alibaba/fastjson/util/FieldInfo;

    if-ne v2, v1, :cond_2

    const/4 v12, 0x1

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    .line 11
    :goto_1
    array-length v1, v2

    const/16 v4, 0x100

    if-le v1, v4, :cond_3

    .line 12
    new-instance v1, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    invoke-direct {v1, v3}, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;-><init>(Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;)V

    return-object v1

    .line 13
    :cond_3
    array-length v1, v2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_5

    aget-object v5, v2, v4

    .line 14
    invoke-virtual {v5}, Lcom/alibaba/fastjson/util/FieldInfo;->getMember()Ljava/lang/reflect/Member;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/alibaba/fastjson/util/ASMUtils;->checkName(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 15
    new-instance v1, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    invoke-direct {v1, v3}, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;-><init>(Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;)V

    return-object v1

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 16
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ASMSerializer_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->seed:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 17
    const-class v4, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;

    invoke-virtual {v4}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 18
    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    .line 19
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x2e

    const/16 v13, 0x2f

    invoke-virtual {v4, v6, v13}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 20
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v4, v5

    goto :goto_3

    :cond_6
    move-object v4, v1

    .line 21
    :goto_3
    new-instance v14, Lcom/alibaba/fastjson/asm/ClassWriter;

    invoke-direct {v14}, Lcom/alibaba/fastjson/asm/ClassWriter;-><init>()V

    .line 22
    sget-object v17, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer:Ljava/lang/String;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v18

    move-object v13, v14

    const/16 v14, 0x31

    const/16 v15, 0x21

    move-object/from16 v16, v4

    invoke-virtual/range {v13 .. v18}, Lcom/alibaba/fastjson/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    move-object v14, v13

    .line 23
    array-length v5, v2

    const/4 v6, 0x0

    :goto_4
    const-string v13, "_asm_fieldType"

    const-class v15, Ljava/lang/String;

    if-ge v6, v5, :cond_a

    aget-object v10, v2, v6

    .line 24
    iget-object v11, v10, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    move-result v11

    if-nez v11, :cond_7

    iget-object v11, v10, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    if-ne v11, v15, :cond_8

    :cond_7
    move-object/from16 v20, v1

    goto :goto_5

    .line 25
    :cond_8
    new-instance v11, Lcom/alibaba/fastjson/asm/FieldWriter;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v1

    iget-object v1, v10, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v13, "Ljava/lang/reflect/Type;"

    const/4 v15, 0x1

    invoke-direct {v11, v14, v15, v1, v13}, Lcom/alibaba/fastjson/asm/FieldWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v11}, Lcom/alibaba/fastjson/asm/FieldWriter;->visitEnd()V

    .line 27
    const-class v1, Ljava/util/List;

    iget-object v11, v10, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v1, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 28
    new-instance v1, Lcom/alibaba/fastjson/asm/FieldWriter;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v10, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "_asm_list_item_ser_"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    sget-object v13, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer_desc:Ljava/lang/String;

    const/4 v15, 0x1

    invoke-direct {v1, v14, v15, v11, v13}, Lcom/alibaba/fastjson/asm/FieldWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v1}, Lcom/alibaba/fastjson/asm/FieldWriter;->visitEnd()V

    .line 30
    :cond_9
    new-instance v1, Lcom/alibaba/fastjson/asm/FieldWriter;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, v10, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "_asm_ser_"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->ObjectSerializer_desc:Ljava/lang/String;

    const/4 v15, 0x1

    invoke-direct {v1, v14, v15, v10, v11}, Lcom/alibaba/fastjson/asm/FieldWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {v1}, Lcom/alibaba/fastjson/asm/FieldWriter;->visitEnd()V

    :goto_5
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v20

    goto :goto_4

    :cond_a
    move-object/from16 v20, v1

    .line 32
    new-instance v1, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v10, Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;

    invoke-static {v10}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ")V"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v5, v15

    const/4 v15, 0x1

    const-string v16, "<init>"

    move-object/from16 v32, v13

    move-object v13, v1

    move-object/from16 v1, v32

    invoke-direct/range {v13 .. v19}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v11, 0x19

    const/4 v6, 0x0

    .line 33
    invoke-interface {v13, v11, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v15, 0x1

    .line 34
    invoke-interface {v13, v11, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 35
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "("

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ")V"

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/16 v15, 0xb7

    const-string v3, "<init>"

    invoke-interface {v13, v15, v6, v3, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 36
    :goto_6
    array-length v6, v2

    if-ge v3, v6, :cond_e

    .line 37
    aget-object v6, v2, v3

    .line 38
    iget-object v11, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    move-result v11

    if-nez v11, :cond_b

    iget-object v11, v6, Lcom/alibaba/fastjson/util/FieldInfo;->fieldClass:Ljava/lang/Class;

    if-ne v11, v5, :cond_c

    :cond_b
    move-object/from16 v16, v2

    move/from16 v17, v3

    goto :goto_8

    :cond_c
    const/4 v11, 0x0

    const/16 v15, 0x19

    .line 39
    invoke-interface {v13, v15, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 40
    iget-object v11, v6, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    if-eqz v11, :cond_d

    .line 41
    iget-object v11, v6, Lcom/alibaba/fastjson/util/FieldInfo;->declaringClass:Ljava/lang/Class;

    invoke-static {v11}, Lcom/alibaba/fastjson/util/ASMUtils;->desc(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/alibaba/fastjson/asm/Type;->getType(Ljava/lang/String;)Lcom/alibaba/fastjson/asm/Type;

    move-result-object v11

    invoke-interface {v13, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 42
    iget-object v11, v6, Lcom/alibaba/fastjson/util/FieldInfo;->method:Ljava/lang/reflect/Method;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v13, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 43
    const-class v11, Lcom/alibaba/fastjson/util/ASMUtils;

    invoke-static {v11}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v11

    const-string v15, "getMethodType"

    move-object/from16 v16, v2

    const-string v2, "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;"

    move/from16 v17, v3

    const/16 v3, 0xb8

    invoke-interface {v13, v3, v11, v15, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    move-object/from16 v16, v2

    move/from16 v17, v3

    const/4 v11, 0x0

    const/16 v15, 0x19

    .line 44
    invoke-interface {v13, v15, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v13, v2}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 46
    sget-object v2, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    const-string v3, "getFieldType"

    const-string v11, "(I)Ljava/lang/reflect/Type;"

    const/16 v15, 0xb7

    invoke-interface {v13, v15, v2, v3, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v6, Lcom/alibaba/fastjson/util/FieldInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Ljava/lang/reflect/Type;"

    const/16 v6, 0xb5

    invoke-interface {v13, v6, v4, v2, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_8
    add-int/lit8 v3, v17, 0x1

    move-object/from16 v2, v16

    goto/16 :goto_6

    :cond_e
    move-object/from16 v16, v2

    const/16 v11, 0xb1

    .line 48
    invoke-interface {v13, v11}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    const/4 v15, 0x4

    .line 49
    invoke-interface {v13, v15, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 50
    invoke-interface {v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    if-eqz v8, :cond_10

    .line 51
    invoke-interface {v8}, Lcom/alibaba/fastjson/annotation/JSONType;->serialzeFeatures()[Lcom/alibaba/fastjson/serializer/SerializerFeature;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v2, :cond_10

    aget-object v5, v1, v3

    .line 52
    sget-object v6, Lcom/alibaba/fastjson/serializer/SerializerFeature;->DisableCircularReferenceDetect:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    if-ne v5, v6, :cond_f

    const/16 v21, 0x1

    goto :goto_a

    :cond_f
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_10
    const/16 v21, 0x0

    :goto_a
    const/4 v13, 0x0

    .line 53
    :goto_b
    const-string v2, "entity"

    const/16 v3, 0xc0

    const/16 v5, 0xb4

    const-string v22, "java/io/IOException"

    const/4 v6, 0x3

    const-string v11, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    const-string v15, "(L"

    move-object/from16 v23, v8

    const-string v8, "out"

    move-object/from16 v24, v10

    if-ge v13, v6, :cond_16

    if-nez v13, :cond_11

    .line 54
    const-string v18, "write"

    move v1, v5

    move/from16 v25, v6

    move/from16 v6, v21

    const/4 v5, 0x1

    goto :goto_c

    :cond_11
    const/4 v1, 0x1

    if-ne v13, v1, :cond_12

    .line 55
    const-string v18, "writeNormal"

    move v1, v5

    move/from16 v25, v6

    move/from16 v6, v21

    const/4 v5, 0x0

    goto :goto_c

    .line 56
    :cond_12
    const-string v18, "writeDirectNonContext"

    move v1, v5

    move/from16 v25, v6

    const/4 v5, 0x1

    const/4 v6, 0x1

    .line 57
    :goto_c
    new-instance v26, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;

    move-object/from16 v3, p1

    move-object/from16 v28, v2

    move-object/from16 v2, v16

    move-object/from16 v27, v20

    move-object/from16 v1, v26

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;-><init>([Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;Ljava/lang/String;ZZ)V

    move v3, v13

    .line 58
    new-instance v13, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v10, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v16, v18

    const/16 v18, 0x0

    filled-new-array/range {v22 .. v22}, [Ljava/lang/String;

    move-result-object v19

    move-object/from16 v22, v15

    const/4 v15, 0x1

    move-object/from16 v17, v5

    move-object/from16 v31, v22

    const/4 v5, 0x4

    invoke-direct/range {v13 .. v19}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 59
    new-instance v15, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v15}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    move/from16 v16, v3

    const/16 v3, 0x19

    const/4 v5, 0x2

    .line 60
    invoke-interface {v13, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v5, 0xc7

    .line 61
    invoke-interface {v13, v5, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v5, 0x1

    .line 62
    invoke-interface {v13, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 63
    const-string v3, "writeNull"

    const-string v5, "()V"

    move/from16 v18, v6

    const/16 v6, 0xb6

    invoke-interface {v13, v6, v10, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xb1

    .line 64
    invoke-interface {v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 65
    invoke-interface {v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    const/16 v3, 0x19

    const/4 v15, 0x1

    .line 66
    invoke-interface {v13, v3, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 67
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter_desc:Ljava/lang/String;

    const/16 v15, 0xb4

    invoke-interface {v13, v15, v10, v8, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    if-nez v12, :cond_13

    .line 69
    invoke-static {v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v15

    if-nez v15, :cond_13

    if-eqz v23, :cond_14

    .line 70
    invoke-interface/range {v23 .. v23}, Lcom/alibaba/fastjson/annotation/JSONType;->alphabetic()Z

    move-result v15

    if-eqz v15, :cond_13

    goto :goto_d

    :cond_13
    move/from16 v25, v12

    move-object/from16 v5, v31

    goto :goto_e

    .line 71
    :cond_14
    :goto_d
    new-instance v15, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v15}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 72
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x19

    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 73
    sget-object v3, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v5, "isSortField"

    move/from16 v25, v12

    const-string v12, "()Z"

    invoke-interface {v13, v6, v3, v5, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x9a

    .line 74
    invoke-interface {v13, v3, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v3, 0x0

    const/16 v5, 0x19

    .line 75
    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x1

    .line 76
    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x2

    .line 77
    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v12, 0x3

    .line 78
    invoke-interface {v13, v5, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x4

    .line 79
    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x5

    const/16 v5, 0x15

    .line 80
    invoke-interface {v13, v5, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 81
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v5, v31

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v12, "writeUnsorted"

    invoke-interface {v13, v6, v4, v12, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xb1

    .line 82
    invoke-interface {v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 83
    invoke-interface {v13, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 84
    :goto_e
    invoke-static {v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$000(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)Z

    move-result v3

    if-eqz v3, :cond_15

    if-nez v18, :cond_15

    .line 85
    new-instance v3, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v3}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    .line 86
    new-instance v12, Lcom/alibaba/fastjson/asm/Label;

    invoke-direct {v12}, Lcom/alibaba/fastjson/asm/Label;-><init>()V

    const/16 v6, 0x19

    const/4 v15, 0x0

    .line 87
    invoke-interface {v13, v6, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v15, 0x1

    .line 88
    invoke-interface {v13, v6, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 89
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JavaBeanSerializer:Ljava/lang/String;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v26, v14

    const-string v14, ";)Z"

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v15, "writeDirect"

    move-object/from16 v29, v9

    const/16 v9, 0xb6

    invoke-interface {v13, v9, v6, v15, v14}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x9a

    .line 90
    invoke-interface {v13, v6, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/16 v6, 0x19

    const/4 v15, 0x0

    .line 91
    invoke-interface {v13, v6, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v15, 0x1

    .line 92
    invoke-interface {v13, v6, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x2

    .line 93
    invoke-interface {v13, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x3

    .line 94
    invoke-interface {v13, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x4

    .line 95
    invoke-interface {v13, v6, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x5

    const/16 v9, 0x15

    .line 96
    invoke-interface {v13, v9, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 97
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v9, "writeNormal"

    const/16 v14, 0xb6

    invoke-interface {v13, v14, v4, v9, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xb1

    .line 98
    invoke-interface {v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 99
    invoke-interface {v13, v12}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    .line 100
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v15, 0x19

    invoke-interface {v13, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 101
    sget-object v6, Lcom/alibaba/fastjson/serializer/SerializerFeature;->DisableCircularReferenceDetect:Lcom/alibaba/fastjson/serializer/SerializerFeature;

    iget v6, v6, Lcom/alibaba/fastjson/serializer/SerializerFeature;->mask:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 102
    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter:Ljava/lang/String;

    const-string v8, "isEnabled"

    const-string v9, "(I)Z"

    const/16 v14, 0xb6

    invoke-interface {v13, v14, v6, v8, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x99

    .line 103
    invoke-interface {v13, v6, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitJumpInsn(ILcom/alibaba/fastjson/asm/Label;)V

    const/4 v6, 0x0

    .line 104
    invoke-interface {v13, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x1

    .line 105
    invoke-interface {v13, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x2

    .line 106
    invoke-interface {v13, v15, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x3

    .line 107
    invoke-interface {v13, v15, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v9, 0x4

    .line 108
    invoke-interface {v13, v15, v9}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x5

    const/16 v8, 0x15

    .line 109
    invoke-interface {v13, v8, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 110
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "writeDirectNonContext"

    const/16 v14, 0xb6

    invoke-interface {v13, v14, v4, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0xb1

    .line 111
    invoke-interface {v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 112
    invoke-interface {v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitLabel(Lcom/alibaba/fastjson/asm/Label;)V

    :goto_f
    const/4 v3, 0x2

    const/16 v15, 0x19

    goto :goto_10

    :cond_15
    move-object/from16 v29, v9

    move-object/from16 v26, v14

    const/16 v6, 0xb1

    const/4 v9, 0x4

    goto :goto_f

    .line 113
    :goto_10
    invoke-interface {v13, v15, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 114
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    const/16 v10, 0xc0

    invoke-interface {v13, v10, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    move-object/from16 v12, v28

    .line 115
    invoke-virtual {v1, v12}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v8, 0x3a

    invoke-interface {v13, v8, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 116
    invoke-direct {v0, v7, v13, v2, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->generateWriteMethod(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;[Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    .line 117
    invoke-interface {v13, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 118
    invoke-static {v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$100(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)I

    move-result v1

    add-int/2addr v1, v3

    const/4 v14, 0x7

    invoke-interface {v13, v14, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 119
    invoke-interface {v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    add-int/lit8 v13, v16, 0x1

    move-object/from16 v16, v2

    move v15, v9

    move-object/from16 v8, v23

    move-object/from16 v10, v24

    move/from16 v12, v25

    move-object/from16 v14, v26

    move-object/from16 v20, v27

    move-object/from16 v9, v29

    const/16 v11, 0xb1

    goto/16 :goto_b

    :cond_16
    move-object v10, v15

    move v15, v5

    move-object v5, v10

    move v10, v3

    move-object/from16 v29, v9

    move/from16 v25, v12

    move-object/from16 v26, v14

    move-object/from16 v27, v20

    const/4 v14, 0x7

    move-object v12, v2

    move-object/from16 v2, v16

    if-nez v25, :cond_17

    .line 120
    new-instance v1, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;

    move-object/from16 v31, v5

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move/from16 v6, v21

    move-object/from16 v9, v31

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;-><init>([Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;Ljava/lang/String;ZZ)V

    .line 121
    new-instance v13, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    filled-new-array/range {v22 .. v22}, [Ljava/lang/String;

    move-result-object v19

    move v3, v15

    const/4 v15, 0x1

    const-string v16, "writeUnsorted"

    move v6, v3

    move v3, v14

    move-object/from16 v14, v26

    invoke-direct/range {v13 .. v19}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v3, 0x19

    const/4 v15, 0x1

    .line 122
    invoke-interface {v13, v3, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 123
    sget-object v15, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter_desc:Ljava/lang/String;

    invoke-interface {v13, v6, v5, v8, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    const/16 v15, 0x3a

    invoke-interface {v13, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v5, 0x2

    .line 125
    invoke-interface {v13, v3, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 126
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v13, v10, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 127
    invoke-virtual {v1, v12}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v13, v15, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    move-object/from16 v3, v29

    .line 128
    invoke-direct {v0, v7, v13, v3, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->generateWriteMethod(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;[Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    const/16 v3, 0xb1

    .line 129
    invoke-interface {v13, v3}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 130
    invoke-static {v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$100(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)I

    move-result v1

    add-int/2addr v1, v5

    const/4 v3, 0x7

    invoke-interface {v13, v3, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 131
    invoke-interface {v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    goto :goto_11

    :cond_17
    move-object v9, v5

    move v3, v14

    move v6, v15

    move-object/from16 v14, v26

    :goto_11
    const/4 v13, 0x0

    const/4 v15, 0x3

    :goto_12
    if-ge v13, v15, :cond_1a

    if-nez v13, :cond_18

    .line 132
    const-string v1, "writeAsArray"

    move-object/from16 v16, v1

    move v1, v6

    move/from16 v6, v21

    const/4 v5, 0x1

    goto :goto_13

    :cond_18
    const/4 v1, 0x1

    if-ne v13, v1, :cond_19

    .line 133
    const-string v1, "writeAsArrayNormal"

    move-object/from16 v16, v1

    move v1, v6

    move/from16 v6, v21

    const/4 v5, 0x0

    goto :goto_13

    .line 134
    :cond_19
    const-string v1, "writeAsArrayNonContext"

    move-object/from16 v16, v1

    move v1, v6

    const/4 v5, 0x1

    const/4 v6, 0x1

    .line 135
    :goto_13
    new-instance v17, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;

    move-object/from16 v3, p1

    move v10, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;-><init>([Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/SerializeBeanInfo;Ljava/lang/String;ZZ)V

    move v3, v13

    .line 136
    new-instance v13, Lcom/alibaba/fastjson/asm/MethodWriter;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->JSONSerializer:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    const/16 v18, 0x0

    filled-new-array/range {v22 .. v22}, [Ljava/lang/String;

    move-result-object v19

    move/from16 v30, v15

    const/4 v15, 0x1

    invoke-direct/range {v13 .. v19}, Lcom/alibaba/fastjson/asm/MethodWriter;-><init>(Lcom/alibaba/fastjson/asm/ClassWriter;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/16 v5, 0x19

    const/4 v15, 0x1

    .line 137
    invoke-interface {v13, v5, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 138
    sget-object v15, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->SerializeWriter_desc:Ljava/lang/String;

    invoke-interface {v13, v10, v6, v8, v15}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v6

    const/16 v15, 0x3a

    invoke-interface {v13, v15, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v6, 0x2

    .line 140
    invoke-interface {v13, v5, v6}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 141
    invoke-static {v7}, Lcom/alibaba/fastjson/util/ASMUtils;->type(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v5

    move/from16 v20, v6

    const/16 v6, 0xc0

    invoke-interface {v13, v6, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 142
    invoke-virtual {v1, v12}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->var(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v13, v15, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitVarInsn(II)V

    .line 143
    invoke-direct {v0, v7, v13, v2, v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->generateWriteAsArray(Ljava/lang/Class;Lcom/alibaba/fastjson/asm/MethodVisitor;[Lcom/alibaba/fastjson/util/FieldInfo;Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)V

    const/16 v5, 0xb1

    .line 144
    invoke-interface {v13, v5}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitInsn(I)V

    .line 145
    invoke-static {v1}, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;->access$100(Lcom/alibaba/fastjson/serializer/ASMSerializerFactory$Context;)I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    const/4 v5, 0x7

    invoke-interface {v13, v5, v1}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitMaxs(II)V

    .line 146
    invoke-interface {v13}, Lcom/alibaba/fastjson/asm/MethodVisitor;->visitEnd()V

    add-int/lit8 v13, v3, 0x1

    move v3, v10

    move v10, v6

    move v6, v3

    move v3, v5

    move/from16 v15, v30

    goto/16 :goto_12

    .line 147
    :cond_1a
    invoke-virtual {v14}, Lcom/alibaba/fastjson/asm/ClassWriter;->toByteArray()[B

    move-result-object v1

    .line 148
    iget-object v2, v0, Lcom/alibaba/fastjson/serializer/ASMSerializerFactory;->classLoader:Lcom/alibaba/fastjson/util/ASMClassLoader;

    array-length v3, v1

    move-object/from16 v4, v27

    const/4 v15, 0x0

    invoke-virtual {v2, v4, v1, v15, v3}, Lcom/alibaba/fastjson/util/ASMClassLoader;->defineClassPublic(Ljava/lang/String;[BII)Ljava/lang/Class;

    move-result-object v1

    .line 149
    filled-new-array/range {v24 .. v24}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 150
    filled-new-array/range {p1 .. p1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 151
    check-cast v1, Lcom/alibaba/fastjson/serializer/JavaBeanSerializer;

    return-object v1

    .line 152
    :cond_1b
    new-instance v1, Lcom/alibaba/fastjson/JSONException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unsupportd class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson/JSONException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
