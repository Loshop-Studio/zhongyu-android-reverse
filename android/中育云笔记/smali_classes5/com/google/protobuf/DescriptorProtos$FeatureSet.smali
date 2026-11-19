.class public final Lcom/google/protobuf/DescriptorProtos$FeatureSet;
.super Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/DescriptorProtos$FeatureSetOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FeatureSet"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature;,
        Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeatureOrBuilder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$ExtendableMessage<",
        "Lcom/google/protobuf/DescriptorProtos$FeatureSet;",
        ">;",
        "Lcom/google/protobuf/DescriptorProtos$FeatureSetOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

.field public static final DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER:I = 0x8

.field public static final ENFORCE_NAMING_STYLE_FIELD_NUMBER:I = 0x7

.field public static final ENUM_TYPE_FIELD_NUMBER:I = 0x2

.field public static final FIELD_PRESENCE_FIELD_NUMBER:I = 0x1

.field public static final JSON_FORMAT_FIELD_NUMBER:I = 0x6

.field public static final MESSAGE_ENCODING_FIELD_NUMBER:I = 0x5

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSet;",
            ">;"
        }
    .end annotation
.end field

.field public static final REPEATED_FIELD_ENCODING_FIELD_NUMBER:I = 0x3

.field public static final UTF8_VALIDATION_FIELD_NUMBER:I = 0x4

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private defaultSymbolVisibility_:I

.field private enforceNamingStyle_:I

.field private enumType_:I

.field private fieldPresence_:I

.field private jsonFormat_:I

.field private memoizedIsInitialized:B

.field private messageEncoding_:I

.field private repeatedFieldEncoding_:I

