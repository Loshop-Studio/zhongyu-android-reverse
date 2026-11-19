.class public Lorg/android/spdy/ProtectedPointerTest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/android/spdy/ProtectedPointerTest$Data;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 2

    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x1

    if-ge p0, v0, :cond_0

    .line 1
    new-instance v0, Lorg/android/spdy/ProtectedPointerTest$Data;

    invoke-direct {v0}, Lorg/android/spdy/ProtectedPointerTest$Data;-><init>()V

    .line 2
    new-instance v1, Lorg/android/spdy/ProtectedPointer;

    invoke-direct {v1, v0}, Lorg/android/spdy/ProtectedPointer;-><init>(Ljava/lang/Object;)V

    .line 3
    new-instance v0, Lorg/android/spdy/ProtectedPointerTest$3;

    invoke-direct {v0}, Lorg/android/spdy/ProtectedPointerTest$3;-><init>()V

    invoke-virtual {v1, v0}, Lorg/android/spdy/ProtectedPointer;->setHow2close(Lorg/android/spdy/ProtectedPointer$ProtectedPointerOnClose;)V

    .line 4
    invoke-static {v1}, Lorg/android/spdy/ProtectedPointerTest;->test_close_with_work(Lorg/android/spdy/ProtectedPointer;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static test_close_anywhere1(Lorg/android/spdy/ProtectedPointer;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/android/spdy/ProtectedPointer;->enter()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lorg/android/spdy/ProtectedPointer;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/android/spdy/ProtectedPointerTest$Data;

    .line 3
    invoke-virtual {p0}, Lorg/android/spdy/ProtectedPointer;->release()V

    .line 4
    invoke-virtual {v0}, Lorg/android/spdy/ProtectedPointerTest$Data;->work()V

    .line 5
    invoke-virtual {p0}, Lorg/android/spdy/ProtectedPointer;->exit()V

    :cond_0
    return-void
.end method

.method public static test_close_with_work(Lorg/android/spdy/ProtectedPointer;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lorg/android/spdy/ProtectedPointerTest$1;

    invoke-direct {v1, p0}, Lorg/android/spdy/ProtectedPointerTest$1;-><init>(Lorg/android/spdy/ProtectedPointer;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lorg/android/spdy/ProtectedPointerTest$2;

    invoke-direct {v2, p0}, Lorg/android/spdy/ProtectedPointerTest$2;-><init>(Lorg/android/spdy/ProtectedPointer;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v1}, Ljava/lang/Thread;->run()V

    invoke-virtual {v0}, Ljava/lang/Thread;->run()V

    return-void
.end method

.method public static test_sequece(Lorg/android/spdy/ProtectedPointer;)V
    .locals 0

    invoke-virtual {p0}, Lorg/android/spdy/ProtectedPointer;->release()V

    return-void
.end method
