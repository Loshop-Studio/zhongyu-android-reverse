.class public abstract Lb4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n\"enums/BackgroundLineTypeEnum.proto*7\n\u0016BackgroundLineTypeEnum\u0012\u000e\n\nHORIZONTAL\u0010\u0000\u0012\r\n\tSTAGGERED\u0010\u0001B+\n\u000ecom.zykj.boardB\u0019EzyBackgroundLineTypeEnumb\u0006proto3"

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
    sput-object v0, Lb4/b;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    return-void
.end method
