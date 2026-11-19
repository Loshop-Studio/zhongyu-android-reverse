.class public final Lcom/google/protobuf/TextFormat$Printer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/TextFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Printer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;,
        Lcom/google/protobuf/TextFormat$Printer$MapEntryAdapter;
    }
.end annotation


# static fields
.field private static final DEFAULT_DEBUG_FORMAT:Lcom/google/protobuf/TextFormat$Printer;

.field private static final DEFAULT_TEXT_FORMAT:Lcom/google/protobuf/TextFormat$Printer;

.field private static final sensitiveFieldReportingLevel:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final enablingSafeDebugFormat:Z

.field private final escapeNonAscii:Z

.field private final extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

.field private final singleLine:Z

.field private final typeRegistry:Lcom/google/protobuf/TypeRegistry;

.field private final useShortRepeatedPrimitives:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/TypeRegistry;->getEmptyTypeRegistry()Lcom/google/protobuf/TypeRegistry;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-static {}, Lcom/google/protobuf/ExtensionRegistryLite;->getEmptyRegistry()Lcom/google/protobuf/ExtensionRegistryLite;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT_TEXT_FORMAT:Lcom/google/protobuf/TextFormat$Printer;

    .line 19
    .line 20
    new-instance v1, Lcom/google/protobuf/TextFormat$Printer;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/protobuf/TypeRegistry;->getEmptyTypeRegistry()Lcom/google/protobuf/TypeRegistry;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {}, Lcom/google/protobuf/ExtensionRegistryLite;->getEmptyRegistry()Lcom/google/protobuf/ExtensionRegistryLite;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v2, 0x1

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct/range {v1 .. v7}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT_DEBUG_FORMAT:Lcom/google/protobuf/TextFormat$Printer;

    .line 38
    .line 39
    new-instance v0, Lcom/google/protobuf/TextFormat$Printer$1;

    .line 40
    .line 41
    invoke-direct {v0}, Lcom/google/protobuf/TextFormat$Printer$1;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lcom/google/protobuf/TextFormat$Printer;->sensitiveFieldReportingLevel:Ljava/lang/ThreadLocal;

    .line 45
    .line 46
    return-void
.end method

