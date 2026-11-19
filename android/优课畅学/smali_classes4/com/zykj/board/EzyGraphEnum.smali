.class public abstract Lcom/zykj/board/EzyGraphEnum;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    }
.end annotation


# static fields
.field public static a:Lcom/google/protobuf/Descriptors$FileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n\u0015enums/GraphEnum.proto*\u009a\u0001\n\tGraphEnum\u0012\u001b\n\u0017BOUNDED_CONTAINER_GRAPH\u0010\u0000\u0012\u000f\n\u000bGROUP_GRAPH\u0010\u0001\u0012\u000f\n\u000bIMAGE_GRAPH\u0010\u0002\u0012\u0010\n\u000cSTROKE_GRAPH\u0010\u0003\u0012\u0018\n\u0014BEELINE_STROKE_GRAPH\u0010\u0004\u0012\u000e\n\nTEXT_GRAPH\u0010\u0005\u0012\u0012\n\u000eGEOMETRY_GRAPH\u0010\u0006B\u001e\n\u000ecom.zykj.boardB\u000cEzyGraphEnumb\u0006proto3"

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
    sput-object v0, Lcom/zykj/board/EzyGraphEnum;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 15
    .line 16
    return-void
.end method

.method public static a()Lcom/google/protobuf/Descriptors$FileDescriptor;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum;->a:Lcom/google/protobuf/Descriptors$FileDescriptor;

    .line 2
    .line 3
    return-object v0
.end method
