.class public final Lorg/tensorflow/lite/TensorFlowLite;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Throwable;

.field public static volatile b:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "tensorflowlite_jni"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    :goto_0
    sput-object v0, Lorg/tensorflow/lite/TensorFlowLite;->a:Ljava/lang/Throwable;

    .line 10
    .line 11
    return-void
.end method

.method public static a()V
    .locals 4

    .line 1
    sget-boolean v0, Lorg/tensorflow/lite/TensorFlowLite;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-static {}, Lorg/tensorflow/lite/TensorFlowLite;->nativeRuntimeVersion()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sput-boolean v0, Lorg/tensorflow/lite/TensorFlowLite;->b:Z
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception v0

    .line 14
    sget-object v1, Lorg/tensorflow/lite/TensorFlowLite;->a:Ljava/lang/Throwable;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :cond_1
    new-instance v1, Ljava/lang/UnsatisfiedLinkError;

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v3, "Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  "

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {v1, v0}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lorg/tensorflow/lite/TensorFlowLite;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lorg/tensorflow/lite/TensorFlowLite;->nativeRuntimeVersion()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public static native nativeRuntimeVersion()Ljava/lang/String;
.end method

.method public static native nativeSchemaVersion()Ljava/lang/String;
.end method
