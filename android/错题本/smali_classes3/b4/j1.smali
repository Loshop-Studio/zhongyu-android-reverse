.class public abstract Lb4/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n\u0019enums/ScaleTypeEnum.proto*\u009e\u0001\n\rScaleTypeEnum\u0012\u0012\n\u000eMODE_MAX_WIDTH\u0010\u0000\u0012\u0013\n\u000fMODE_MAX_HEIGHT\u0010\u0001\u0012\u0012\n\u000eMODE_MAX_VALUE\u0010\u0002\u0012\u0012\n\u000eMODE_MIN_VALUE\u0010\u0003\u0012\u0010\n\u000cMODE_ADAPTER\u0010\u0004\u0012\u0012\n\u000eMODE_ADAPTER_8\u0010\u0005\u0012\u0016\n\u0012MODE_MATRIX_HEIGHT\u0010\u0006B\"\n\u000ecom.zykj.boardB\u0010EzyScaleTypeEnumb\u0006proto3"

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
    new-array v1, v1, [Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/google/protobuf/Descriptors$FileDescriptor;->internalBuildGeneratedFileFrom([Ljava/lang/String;[Lcom/google/protobuf/Descriptors$FileDescriptor;)Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lb4/j1;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    return-void
.end method
