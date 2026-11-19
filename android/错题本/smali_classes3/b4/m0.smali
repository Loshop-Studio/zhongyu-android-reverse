.class public abstract Lb4/m0;
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
    .locals 14

    .line 1
    const-string v0, "\n\u0013GraphSnapshot.proto\u001a\u0011utils/RectF.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0012utils/Matrix.proto\u001a\u0015enums/GraphEnum.proto\"\u009a\u0003\n\u000cPageSnapshot\u0012\u001d\n\u000ccameraMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u00122\n\rgraphSnapshot\u0018\u0002 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u001a\u00b6\u0002\n\rGraphSnapshot\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0017\n\u0006matrix\u0018\u0004 \u0001(\u000b2\u0007.Matrix\u0012/\n\nchildGraph\u0018\u0005 \u0003(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0016\n\u000esourceFileName\u0018\u0006 \u0001(\t\u0012\u0010\n\u0008sourceId\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fbackgroundColor\u0018\u0008 \u0001(\u0005\u0012\u0015\n\u0005paint\u0018\t \u0001(\u000b2\u0006.Paint\u0012\u000f\n\u0007content\u0018\n \u0001(\t\u0012\u001a\n\tpointList\u0018\u000b \u0003(\u000b2\u0007.PointF\u0012\u0010\n\u0008filePath\u0018\u000c \u0001(\tB!\n\u000ecom.zykj.boardB\u000fEzyPageSnapshotb\u0006proto3"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lb4/d1;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 8
    .line 9
    sget-object v2, Lb4/r0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 10
    .line 11
    sget-object v3, Lb4/w0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 12
    .line 13
    sget-object v4, Lb4/d0;->c:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 14
    .line 15
    sget-object v5, Lb4/l;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 16
    .line 17
    filled-new-array {v1, v2, v3, v4, v5}, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lb4/m0;->e:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getMessageTypes()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 37
    .line 38
    sput-object v0, Lb4/m0;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 39
    .line 40
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 41
    .line 42
    const-string v3, "CameraMatrix"

    .line 43
    .line 44
    const-string v4, "GraphSnapshot"

    .line 45
    .line 46
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v2, Lb4/m0;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 64
    .line 65
    sput-object v0, Lb4/m0;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 66
    .line 67
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 68
    .line 69
    const-string v12, "PointList"

    .line 70
    .line 71
    const-string v13, "FilePath"

    .line 72
    .line 73
    const-string v2, "Id"

    .line 74
    .line 75
    const-string v3, "GraphEnum"

    .line 76
    .line 77
    const-string v4, "OutRect"

    .line 78
    .line 79
    const-string v5, "Matrix"

    .line 80
    .line 81
    const-string v6, "ChildGraph"

    .line 82
    .line 83
    const-string v7, "SourceFileName"

    .line 84
    .line 85
    const-string v8, "SourceId"

    .line 86
    .line 87
    const-string v9, "BackgroundColor"

    .line 88
    .line 89
    const-string v10, "Paint"

    .line 90
    .line 91
    const-string v11, "Content"

    .line 92
    .line 93
    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sput-object v1, Lb4/m0;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 101
    .line 102
    return-void
.end method
