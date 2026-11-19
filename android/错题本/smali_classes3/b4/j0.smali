.class public abstract Lb4/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final e:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "\n\u0010PageRouter.proto\"a\n\nPageRouter\u0012&\n\u0008pageInfo\u0018\u0001 \u0003(\u000b2\u0014.PageRouter.PageInfo\u001a+\n\u0008PageInfo\u0012\u000c\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0011\n\tpageIndex\u0018\u0002 \u0001(\u0005B\u001f\n\u000ecom.zykj.boardB\rEzyPageRouterb\u0006proto3"

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
    sput-object v0, Lb4/j0;->e:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 25
    .line 26
    sput-object v0, Lb4/j0;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 27
    .line 28
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 29
    .line 30
    const-string v3, "PageInfo"

    .line 31
    .line 32
    filled-new-array {v3}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v2, Lb4/j0;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 50
    .line 51
    sput-object v0, Lb4/j0;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 52
    .line 53
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 54
    .line 55
    const-string v2, "Name"

    .line 56
    .line 57
    const-string v3, "PageIndex"

    .line 58
    .line 59
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sput-object v1, Lb4/j0;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 67
    .line 68
    return-void
.end method
