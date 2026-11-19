.class final synthetic Landroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a0\u0010\u0008\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0081\u0008\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "R",
        "",
        "Landroidx/compose/runtime/platform/SynchronizedObject;",
        "lock",
        "Lkotlin/Function0;",
        "block",
        "synchronized",
        "(Ljava/lang/Object;Lr6/a;)Ljava/lang/Object;",
        "oldSynchronized",
        "runtime_release"
    }
    k = 0x5
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
    xs = "androidx/compose/runtime/ActualJvm_jvmKt"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOldSynchronized.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldSynchronized.android.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,33:1\n33#2,2:34\n*S KotlinDebug\n*F\n+ 1 OldSynchronized.android.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__OldSynchronized_androidKt\n*L\n32#1:34,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic synchronized(Ljava/lang/Object;Lr6/a;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lr6/a;",
            ")TR;"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "not expected to be referenced directly as the old version had to be inlined"
    .end annotation

    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "synchronized"
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit p0

    .line 10
    throw p1
.end method
