.class public final Lorg/tensorflow/lite/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/b$a;
    }
.end annotation


# instance fields
.field public c:Lorg/tensorflow/lite/NativeInterpreterWrapper;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/b$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/tensorflow/lite/NativeInterpreterWrapper;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lorg/tensorflow/lite/NativeInterpreterWrapper;-><init>(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/b$a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/tensorflow/lite/b;->c:Lorg/tensorflow/lite/NativeInterpreterWrapper;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/tensorflow/lite/b;->c:Lorg/tensorflow/lite/NativeInterpreterWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/tensorflow/lite/NativeInterpreterWrapper;->close()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lorg/tensorflow/lite/b;->c:Lorg/tensorflow/lite/NativeInterpreterWrapper;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/tensorflow/lite/b;->c:Lorg/tensorflow/lite/NativeInterpreterWrapper;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Internal error: The Interpreter has already been closed."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lorg/tensorflow/lite/b;->g([Ljava/lang/Object;Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public finalize()V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lorg/tensorflow/lite/b;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 10
    .line 11
    .line 12
    throw v0
.end method

.method public g([Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/tensorflow/lite/b;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/tensorflow/lite/b;->c:Lorg/tensorflow/lite/NativeInterpreterWrapper;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lorg/tensorflow/lite/NativeInterpreterWrapper;->j([Ljava/lang/Object;Ljava/util/Map;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