.method private constructor <init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic access$000(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100()Lcom/google/protobuf/TextFormat$Printer;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT_TEXT_FORMAT:Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$200()Lcom/google/protobuf/TextFormat$Printer;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->DEFAULT_DEBUG_FORMAT:Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    return-object v0
.end method

.method private applyUnstablePrefix(Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, ""

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method private print(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 2

    .line 8
    invoke-interface {p1}, Lcom/google/protobuf/MessageOrBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getFullName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "google.protobuf.Any"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printAny(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printMessage(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void
.end method

.method private printAny(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)Z
    .locals 6

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/MessageOrBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Descriptors$Descriptor;->findFieldByNumber(I)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x2

    .line 11
    invoke-virtual {v0, v3}, Lcom/google/protobuf/Descriptors$Descriptor;->findFieldByNumber(I)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    sget-object v5, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->STRING:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 23
    .line 24
    if-ne v4, v5, :cond_3

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    sget-object v5, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->BYTES:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 33
    .line 34
    if-eq v4, v5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p1, v2}, Lcom/google/protobuf/MessageOrBuilder;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    return v3

    .line 50
    :cond_1
    invoke-interface {p1, v0}, Lcom/google/protobuf/MessageOrBuilder;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/google/protobuf/TypeRegistry;->getDescriptorForTypeUrl(Ljava/lang/String;)Lcom/google/protobuf/Descriptors$Descriptor;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    return v3

    .line 63
    :cond_2
    invoke-static {v0}, Lcom/google/protobuf/DynamicMessage;->getDefaultInstance(Lcom/google/protobuf/Descriptors$Descriptor;)Lcom/google/protobuf/DynamicMessage;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lcom/google/protobuf/DynamicMessage;->newBuilderForType()Lcom/google/protobuf/DynamicMessage$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 72
    .line 73
    iget-object v4, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 74
    .line 75
    invoke-interface {v0, p1, v4}, Lcom/google/protobuf/Message$Builder;->mergeFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    const-string p1, "["

    .line 79
    .line 80
    invoke-virtual {p2, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v2}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    const-string p1, "] {"

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->indent()V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v0, p2}, Lcom/google/protobuf/TextFormat$Printer;->print(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->outdent()V

    .line 101
    .line 102
    .line 103
    const-string p1, "}"

    .line 104
    .line 105
    invoke-virtual {p2, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 109
    .line 110
    .line 111
    return v1

    .line 112
    :catch_0
    :cond_3
    :goto_0
    return v3
.end method

.method private printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 3

    .line 2
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isMapField()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 5
    new-instance v2, Lcom/google/protobuf/TextFormat$Printer$MapEntryAdapter;

    invoke-direct {v2, v1, p1}, Lcom/google/protobuf/TextFormat$Printer$MapEntryAdapter;-><init>(Ljava/lang/Object;Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    check-cast v2, Lcom/google/protobuf/TextFormat$Printer$MapEntryAdapter;

    .line 8
    invoke-virtual {v2}, Lcom/google/protobuf/TextFormat$Printer$MapEntryAdapter;->getEntry()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, p1, v2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printSingleField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-eq v0, v1, :cond_2

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printShortRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void

    .line 12
    :cond_2
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 13
    invoke-direct {p0, p1, v0, p3}, Lcom/google/protobuf/TextFormat$Printer;->printSingleField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    goto :goto_2

    :cond_3
    return-void

    .line 14
    :cond_4
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printSingleField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void
.end method

.method private printFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p3}, Lcom/google/protobuf/TextFormat$Printer;->shouldRedact(Lcom/google/protobuf/Descriptors$FieldDescriptor;Lcom/google/protobuf/TextFormat$TextGenerator;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    const-string p2, "[REDACTED]"

    invoke-virtual {p3, p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object p1

    sget-object p2, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne p1, p2, :cond_1

    .line 5
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    return-void

    .line 6
    :cond_0
    sget-object v0, Lcom/google/protobuf/TextFormat$1;->$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type:[I

    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "\""

    packed-switch p1, :pswitch_data_0

    :cond_1
    return-void

    .line 7
    :pswitch_0
    check-cast p2, Lcom/google/protobuf/MessageOrBuilder;

    invoke-direct {p0, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->print(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void

    .line 8
    :pswitch_1
    check-cast p2, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    invoke-virtual {p2}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 9
    invoke-virtual {p2}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getNumber()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 10
    :cond_2
    invoke-virtual {p2}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 11
    :pswitch_2
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 12
    instance-of p1, p2, Lcom/google/protobuf/ByteString;

    if-eqz p1, :cond_3

    .line 13
    check-cast p2, Lcom/google/protobuf/ByteString;

    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->escapeBytes(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 14
    :cond_3
    check-cast p2, [B

    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->escapeBytes([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 15
    :goto_0
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 16
    :pswitch_3
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 17
    iget-boolean p1, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    if-eqz p1, :cond_4

    .line 18
    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/google/protobuf/TextFormatEscaper;->escapeText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 19
    :cond_4
    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/google/protobuf/TextFormat;->escapeDoubleQuotesAndBackslashes(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "\n"

    const-string v1, "\\n"

    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 20
    :goto_1
    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 21
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 22
    :pswitch_4
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/google/protobuf/TextFormat;->unsignedToString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 23
    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/google/protobuf/TextFormat;->unsignedToString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 24
    :pswitch_6
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 25
    :pswitch_7
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 26
    :pswitch_8
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 27
    :pswitch_9
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    .line 28
    :pswitch_a
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private printMessage(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lcom/google/protobuf/MessageOrBuilder;->getAllFields()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p0, v2, v1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {p1}, Lcom/google/protobuf/MessageOrBuilder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 44
    .line 45
    invoke-static {p1, p2, v0}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private printShortRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    const-string v0, ": "

    .line 9
    .line 10
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "["

    .line 14
    .line 15
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    check-cast p2, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string v0, ""

    .line 25
    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v1, p3}, Lcom/google/protobuf/TextFormat$Printer;->printFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 40
    .line 41
    .line 42
    const-string v0, ", "

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string p1, "]"

    .line 46
    .line 47
    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private printSingleField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const-string v0, "["

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getOptions()Lcom/google/protobuf/DescriptorProtos$MessageOptions;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$MessageOptions;->getMessageSetWireFormat()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    .line 31
    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isOptional()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getExtensionScope()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getMessageType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getMessageType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getFullName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getFullName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    const-string v0, "]"

    .line 70
    .line 71
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isGroupLike()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getMessageType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 105
    .line 106
    if-ne v0, v1, :cond_3

    .line 107
    .line 108
    const-string v0, " {"

    .line 109
    .line 110
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->indent()V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    const-string v0, ": "

    .line 121
    .line 122
    invoke-virtual {p3, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v1, :cond_4

    .line 133
    .line 134
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->outdent()V

    .line 135
    .line 136
    .line 137
    const-string p1, "}"

    .line 138
    .line 139
    invoke-virtual {p3, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method private static printUnknownField(IILjava/util/List;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/protobuf/TextFormat$TextGenerator;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p3, v1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ": "

    .line 23
    .line 24
    invoke-virtual {p3, v1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, p3, p4}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFieldValue(ILjava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method private static printUnknownFieldValue(ILjava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/WireFormat;->getTagWireType(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "[REDACTED]"

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    if-eqz p3, :cond_0

    .line 23
    .line 24
    const-string p0, "UNKNOWN_FIXED32 %s"

    .line 25
    .line 26
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 36
    .line 37
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "0x%08x"

    .line 42
    .line 43
    invoke-static {v3, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_0
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string p3, "Bad tag: "

    .line 59
    .line 60
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_2
    check-cast p1, Lcom/google/protobuf/UnknownFieldSet;

    .line 75
    .line 76
    invoke-static {p1, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    :try_start_0
    move-object p0, p1

    .line 81
    check-cast p0, Lcom/google/protobuf/ByteString;

    .line 82
    .line 83
    invoke-static {p0}, Lcom/google/protobuf/UnknownFieldSet;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/UnknownFieldSet;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-string v0, "{"

    .line 88
    .line 89
    invoke-virtual {p2, v0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->indent()V

    .line 96
    .line 97
    .line 98
    invoke-static {p0, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Lcom/google/protobuf/TextFormat$TextGenerator;->outdent()V

    .line 102
    .line 103
    .line 104
    const-string p0, "}"

    .line 105
    .line 106
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :catch_0
    if-eqz p3, :cond_4

    .line 111
    .line 112
    const-string p0, "UNKNOWN_STRING %s"

    .line 113
    .line 114
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    const-string p0, "\""

    .line 127
    .line 128
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 132
    .line 133
    invoke-static {p1}, Lcom/google/protobuf/TextFormat;->escapeBytes(Lcom/google/protobuf/ByteString;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p2, p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    :goto_1
    return-void

    .line 144
    :cond_5
    if-eqz p3, :cond_6

    .line 145
    .line 146
    const-string p0, "UNKNOWN_FIXED64 %s"

    .line 147
    .line 148
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    goto :goto_2

    .line 157
    :cond_6
    check-cast p1, Ljava/lang/Long;

    .line 158
    .line 159
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    const-string p1, "0x%016x"

    .line 164
    .line 165
    invoke-static {v3, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    :goto_2
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_7
    if-eqz p3, :cond_8

    .line 174
    .line 175
    const-string p0, "UNKNOWN_VARINT %s"

    .line 176
    .line 177
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    goto :goto_3

    .line 186
    :cond_8
    check-cast p1, Ljava/lang/Long;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide p0

    .line 192
    invoke-static {p0, p1}, Lcom/google/protobuf/TextFormat;->unsignedToString(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    :goto_3
    invoke-virtual {p2, p0}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method private static printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/UnknownFieldSet;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/UnknownFieldSet;->asMap()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lcom/google/protobuf/UnknownFieldSet$Field;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Field;->getVarintList()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v1, v3, v4, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownField(IILjava/util/List;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 55
    .line 56
    .line 57
    const/4 v3, 0x5

    .line 58
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Field;->getFixed32List()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v1, v3, v4, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownField(IILjava/util/List;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Field;->getFixed64List()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v1, v3, v4, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownField(IILjava/util/List;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 71
    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Field;->getLengthDelimitedList()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v1, v3, v4, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownField(IILjava/util/List;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/protobuf/UnknownFieldSet$Field;->getGroupList()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_1

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lcom/google/protobuf/UnknownFieldSet;

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {p1, v3}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    const-string v3, " {"

    .line 115
    .line 116
    invoke-virtual {p1, v3}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->indent()V

    .line 123
    .line 124
    .line 125
    invoke-static {v2, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->outdent()V

    .line 129
    .line 130
    .line 131
    const-string v2, "}"

    .line 132
    .line 133
    invoke-virtual {p1, v2}, Lcom/google/protobuf/TextFormat$TextGenerator;->print(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/google/protobuf/TextFormat$TextGenerator;->eol()V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    :goto_1
    return-void
.end method

.method private shouldRedact(Lcom/google/protobuf/Descriptors$FieldDescriptor;Lcom/google/protobuf/TextFormat$TextGenerator;)Z
    .locals 0

    .line 1
    iget-boolean p2, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isSensitive()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method


# virtual methods
.method public emittingSingleLine(Z)Lcom/google/protobuf/TextFormat$Printer;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 10
    .line 11
    iget-boolean v5, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 12
    .line 13
    move v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public enablingSafeDebugFormat(Z)Lcom/google/protobuf/TextFormat$Printer;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 10
    .line 11
    iget-boolean v6, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 12
    .line 13
    move v5, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public escapingNonAscii(Z)Lcom/google/protobuf/TextFormat$Printer;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    iget-boolean v2, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    .line 4
    .line 5
    iget-object v3, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 6
    .line 7
    iget-object v4, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 8
    .line 9
    iget-boolean v5, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 10
    .line 11
    iget-boolean v6, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 12
    .line 13
    move v1, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public print(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;->PRINT:Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/TextFormat$Printer;->print(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)V

    return-void
.end method

.method public print(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 3
    invoke-interface {p1}, Lcom/google/protobuf/MessageOrBuilder;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v1

    invoke-static {p2, v0, v1, p3}, Lcom/google/protobuf/TextFormat;->access$300(Ljava/lang/Appendable;ZLcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object p2

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->print(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void
.end method

.method public print(Lcom/google/protobuf/UnknownFieldSet;Ljava/lang/Appendable;)V
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 6
    invoke-static {p2, v0}, Lcom/google/protobuf/TextFormat;->access$400(Ljava/lang/Appendable;Z)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object p2

    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 7
    invoke-static {p1, p2, v0}, Lcom/google/protobuf/TextFormat$Printer;->printUnknownFields(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/TextFormat$TextGenerator;Z)V

    return-void
.end method

.method public printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    invoke-static {p3, v0}, Lcom/google/protobuf/TextFormat;->access$400(Ljava/lang/Appendable;Z)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void
.end method

.method public printFieldToString(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$Printer;->applyUnstablePrefix(Ljava/lang/Appendable;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    invoke-virtual {p0, p1, p2, v0}, Lcom/google/protobuf/TextFormat$Printer;->printField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object p1

    .line 24
    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2
.end method

.method public printFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    invoke-static {p3, v0}, Lcom/google/protobuf/TextFormat;->access$400(Ljava/lang/Appendable;Z)Lcom/google/protobuf/TextFormat$TextGenerator;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/TextFormat$Printer;->printFieldValue(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;Lcom/google/protobuf/TextFormat$TextGenerator;)V

    return-void
.end method

.method public printToString(Lcom/google/protobuf/MessageOrBuilder;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;->PRINTER_PRINT_TO_STRING:Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/TextFormat$Printer;->printToString(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public printToString(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)Ljava/lang/String;
    .locals 2

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3
    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    if-eqz v1, :cond_0

    .line 4
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$Printer;->applyUnstablePrefix(Ljava/lang/Appendable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    invoke-virtual {p0, p1, v0, p2}, Lcom/google/protobuf/TextFormat$Printer;->print(Lcom/google/protobuf/MessageOrBuilder;Ljava/lang/Appendable;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)V

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 7
    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public printToString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;
    .locals 2

    .line 8
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    if-eqz v1, :cond_0

    .line 10
    invoke-direct {p0, v0}, Lcom/google/protobuf/TextFormat$Printer;->applyUnstablePrefix(Ljava/lang/Appendable;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/TextFormat$Printer;->print(Lcom/google/protobuf/UnknownFieldSet;Ljava/lang/Appendable;)V

    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 13
    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public setSensitiveFieldReportingLevel(Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/TextFormat$Printer;->sensitiveFieldReportingLevel:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public shortDebugString(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/protobuf/InlineMe;
        replacement = "this.emittingSingleLine(true).printFieldToString(field, value)"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/protobuf/TextFormat$Printer;->emittingSingleLine(Z)Lcom/google/protobuf/TextFormat$Printer;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/TextFormat$Printer;->printFieldToString(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public shortDebugString(Lcom/google/protobuf/MessageOrBuilder;)Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lcom/google/protobuf/TextFormat$Printer;->emittingSingleLine(Z)Lcom/google/protobuf/TextFormat$Printer;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;->SHORT_DEBUG_STRING:Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;

    .line 2
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/TextFormat$Printer;->printToString(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/TextFormat$Printer$FieldReporterLevel;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public shortDebugString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/protobuf/InlineMe;
        replacement = "this.emittingSingleLine(true).printToString(fields)"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/protobuf/TextFormat$Printer;->emittingSingleLine(Z)Lcom/google/protobuf/TextFormat$Printer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/TextFormat$Printer;->printToString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public usingExtensionRegistry(Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/TextFormat$Printer;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/ExtensionRegistryLite;->getEmptyRegistry()Lcom/google/protobuf/ExtensionRegistryLite;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lcom/google/protobuf/TextFormat$Printer;

    .line 10
    .line 11
    iget-boolean v3, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    .line 12
    .line 13
    iget-boolean v4, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    .line 14
    .line 15
    iget-object v5, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 16
    .line 17
    iget-boolean v7, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 18
    .line 19
    iget-boolean v8, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 20
    .line 21
    move-object v6, p1

    .line 22
    invoke-direct/range {v2 .. v8}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, "Only one extensionRegistry is allowed."

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public usingShortRepeatedPrimitives(Z)Lcom/google/protobuf/TextFormat$Printer;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/protobuf/TextFormat$Printer;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    .line 4
    .line 5
    iget-object v3, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 6
    .line 7
    iget-object v4, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 8
    .line 9
    iget-boolean v5, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 10
    .line 11
    iget-boolean v6, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 12
    .line 13
    move v2, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public usingTypeRegistry(Lcom/google/protobuf/TypeRegistry;)Lcom/google/protobuf/TextFormat$Printer;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/TextFormat$Printer;->typeRegistry:Lcom/google/protobuf/TypeRegistry;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/TypeRegistry;->getEmptyTypeRegistry()Lcom/google/protobuf/TypeRegistry;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lcom/google/protobuf/TextFormat$Printer;

    .line 10
    .line 11
    iget-boolean v3, p0, Lcom/google/protobuf/TextFormat$Printer;->escapeNonAscii:Z

    .line 12
    .line 13
    iget-boolean v4, p0, Lcom/google/protobuf/TextFormat$Printer;->useShortRepeatedPrimitives:Z

    .line 14
    .line 15
    iget-object v6, p0, Lcom/google/protobuf/TextFormat$Printer;->extensionRegistry:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 16
    .line 17
    iget-boolean v7, p0, Lcom/google/protobuf/TextFormat$Printer;->enablingSafeDebugFormat:Z

    .line 18
    .line 19
    iget-boolean v8, p0, Lcom/google/protobuf/TextFormat$Printer;->singleLine:Z

    .line 20
    .line 21
    move-object v5, p1

    .line 22
    invoke-direct/range {v2 .. v8}, Lcom/google/protobuf/TextFormat$Printer;-><init>(ZZLcom/google/protobuf/TypeRegistry;Lcom/google/protobuf/ExtensionRegistryLite;ZZ)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v0, "Only one typeRegistry is allowed."

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
