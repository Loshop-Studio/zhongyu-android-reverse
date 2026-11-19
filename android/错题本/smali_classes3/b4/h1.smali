.class public abstract Lb4/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v0, "\n\u0012RouterRecord.proto\"\u00f3\u0003\n\u000cRouterRecord\u00128\n\rcommandRecord\u0018\u0001 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u00126\n\u000baudioRecord\u0018\u0002 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012<\n\u0011touchSourceRecord\u0018\u0003 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012=\n\u0012matrixSourceRecord\u0018\u0004 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010fileSourceRecord\u0018\u0005 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012;\n\u0010textSourceRecord\u0018\u0006 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u0012?\n\u0014geometrySourceRecord\u0018\u0007 \u0003(\u000b2!.RouterRecord.SourceCommandRecord\u001a9\n\u0013SourceCommandRecord\u0012\u0010\n\u0008fileName\u0018\u0001 \u0001(\t\u0012\u0010\n\u0008validate\u0018\u0002 \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyRouterRecordb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 9
    .line 10
    invoke-static {v0, v2}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 23
    .line 24
    sput-object v0, Lb4/h1;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 25
    .line 26
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 27
    .line 28
    const-string v8, "TextSourceRecord"

    .line 29
    .line 30
    const-string v9, "GeometrySourceRecord"

    .line 31
    .line 32
    const-string v3, "CommandRecord"

    .line 33
    .line 34
    const-string v4, "AudioRecord"

    .line 35
    .line 36
    const-string v5, "TouchSourceRecord"

    .line 37
    .line 38
    const-string v6, "MatrixSourceRecord"

    .line 39
    .line 40
    const-string v7, "FileSourceRecord"

    .line 41
    .line 42
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v2, Lb4/h1;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 60
    .line 61
    sput-object v0, Lb4/h1;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 62
    .line 63
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 64
    .line 65
    const-string v2, "FileName"

    .line 66
    .line 67
    const-string v3, "Validate"

    .line 68
    .line 69
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sput-object v1, Lb4/h1;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 77
    .line 78
    return-void
.end method
