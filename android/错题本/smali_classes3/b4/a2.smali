.class public abstract Lb4/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final c:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final e:Lcom/google/protobuf/Descriptors$Descriptor;

.field public static final f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

.field public static final g:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v0, "\n\u0016utils/TouchEvent.proto\"\u00a1\u0002\n\nTouchEvent\u0012\u0011\n\teventTime\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006action\u0018\u0002 \u0001(\u0005\u0012\t\n\u0001x\u0018\u0003 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0004 \u0001(\u0002\u0012\u0014\n\u000cpointerCount\u0018\u0005 \u0001(\u0005\u00128\n\u0011pointerProperties\u0018\u0006 \u0003(\u000b2\u001d.TouchEvent.PointerProperties\u00120\n\rpointerCoords\u0018\u0007 \u0003(\u000b2\u0019.TouchEvent.PointerCoords\u001a1\n\u0011PointerProperties\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\u0008toolType\u0018\u0002 \u0001(\u0005\u001a%\n\rPointerCoords\u0012\t\n\u0001x\u0018\u0001 \u0001(\u0002\u0012\t\n\u0001y\u0018\u0002 \u0001(\u0002B\u001f\n\u000ecom.zykj.boardB\rEzyTouchEventb\u0006proto3"

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
    sput-object v0, Lb4/a2;->g:Lcom/google/protobuf/Descriptors$FileDescriptor;

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
    sput-object v0, Lb4/a2;->a:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 27
    .line 28
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 29
    .line 30
    const-string v8, "PointerProperties"

    .line 31
    .line 32
    const-string v9, "PointerCoords"

    .line 33
    .line 34
    const-string v3, "EventTime"

    .line 35
    .line 36
    const-string v4, "Action"

    .line 37
    .line 38
    const-string v5, "X"

    .line 39
    .line 40
    const-string v6, "Y"

    .line 41
    .line 42
    const-string v7, "PointerCount"

    .line 43
    .line 44
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v2, v0, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lb4/a2;->b:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 62
    .line 63
    sput-object v1, Lb4/a2;->c:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 64
    .line 65
    new-instance v2, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 66
    .line 67
    const-string v3, "Id"

    .line 68
    .line 69
    const-string v4, "ToolType"

    .line 70
    .line 71
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-direct {v2, v1, v3}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sput-object v2, Lb4/a2;->d:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getNestedTypes()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/google/protobuf/Descriptors$Descriptor;

    .line 90
    .line 91
    sput-object v0, Lb4/a2;->e:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 92
    .line 93
    new-instance v1, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 94
    .line 95
    const-string v2, "X"

    .line 96
    .line 97
    const-string v3, "Y"

    .line 98
    .line 99
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-direct {v1, v0, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sput-object v1, Lb4/a2;->f:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 107
    .line 108
    return-void
.end method