.field private utf8Validation_:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    const/4 v1, 0x4

    .line 10
    const/16 v2, 0x1f

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const-string v4, ""

    .line 14
    .line 15
    invoke-static/range {v0 .. v5}, Lcom/google/protobuf/RuntimeVersion;->validateProtobufGencodeVersion(Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;IIILjava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 24
    .line 25
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$1;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$1;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;-><init>()V

    const/4 v0, -0x1

    .line 13
    iput-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->memoizedIsInitialized:B

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 15
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 16
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 17
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 18
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 19
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 20
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 21
    iput v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSet;",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 4
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 5
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 6
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 7
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 8
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 9
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    const/4 p1, -0x1

    .line 11
    iput-byte p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;Lcom/google/protobuf/DescriptorProtos$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;-><init>(Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;)V

    return-void
.end method

.method public static synthetic access$31502(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$31602(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$31702(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$31802(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$31902(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$32002(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$32102(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$32202(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$32376(Lcom/google/protobuf/DescriptorProtos$FeatureSet;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos;->access$30500()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 4
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 11
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 13
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 7
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 2
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 5
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 6
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSet;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasFieldPresence()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasFieldPresence()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasFieldPresence()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 35
    .line 36
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 37
    .line 38
    if-eq v1, v2, :cond_3

    .line 39
    .line 40
    return v3

    .line 41
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnumType()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnumType()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eq v1, v2, :cond_4

    .line 50
    .line 51
    return v3

    .line 52
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnumType()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 59
    .line 60
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 61
    .line 62
    if-eq v1, v2, :cond_5

    .line 63
    .line 64
    return v3

    .line 65
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasRepeatedFieldEncoding()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasRepeatedFieldEncoding()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eq v1, v2, :cond_6

    .line 74
    .line 75
    return v3

    .line 76
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasRepeatedFieldEncoding()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 83
    .line 84
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 85
    .line 86
    if-eq v1, v2, :cond_7

    .line 87
    .line 88
    return v3

    .line 89
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasUtf8Validation()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasUtf8Validation()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eq v1, v2, :cond_8

    .line 98
    .line 99
    return v3

    .line 100
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasUtf8Validation()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_9

    .line 105
    .line 106
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 107
    .line 108
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 109
    .line 110
    if-eq v1, v2, :cond_9

    .line 111
    .line 112
    return v3

    .line 113
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasMessageEncoding()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasMessageEncoding()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eq v1, v2, :cond_a

    .line 122
    .line 123
    return v3

    .line 124
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasMessageEncoding()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_b

    .line 129
    .line 130
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 131
    .line 132
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 133
    .line 134
    if-eq v1, v2, :cond_b

    .line 135
    .line 136
    return v3

    .line 137
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasJsonFormat()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasJsonFormat()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eq v1, v2, :cond_c

    .line 146
    .line 147
    return v3

    .line 148
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasJsonFormat()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_d

    .line 153
    .line 154
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 155
    .line 156
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 157
    .line 158
    if-eq v1, v2, :cond_d

    .line 159
    .line 160
    return v3

    .line 161
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnforceNamingStyle()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnforceNamingStyle()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eq v1, v2, :cond_e

    .line 170
    .line 171
    return v3

    .line 172
    :cond_e
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnforceNamingStyle()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_f

    .line 177
    .line 178
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 179
    .line 180
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 181
    .line 182
    if-eq v1, v2, :cond_f

    .line 183
    .line 184
    return v3

    .line 185
    :cond_f
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasDefaultSymbolVisibility()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasDefaultSymbolVisibility()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eq v1, v2, :cond_10

    .line 194
    .line 195
    return v3

    .line 196
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasDefaultSymbolVisibility()Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    if-eqz v1, :cond_11

    .line 201
    .line 202
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 203
    .line 204
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 205
    .line 206
    if-eq v1, v2, :cond_11

    .line 207
    .line 208
    return v3

    .line 209
    :cond_11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v1, v2}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_12

    .line 222
    .line 223
    return v3

    .line 224
    :cond_12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    if-nez p1, :cond_13

    .line 237
    .line 238
    return v3

    .line 239
    :cond_13
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FeatureSet;
    .locals 1

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultSymbolVisibility()Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;->DEFAULT_SYMBOL_VISIBILITY_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getEnforceNamingStyle()Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;->ENFORCE_NAMING_STYLE_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getEnumType()Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;->ENUM_TYPE_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getFieldPresence()Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;->FIELD_PRESENCE_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getJsonFormat()Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;->JSON_FORMAT_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getMessageEncoding()Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;->MESSAGE_ENCODING_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/google/protobuf/DescriptorProtos$FeatureSet;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRepeatedFieldEncoding()Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;->REPEATED_FIELD_ENCODING_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    and-int/2addr v1, v2

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    and-int/2addr v1, v2

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget v3, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 42
    .line 43
    invoke-static {v1, v3}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    and-int/2addr v1, v3

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 56
    .line 57
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    add-int/2addr v0, v1

    .line 62
    :cond_4
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 63
    .line 64
    and-int/lit8 v1, v1, 0x10

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    const/4 v1, 0x5

    .line 69
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 70
    .line 71
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    add-int/2addr v0, v1

    .line 76
    :cond_5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 77
    .line 78
    and-int/lit8 v1, v1, 0x20

    .line 79
    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    const/4 v1, 0x6

    .line 83
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 84
    .line 85
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    add-int/2addr v0, v1

    .line 90
    :cond_6
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 91
    .line 92
    and-int/lit8 v1, v1, 0x40

    .line 93
    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    const/4 v1, 0x7

    .line 97
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 98
    .line 99
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/2addr v0, v1

    .line 104
    :cond_7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 105
    .line 106
    and-int/lit16 v1, v1, 0x80

    .line 107
    .line 108
    if-eqz v1, :cond_8

    .line 109
    .line 110
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 111
    .line 112
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    add-int/2addr v0, v1

    .line 117
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensionsSerializedSize()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    add-int/2addr v0, v1

    .line 122
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    add-int/2addr v0, v1

    .line 131
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 132
    .line 133
    return v0
.end method

.method public getUtf8Validation()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;->UTF8_VALIDATION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public hasDefaultSymbolVisibility()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x80

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasEnforceNamingStyle()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasEnumType()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasFieldPresence()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public hasJsonFormat()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasMessageEncoding()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasRepeatedFieldEncoding()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hasUtf8Validation()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x30b

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasFieldPresence()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x25

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    mul-int/lit8 v1, v1, 0x35

    .line 28
    .line 29
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 30
    .line 31
    add-int/2addr v1, v0

    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnumType()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    mul-int/lit8 v1, v1, 0x25

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x2

    .line 41
    .line 42
    mul-int/lit8 v1, v1, 0x35

    .line 43
    .line 44
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 45
    .line 46
    add-int/2addr v1, v0

    .line 47
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasRepeatedFieldEncoding()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    mul-int/lit8 v1, v1, 0x25

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x3

    .line 56
    .line 57
    mul-int/lit8 v1, v1, 0x35

    .line 58
    .line 59
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasUtf8Validation()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    mul-int/lit8 v1, v1, 0x25

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x4

    .line 71
    .line 72
    mul-int/lit8 v1, v1, 0x35

    .line 73
    .line 74
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 75
    .line 76
    add-int/2addr v1, v0

    .line 77
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasMessageEncoding()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    mul-int/lit8 v1, v1, 0x25

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x5

    .line 86
    .line 87
    mul-int/lit8 v1, v1, 0x35

    .line 88
    .line 89
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 90
    .line 91
    add-int/2addr v1, v0

    .line 92
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasJsonFormat()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    mul-int/lit8 v1, v1, 0x25

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x6

    .line 101
    .line 102
    mul-int/lit8 v1, v1, 0x35

    .line 103
    .line 104
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 105
    .line 106
    add-int/2addr v1, v0

    .line 107
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasEnforceNamingStyle()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    mul-int/lit8 v1, v1, 0x25

    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x7

    .line 116
    .line 117
    mul-int/lit8 v1, v1, 0x35

    .line 118
    .line 119
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 120
    .line 121
    add-int/2addr v1, v0

    .line 122
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->hasDefaultSymbolVisibility()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    mul-int/lit8 v1, v1, 0x25

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x8

    .line 131
    .line 132
    mul-int/lit8 v1, v1, 0x35

    .line 133
    .line 134
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 135
    .line 136
    add-int/2addr v1, v0

    .line 137
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->getExtensionFields()Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v1, v0}, Lcom/google/protobuf/AbstractMessage;->hashFields(ILjava/util/Map;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    mul-int/lit8 v0, v0, 0x1d

    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    add-int/2addr v0, v1

    .line 156
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 157
    .line 158
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos;->access$30600()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    .line 6
    .line 7
    const-class v2, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->memoizedIsInitialized:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->extensionsAreInitialized()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->memoizedIsInitialized:B

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->memoizedIsInitialized:B

    .line 21
    .line 22
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->newBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;-><init>(Lcom/google/protobuf/AbstractMessage$BuilderParent;Lcom/google/protobuf/DescriptorProtos$1;)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FeatureSet;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;-><init>(Lcom/google/protobuf/DescriptorProtos$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;-><init>(Lcom/google/protobuf/DescriptorProtos$1;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage;->newExtensionSerializer()Lcom/google/protobuf/GeneratedMessage$ExtendableMessage$ExtensionSerializer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    and-int/2addr v1, v2

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->fieldPresence_:I

    .line 12
    .line 13
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    and-int/2addr v1, v2

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enumType_:I

    .line 23
    .line 24
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    and-int/2addr v1, v2

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    iget v3, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->repeatedFieldEncoding_:I

    .line 35
    .line 36
    invoke-virtual {p1, v1, v3}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 40
    .line 41
    const/16 v3, 0x8

    .line 42
    .line 43
    and-int/2addr v1, v3

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->utf8Validation_:I

    .line 47
    .line 48
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 49
    .line 50
    .line 51
    :cond_3
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x10

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    const/4 v1, 0x5

    .line 58
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->messageEncoding_:I

    .line 59
    .line 60
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 64
    .line 65
    and-int/lit8 v1, v1, 0x20

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    const/4 v1, 0x6

    .line 70
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->jsonFormat_:I

    .line 71
    .line 72
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 73
    .line 74
    .line 75
    :cond_5
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 76
    .line 77
    and-int/lit8 v1, v1, 0x40

    .line 78
    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    const/4 v1, 0x7

    .line 82
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->enforceNamingStyle_:I

    .line 83
    .line 84
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 85
    .line 86
    .line 87
    :cond_6
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->bitField0_:I

    .line 88
    .line 89
    and-int/lit16 v1, v1, 0x80

    .line 90
    .line 91
    if-eqz v1, :cond_7

    .line 92
    .line 93
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FeatureSet;->defaultSymbolVisibility_:I

    .line 94
    .line 95
    invoke-virtual {p1, v3, v1}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 96
    .line 97
    .line 98
    :cond_7
    const/16 v1, 0x2711

    .line 99
    .line 100
    invoke-interface {v0, v1, p1}, Lcom/google/protobuf/GeneratedMessage$ExtendableMessage$ExtensionSerializer;->writeUntil(ILcom/google/protobuf/CodedOutputStream;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method
