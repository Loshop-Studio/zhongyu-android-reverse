# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/huiwei/launcher/proto/g;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/huiwei/launcher/proto/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/proto/g$b;
    }
.end annotation


# static fields
.field public static final CLASSID_FIELD_NUMBER:I = 0x3

.field public static final CLASSNAME_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

.field public static final ENTERSCHOOLYEAR_FIELD_NUMBER:I = 0x5

.field public static final GRADENAME_FIELD_NUMBER:I = 0x6

.field public static final ID_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final STUDENTNUMBER_FIELD_NUMBER:I = 0x2


# instance fields
.field private classId_:I

.field private className_:Ljava/lang/String;

.field private enterSchoolYear_:Ljava/lang/String;

.field private gradeName_:Ljava/lang/String;

.field private id_:J

.field private studentNumber_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/proto/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    .line 7
    .line 8
    const-class v1, Lcom/zykj/huiwei/launcher/proto/g;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->studentNumber_:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->className_:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->enterSchoolYear_:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->gradeName_:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method

.method public static bridge synthetic a(Lcom/zykj/huiwei/launcher/proto/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g;->clearClassId()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/zykj/huiwei/launcher/proto/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g;->clearClassName()V

    return-void
.end method

.method public static bridge synthetic c(Lcom/zykj/huiwei/launcher/proto/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g;->clearEnterSchoolYear()V

    return-void
.end method

.method private clearClassId()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->classId_:I

    .line 3
    .line 4
    return-void
.end method

.method private clearClassName()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/g;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getClassName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->className_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearEnterSchoolYear()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/g;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getEnterSchoolYear()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->enterSchoolYear_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearGradeName()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/g;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getGradeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->gradeName_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method private clearId()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->id_:J

    .line 4
    .line 5
    return-void
.end method

.method private clearStudentNumber()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/proto/g;->getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/g;->getStudentNumber()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->studentNumber_:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static bridge synthetic d(Lcom/zykj/huiwei/launcher/proto/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g;->clearGradeName()V

    return-void
.end method

.method public static bridge synthetic e(Lcom/zykj/huiwei/launcher/proto/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g;->clearId()V

    return-void
.end method

.method public static bridge synthetic f(Lcom/zykj/huiwei/launcher/proto/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/proto/g;->clearStudentNumber()V

    return-void
.end method

.method public static bridge synthetic g(Lcom/zykj/huiwei/launcher/proto/g;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setClassId(I)V

    return-void
.end method

.method public static getDefaultInstance()Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic h(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setClassName(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic i(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setClassNameBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic j(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setEnterSchoolYear(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setEnterSchoolYearBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic l(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setGradeName(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic m(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setGradeNameBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static bridge synthetic n(Lcom/zykj/huiwei/launcher/proto/g;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/huiwei/launcher/proto/g;->setId(J)V

    return-void
.end method

.method public static newBuilder()Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/g$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/huiwei/launcher/proto/g;)Lcom/zykj/huiwei/launcher/proto/g$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g$b;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/zykj/huiwei/launcher/proto/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setStudentNumber(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic p(Lcom/zykj/huiwei/launcher/proto/g;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/proto/g;->setStudentNumberBytes(Lcom/google/protobuf/ByteString;)V

    return-void
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 4
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 9
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 10
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 7
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 8
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 5
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 6
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/zykj/huiwei/launcher/proto/g;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/huiwei/launcher/proto/g;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->getParserForType()Lcom/google/protobuf/Parser;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static bridge synthetic q()Lcom/zykj/huiwei/launcher/proto/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    return-object v0
.end method

.method private setClassId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->classId_:I

    .line 2
    .line 3
    return-void
.end method

.method private setClassName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->className_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setClassNameBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->className_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setEnterSchoolYear(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->enterSchoolYear_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setEnterSchoolYearBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->enterSchoolYear_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setGradeName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->gradeName_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setGradeNameBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->gradeName_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->id_:J

    .line 2
    .line 3
    return-void
.end method

.method private setStudentNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->studentNumber_:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private setStudentNumberBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/proto/g;->studentNumber_:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object p2, Lcom/zykj/huiwei/launcher/proto/g$a;->$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    throw p2

    .line 14
    :pswitch_0
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :pswitch_1
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/g;->PARSER:Lcom/google/protobuf/Parser;

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    const-class p2, Lcom/zykj/huiwei/launcher/proto/g;

    .line 25
    .line 26
    monitor-enter p2

    .line 27
    :try_start_0
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/g;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 32
    .line 33
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    .line 34
    .line 35
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 36
    .line 37
    .line 38
    sput-object p1, Lcom/zykj/huiwei/launcher/proto/g;->PARSER:Lcom/google/protobuf/Parser;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit p2

    .line 45
    return-object p1

    .line 46
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1

    .line 48
    :cond_1
    return-object p1

    .line 49
    :pswitch_2
    sget-object p1, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_3
    const-string v0, "id_"

    .line 53
    .line 54
    const-string v1, "studentNumber_"

    .line 55
    .line 56
    const-string v2, "classId_"

    .line 57
    .line 58
    const-string v3, "className_"

    .line 59
    .line 60
    const-string v4, "enterSchoolYear_"

    .line 61
    .line 62
    const-string v5, "gradeName_"

    .line 63
    .line 64
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string p2, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0208"

    .line 69
    .line 70
    sget-object p3, Lcom/zykj/huiwei/launcher/proto/g;->DEFAULT_INSTANCE:Lcom/zykj/huiwei/launcher/proto/g;

    .line 71
    .line 72
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :pswitch_4
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/g$b;

    .line 78
    .line 79
    invoke-direct {p1, p2}, Lcom/zykj/huiwei/launcher/proto/g$b;-><init>(Lcom/zykj/huiwei/launcher/proto/h;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_5
    new-instance p1, Lcom/zykj/huiwei/launcher/proto/g;

    .line 84
    .line 85
    invoke-direct {p1}, Lcom/zykj/huiwei/launcher/proto/g;-><init>()V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getClassId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->classId_:I

    .line 2
    .line 3
    return v0
.end method

.method public getClassName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->className_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClassNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->className_:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getEnterSchoolYear()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->enterSchoolYear_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEnterSchoolYearBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->enterSchoolYear_:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getGradeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->gradeName_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGradeNameBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->gradeName_:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->id_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getStudentNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->studentNumber_:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStudentNumberBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/proto/g;->studentNumber_:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
