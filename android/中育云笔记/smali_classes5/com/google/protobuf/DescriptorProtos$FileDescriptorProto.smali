.class public final Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
.super Lcom/google/protobuf/GeneratedMessage;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/DescriptorProtos$FileDescriptorProtoOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DescriptorProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FileDescriptorProto"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

.field public static final DEPENDENCY_FIELD_NUMBER:I = 0x3

.field public static final EDITION_FIELD_NUMBER:I = 0xe

.field public static final ENUM_TYPE_FIELD_NUMBER:I = 0x5

.field public static final EXTENSION_FIELD_NUMBER:I = 0x7

.field public static final MESSAGE_TYPE_FIELD_NUMBER:I = 0x4

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field public static final OPTIONS_FIELD_NUMBER:I = 0x8

.field public static final OPTION_DEPENDENCY_FIELD_NUMBER:I = 0xf

.field public static final PACKAGE_FIELD_NUMBER:I = 0x2

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;",
            ">;"
        }
    .end annotation
.end field

.field public static final PUBLIC_DEPENDENCY_FIELD_NUMBER:I = 0xa

.field public static final SERVICE_FIELD_NUMBER:I = 0x6

.field public static final SOURCE_CODE_INFO_FIELD_NUMBER:I = 0x9

.field public static final SYNTAX_FIELD_NUMBER:I = 0xc

.field public static final WEAK_DEPENDENCY_FIELD_NUMBER:I = 0xb

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private dependency_:Lcom/google/protobuf/LazyStringArrayList;

.field private edition_:I

.field private enumType_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;",
            ">;"
        }
    .end annotation
.end field

.field private extension_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;",
            ">;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private messageType_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$DescriptorProto;",
            ">;"
        }
    .end annotation
.end field

.field private volatile name_:Ljava/lang/Object;

.field private optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

.field private options_:Lcom/google/protobuf/DescriptorProtos$FileOptions;

.field private volatile package_:Ljava/lang/Object;

.field private publicDependency_:Lcom/google/protobuf/Internal$IntList;

.field private service_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;",
            ">;"
        }
    .end annotation
.end field

.field private sourceCodeInfo_:Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

.field private volatile syntax_:Ljava/lang/Object;

.field private weakDependency_:Lcom/google/protobuf/Internal$IntList;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;->PUBLIC:Lcom/google/protobuf/RuntimeVersion$RuntimeDomain;

    .line 2
    .line 3
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

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
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 19
    .line 20
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 24
    .line 25
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$1;

    .line 26
    .line 27
    invoke-direct {v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$1;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 12
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage;-><init>()V

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 14
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 15
    invoke-static {}, Lcom/google/protobuf/LazyStringArrayList;->emptyList()Lcom/google/protobuf/LazyStringArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 16
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/Internal$IntList;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 17
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/Internal$IntList;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 18
    invoke-static {}, Lcom/google/protobuf/LazyStringArrayList;->emptyList()Lcom/google/protobuf/LazyStringArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 19
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 20
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    const/4 v2, -0x1

    .line 21
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 22
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 23
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 24
    invoke-static {}, Lcom/google/protobuf/LazyStringArrayList;->emptyList()Lcom/google/protobuf/LazyStringArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 25
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/Internal$IntList;

    move-result-object v2

    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 26
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/Internal$IntList;

    move-result-object v2

    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 27
    invoke-static {}, Lcom/google/protobuf/LazyStringArrayList;->emptyList()Lcom/google/protobuf/LazyStringArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 28
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 29
    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 30
    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 31
    iput-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 32
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 33
    iput v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessage$Builder<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 4
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 5
    invoke-static {}, Lcom/google/protobuf/LazyStringArrayList;->emptyList()Lcom/google/protobuf/LazyStringArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 6
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/Internal$IntList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 7
    invoke-static {}, Lcom/google/protobuf/GeneratedMessage;->emptyIntList()Lcom/google/protobuf/Internal$IntList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 8
    invoke-static {}, Lcom/google/protobuf/LazyStringArrayList;->emptyList()Lcom/google/protobuf/LazyStringArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 9
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    const/4 p1, -0x1

    .line 11
    iput-byte p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/google/protobuf/DescriptorProtos$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;)V

    return-void
.end method

.method public static synthetic access$1100(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1102(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1200(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1202(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1300(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1302(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1400(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1402(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1500(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1502(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1600(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1602(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1700(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/LazyStringArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1702(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Lcom/google/protobuf/LazyStringArrayList;)Lcom/google/protobuf/LazyStringArrayList;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1800(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/Internal$IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1802(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Lcom/google/protobuf/Internal$IntList;)Lcom/google/protobuf/Internal$IntList;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1900(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/Internal$IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1902(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Lcom/google/protobuf/Internal$IntList;)Lcom/google/protobuf/Internal$IntList;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2000(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/LazyStringArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2002(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Lcom/google/protobuf/LazyStringArrayList;)Lcom/google/protobuf/LazyStringArrayList;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2102(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Lcom/google/protobuf/DescriptorProtos$FileOptions;)Lcom/google/protobuf/DescriptorProtos$FileOptions;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->options_:Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2202(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;)Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->sourceCodeInfo_:Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2300(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2302(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$2402(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$2576(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 5
    .line 6
    return p1
.end method

.method public static getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos;->access$600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static newBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 4
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 11
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 13
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 7
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessage;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 2
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 5
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 6
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

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
    instance-of v1, p1, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

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
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasName()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasName()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasName()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    return v3

    .line 49
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasPackage()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasPackage()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eq v1, v2, :cond_4

    .line 58
    .line 59
    return v3

    .line 60
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasPackage()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPackage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPackage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_5

    .line 79
    .line 80
    return v3

    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    return v3

    .line 96
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependencyList()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependencyList()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_7

    .line 109
    .line 110
    return v3

    .line 111
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getWeakDependencyList()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getWeakDependencyList()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_8

    .line 124
    .line 125
    return v3

    .line 126
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptionDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptionDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_9

    .line 139
    .line 140
    return v3

    .line 141
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeList()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeList()Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_a

    .line 154
    .line 155
    return v3

    .line 156
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeList()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeList()Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-nez v1, :cond_b

    .line 169
    .line 170
    return v3

    .line 171
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceList()Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceList()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_c

    .line 184
    .line 185
    return v3

    .line 186
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionList()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionList()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-nez v1, :cond_d

    .line 199
    .line 200
    return v3

    .line 201
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasOptions()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasOptions()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eq v1, v2, :cond_e

    .line 210
    .line 211
    return v3

    .line 212
    :cond_e
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasOptions()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_f

    .line 217
    .line 218
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v1, v2}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-nez v1, :cond_f

    .line 231
    .line 232
    return v3

    .line 233
    :cond_f
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSourceCodeInfo()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSourceCodeInfo()Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eq v1, v2, :cond_10

    .line 242
    .line 243
    return v3

    .line 244
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSourceCodeInfo()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_11

    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v1, v2}, Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_11

    .line 263
    .line 264
    return v3

    .line 265
    :cond_11
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSyntax()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSyntax()Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-eq v1, v2, :cond_12

    .line 274
    .line 275
    return v3

    .line 276
    :cond_12
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSyntax()Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_13

    .line 281
    .line 282
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSyntax()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSyntax()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-nez v1, :cond_13

    .line 295
    .line 296
    return v3

    .line 297
    :cond_13
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasEdition()Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-virtual {p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasEdition()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eq v1, v2, :cond_14

    .line 306
    .line 307
    return v3

    .line 308
    :cond_14
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasEdition()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_15

    .line 313
    .line 314
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 315
    .line 316
    iget v2, p1, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 317
    .line 318
    if-eq v1, v2, :cond_15

    .line 319
    .line 320
    return v3

    .line 321
    :cond_15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    if-nez p1, :cond_16

    .line 334
    .line 335
    return v3

    .line 336
    :cond_16
    return v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;
    .locals 1

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDefaultInstanceForType()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    move-result-object v0

    return-object v0
.end method

.method public getDependency(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/protobuf/LazyStringArrayList;->get(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getDependencyBytes(I)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/protobuf/LazyStringArrayList;->getByteString(I)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getDependencyCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/LazyStringArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getDependencyList()Lcom/google/protobuf/ProtocolStringList;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    return-object v0
.end method

.method public bridge synthetic getDependencyList()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v0

    return-object v0
.end method

.method public getEdition()Lcom/google/protobuf/DescriptorProtos$Edition;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/DescriptorProtos$Edition;->forNumber(I)Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$Edition;->EDITION_UNKNOWN:Lcom/google/protobuf/DescriptorProtos$Edition;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getEnumType(I)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;

    .line 8
    .line 9
    return-object p1
.end method

.method public getEnumTypeCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getEnumTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEnumTypeOrBuilder(I)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProtoOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProtoOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getEnumTypeOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProtoOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExtension(I)Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 8
    .line 9
    return-object p1
.end method

.method public getExtensionCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getExtensionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getExtensionOrBuilder(I)Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProtoOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProtoOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getExtensionOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProtoOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessageType(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$DescriptorProto;

    .line 8
    .line 9
    return-object p1
.end method

.method public getMessageTypeCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getMessageTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$DescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessageTypeOrBuilder(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProtoOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$DescriptorProtoOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getMessageTypeOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$DescriptorProtoOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getOptionDependency(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/protobuf/LazyStringArrayList;->get(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getOptionDependencyBytes(I)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/protobuf/LazyStringArrayList;->getByteString(I)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getOptionDependencyCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/LazyStringArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getOptionDependencyList()Lcom/google/protobuf/ProtocolStringList;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    return-object v0
.end method

.method public bridge synthetic getOptionDependencyList()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptionDependencyList()Lcom/google/protobuf/ProtocolStringList;

    move-result-object v0

    return-object v0
.end method

.method public getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->options_:Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getOptionsOrBuilder()Lcom/google/protobuf/DescriptorProtos$FileOptionsOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->options_:Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getPackage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getPackageBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPublicDependency(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$IntList;->getInt(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getPublicDependencyCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getPublicDependencyList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

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
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v3, v1}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    move v1, v2

    .line 36
    move v3, v1

    .line 37
    :goto_1
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 38
    .line 39
    invoke-virtual {v4}, Lcom/google/protobuf/LazyStringArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ge v1, v4, :cond_3

    .line 44
    .line 45
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Lcom/google/protobuf/LazyStringArrayList;->getRaw(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-static {v4}, Lcom/google/protobuf/GeneratedMessage;->computeStringSizeNoTag(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    add-int/2addr v3, v4

    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    add-int/2addr v0, v3

    .line 60
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    add-int/2addr v0, v1

    .line 69
    move v1, v2

    .line 70
    :goto_2
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/4 v4, 0x4

    .line 77
    if-ge v1, v3, :cond_4

    .line 78
    .line 79
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 86
    .line 87
    invoke-static {v4, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    add-int/2addr v0, v3

    .line 92
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move v1, v2

    .line 96
    :goto_3
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-ge v1, v3, :cond_5

    .line 103
    .line 104
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 111
    .line 112
    const/4 v5, 0x5

    .line 113
    invoke-static {v5, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    add-int/2addr v0, v3

    .line 118
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move v1, v2

    .line 122
    :goto_4
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-ge v1, v3, :cond_6

    .line 129
    .line 130
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 137
    .line 138
    const/4 v5, 0x6

    .line 139
    invoke-static {v5, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    add-int/2addr v0, v3

    .line 144
    add-int/lit8 v1, v1, 0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    move v1, v2

    .line 148
    :goto_5
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-ge v1, v3, :cond_7

    .line 155
    .line 156
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 157
    .line 158
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 163
    .line 164
    const/4 v5, 0x7

    .line 165
    invoke-static {v5, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    add-int/2addr v0, v3

    .line 170
    add-int/lit8 v1, v1, 0x1

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 174
    .line 175
    and-int/2addr v1, v4

    .line 176
    const/16 v3, 0x8

    .line 177
    .line 178
    if-eqz v1, :cond_8

    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    add-int/2addr v0, v1

    .line 189
    :cond_8
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 190
    .line 191
    and-int/2addr v1, v3

    .line 192
    if-eqz v1, :cond_9

    .line 193
    .line 194
    const/16 v1, 0x9

    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-static {v1, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    add-int/2addr v0, v1

    .line 205
    :cond_9
    move v1, v2

    .line 206
    move v3, v1

    .line 207
    :goto_6
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 208
    .line 209
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    if-ge v1, v4, :cond_a

    .line 214
    .line 215
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 216
    .line 217
    invoke-interface {v4, v1}, Lcom/google/protobuf/Internal$IntList;->getInt(I)I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    invoke-static {v4}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    add-int/2addr v3, v4

    .line 226
    add-int/lit8 v1, v1, 0x1

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_a
    add-int/2addr v0, v3

    .line 230
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependencyList()Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    add-int/2addr v0, v1

    .line 239
    move v1, v2

    .line 240
    move v3, v1

    .line 241
    :goto_7
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 242
    .line 243
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-ge v1, v4, :cond_b

    .line 248
    .line 249
    iget-object v4, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 250
    .line 251
    invoke-interface {v4, v1}, Lcom/google/protobuf/Internal$IntList;->getInt(I)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    invoke-static {v4}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    add-int/2addr v3, v4

    .line 260
    add-int/lit8 v1, v1, 0x1

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_b
    add-int/2addr v0, v3

    .line 264
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getWeakDependencyList()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    add-int/2addr v0, v1

    .line 273
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 274
    .line 275
    and-int/lit8 v1, v1, 0x10

    .line 276
    .line 277
    if-eqz v1, :cond_c

    .line 278
    .line 279
    const/16 v1, 0xc

    .line 280
    .line 281
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 282
    .line 283
    invoke-static {v1, v3}, Lcom/google/protobuf/GeneratedMessage;->computeStringSize(ILjava/lang/Object;)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    add-int/2addr v0, v1

    .line 288
    :cond_c
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 289
    .line 290
    and-int/lit8 v1, v1, 0x20

    .line 291
    .line 292
    if-eqz v1, :cond_d

    .line 293
    .line 294
    const/16 v1, 0xe

    .line 295
    .line 296
    iget v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 297
    .line 298
    invoke-static {v1, v3}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    add-int/2addr v0, v1

    .line 303
    :cond_d
    move v1, v2

    .line 304
    :goto_8
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 305
    .line 306
    invoke-virtual {v3}, Lcom/google/protobuf/LazyStringArrayList;->size()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-ge v2, v3, :cond_e

    .line 311
    .line 312
    iget-object v3, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 313
    .line 314
    invoke-virtual {v3, v2}, Lcom/google/protobuf/LazyStringArrayList;->getRaw(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-static {v3}, Lcom/google/protobuf/GeneratedMessage;->computeStringSizeNoTag(Ljava/lang/Object;)I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    add-int/2addr v1, v3

    .line 323
    add-int/lit8 v2, v2, 0x1

    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_e
    add-int/2addr v0, v1

    .line 327
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptionDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    add-int/2addr v0, v1

    .line 336
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    add-int/2addr v0, v1

    .line 345
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 346
    .line 347
    return v0
.end method

.method public getService(I)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 8
    .line 9
    return-object p1
.end method

.method public getServiceCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getServiceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getServiceOrBuilder(I)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProtoOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProtoOrBuilder;

    .line 8
    .line 9
    return-object p1
.end method

.method public getServiceOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProtoOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->sourceCodeInfo_:Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getSourceCodeInfoOrBuilder()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfoOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->sourceCodeInfo_:Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;->getDefaultInstance()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getSyntax()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_1
    return-object v1
.end method

.method public getSyntaxBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getWeakDependency(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/google/protobuf/Internal$IntList;->getInt(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getWeakDependencyCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getWeakDependencyList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasEdition()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

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

.method public hasName()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

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

.method public hasOptions()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

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

.method public hasPackage()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

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

.method public hasSourceCodeInfo()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

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

.method public hasSyntax()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

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
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasName()Z

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
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v1, v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasPackage()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    mul-int/lit8 v1, v1, 0x25

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    mul-int/lit8 v1, v1, 0x35

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPackage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v1, v0

    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyCount()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    mul-int/lit8 v1, v1, 0x25

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x3

    .line 68
    .line 69
    mul-int/lit8 v1, v1, 0x35

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    add-int/2addr v1, v0

    .line 80
    :cond_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependencyCount()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-lez v0, :cond_4

    .line 85
    .line 86
    mul-int/lit8 v1, v1, 0x25

    .line 87
    .line 88
    add-int/lit8 v1, v1, 0xa

    .line 89
    .line 90
    mul-int/lit8 v1, v1, 0x35

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getPublicDependencyList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    add-int/2addr v1, v0

    .line 101
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getWeakDependencyCount()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-lez v0, :cond_5

    .line 106
    .line 107
    mul-int/lit8 v1, v1, 0x25

    .line 108
    .line 109
    add-int/lit8 v1, v1, 0xb

    .line 110
    .line 111
    mul-int/lit8 v1, v1, 0x35

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getWeakDependencyList()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    add-int/2addr v1, v0

    .line 122
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptionDependencyCount()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-lez v0, :cond_6

    .line 127
    .line 128
    mul-int/lit8 v1, v1, 0x25

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0xf

    .line 131
    .line 132
    mul-int/lit8 v1, v1, 0x35

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptionDependencyList()Lcom/google/protobuf/ProtocolStringList;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    add-int/2addr v1, v0

    .line 143
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeCount()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-lez v0, :cond_7

    .line 148
    .line 149
    mul-int/lit8 v1, v1, 0x25

    .line 150
    .line 151
    add-int/lit8 v1, v1, 0x4

    .line 152
    .line 153
    mul-int/lit8 v1, v1, 0x35

    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeList()Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    add-int/2addr v1, v0

    .line 164
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeCount()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-lez v0, :cond_8

    .line 169
    .line 170
    mul-int/lit8 v1, v1, 0x25

    .line 171
    .line 172
    add-int/lit8 v1, v1, 0x5

    .line 173
    .line 174
    mul-int/lit8 v1, v1, 0x35

    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeList()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    add-int/2addr v1, v0

    .line 185
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceCount()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-lez v0, :cond_9

    .line 190
    .line 191
    mul-int/lit8 v1, v1, 0x25

    .line 192
    .line 193
    add-int/lit8 v1, v1, 0x6

    .line 194
    .line 195
    mul-int/lit8 v1, v1, 0x35

    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceList()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    add-int/2addr v1, v0

    .line 206
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionCount()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-lez v0, :cond_a

    .line 211
    .line 212
    mul-int/lit8 v1, v1, 0x25

    .line 213
    .line 214
    add-int/lit8 v1, v1, 0x7

    .line 215
    .line 216
    mul-int/lit8 v1, v1, 0x35

    .line 217
    .line 218
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionList()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    add-int/2addr v1, v0

    .line 227
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasOptions()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_b

    .line 232
    .line 233
    mul-int/lit8 v1, v1, 0x25

    .line 234
    .line 235
    add-int/lit8 v1, v1, 0x8

    .line 236
    .line 237
    mul-int/lit8 v1, v1, 0x35

    .line 238
    .line 239
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->hashCode()I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    add-int/2addr v1, v0

    .line 248
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSourceCodeInfo()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_c

    .line 253
    .line 254
    mul-int/lit8 v1, v1, 0x25

    .line 255
    .line 256
    add-int/lit8 v1, v1, 0x9

    .line 257
    .line 258
    mul-int/lit8 v1, v1, 0x35

    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;->hashCode()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    add-int/2addr v1, v0

    .line 269
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSyntax()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_d

    .line 274
    .line 275
    mul-int/lit8 v1, v1, 0x25

    .line 276
    .line 277
    add-int/lit8 v1, v1, 0xc

    .line 278
    .line 279
    mul-int/lit8 v1, v1, 0x35

    .line 280
    .line 281
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSyntax()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    add-int/2addr v1, v0

    .line 290
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasEdition()Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_e

    .line 295
    .line 296
    mul-int/lit8 v1, v1, 0x25

    .line 297
    .line 298
    add-int/lit8 v1, v1, 0xe

    .line 299
    .line 300
    mul-int/lit8 v1, v1, 0x35

    .line 301
    .line 302
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 303
    .line 304
    add-int/2addr v1, v0

    .line 305
    :cond_e
    mul-int/lit8 v1, v1, 0x1d

    .line 306
    .line 307
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    add-int/2addr v1, v0

    .line 316
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 317
    .line 318
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos;->access$700()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    .line 6
    .line 7
    const-class v2, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

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
    .locals 4

    .line 1
    iget-byte v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

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
    move v0, v2

    .line 12
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageTypeCount()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v0, v3, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getMessageType(I)Lcom/google/protobuf/DescriptorProtos$DescriptorProto;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$DescriptorProto;->isInitialized()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move v0, v2

    .line 35
    :goto_1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumTypeCount()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ge v0, v3, :cond_5

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getEnumType(I)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;->isInitialized()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_4

    .line 50
    .line 51
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 52
    .line 53
    return v2

    .line 54
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    move v0, v2

    .line 58
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getServiceCount()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-ge v0, v3, :cond_7

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getService(I)Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;->isInitialized()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_6

    .line 73
    .line 74
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 75
    .line 76
    return v2

    .line 77
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_7
    move v0, v2

    .line 81
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtensionCount()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-ge v0, v3, :cond_9

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getExtension(I)Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;->isInitialized()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-nez v3, :cond_8

    .line 96
    .line 97
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 98
    .line 99
    return v2

    .line 100
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasOptions()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_a

    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$FileOptions;->isInitialized()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_a

    .line 118
    .line 119
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 120
    .line 121
    return v2

    .line 122
    :cond_a
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->hasSourceCodeInfo()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;->isInitialized()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_b

    .line 137
    .line 138
    iput-byte v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 139
    .line 140
    return v2

    .line 141
    :cond_b
    iput-byte v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->memoizedIsInitialized:B

    .line 142
    .line 143
    return v1
.end method

.method public newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->newBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;-><init>(Lcom/google/protobuf/AbstractMessage$BuilderParent;Lcom/google/protobuf/DescriptorProtos$1;)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->newBuilderForType()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->DEFAULT_INSTANCE:Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;-><init>(Lcom/google/protobuf/DescriptorProtos$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    invoke-direct {v0, v1}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;-><init>(Lcom/google/protobuf/DescriptorProtos$1;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;->mergeFrom(Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->toBuilder()Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    and-int/2addr v0, v1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->package_:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    move v1, v0

    .line 25
    :goto_0
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/google/protobuf/LazyStringArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ge v1, v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->dependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lcom/google/protobuf/LazyStringArrayList;->getRaw(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-static {p1, v3, v2}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v1, v0

    .line 47
    :goto_1
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x4

    .line 54
    if-ge v1, v2, :cond_3

    .line 55
    .line 56
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->messageType_:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 63
    .line 64
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move v1, v0

    .line 71
    :goto_2
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-ge v1, v2, :cond_4

    .line 78
    .line 79
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->enumType_:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 86
    .line 87
    const/4 v4, 0x5

    .line 88
    invoke-virtual {p1, v4, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    move v1, v0

    .line 95
    :goto_3
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-ge v1, v2, :cond_5

    .line 102
    .line 103
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->service_:Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 110
    .line 111
    const/4 v4, 0x6

    .line 112
    invoke-virtual {p1, v4, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    move v1, v0

    .line 119
    :goto_4
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-ge v1, v2, :cond_6

    .line 126
    .line 127
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->extension_:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 134
    .line 135
    const/4 v4, 0x7

    .line 136
    invoke-virtual {p1, v4, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v1, v1, 0x1

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 143
    .line 144
    and-int/2addr v1, v3

    .line 145
    const/16 v2, 0x8

    .line 146
    .line 147
    if-eqz v1, :cond_7

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getOptions()Lcom/google/protobuf/DescriptorProtos$FileOptions;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 154
    .line 155
    .line 156
    :cond_7
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 157
    .line 158
    and-int/2addr v1, v2

    .line 159
    if-eqz v1, :cond_8

    .line 160
    .line 161
    const/16 v1, 0x9

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->getSourceCodeInfo()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 168
    .line 169
    .line 170
    :cond_8
    move v1, v0

    .line 171
    :goto_5
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-ge v1, v2, :cond_9

    .line 178
    .line 179
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->publicDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 180
    .line 181
    invoke-interface {v2, v1}, Lcom/google/protobuf/Internal$IntList;->getInt(I)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    const/16 v3, 0xa

    .line 186
    .line 187
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 188
    .line 189
    .line 190
    add-int/lit8 v1, v1, 0x1

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_9
    move v1, v0

    .line 194
    :goto_6
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 195
    .line 196
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-ge v1, v2, :cond_a

    .line 201
    .line 202
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->weakDependency_:Lcom/google/protobuf/Internal$IntList;

    .line 203
    .line 204
    invoke-interface {v2, v1}, Lcom/google/protobuf/Internal$IntList;->getInt(I)I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    const/16 v3, 0xb

    .line 209
    .line 210
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 211
    .line 212
    .line 213
    add-int/lit8 v1, v1, 0x1

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_a
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 217
    .line 218
    and-int/lit8 v1, v1, 0x10

    .line 219
    .line 220
    if-eqz v1, :cond_b

    .line 221
    .line 222
    const/16 v1, 0xc

    .line 223
    .line 224
    iget-object v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->syntax_:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-static {p1, v1, v2}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :cond_b
    iget v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->bitField0_:I

    .line 230
    .line 231
    and-int/lit8 v1, v1, 0x20

    .line 232
    .line 233
    if-eqz v1, :cond_c

    .line 234
    .line 235
    const/16 v1, 0xe

    .line 236
    .line 237
    iget v2, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->edition_:I

    .line 238
    .line 239
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 240
    .line 241
    .line 242
    :cond_c
    :goto_7
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 243
    .line 244
    invoke-virtual {v1}, Lcom/google/protobuf/LazyStringArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-ge v0, v1, :cond_d

    .line 249
    .line 250
    iget-object v1, p0, Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;->optionDependency_:Lcom/google/protobuf/LazyStringArrayList;

    .line 251
    .line 252
    invoke-virtual {v1, v0}, Lcom/google/protobuf/LazyStringArrayList;->getRaw(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    const/16 v2, 0xf

    .line 257
    .line 258
    invoke-static {p1, v2, v1}, Lcom/google/protobuf/GeneratedMessage;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    add-int/lit8 v0, v0, 0x1

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_d
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 269
    .line 270
    .line 271
    return-void
.end method
