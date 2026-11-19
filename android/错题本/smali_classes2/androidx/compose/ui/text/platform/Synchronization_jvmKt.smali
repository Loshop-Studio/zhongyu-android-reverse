.class public final Landroidx/compose/ui/text/platform/Synchronization_jvmKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\u0008\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a9\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0081\u0008\u0082\u0002\n\n\u0008\u0008\u0001\u0012\u0002\u0010\u0002 \u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "ref",
        "Landroidx/compose/ui/text/platform/SynchronizedObject;",
        "makeSynchronizedObject",
        "(Ljava/lang/Object;)Landroidx/compose/ui/text/platform/SynchronizedObject;",
        "R",
        "lock",
        "Lkotlin/Function0;",
        "block",
        "synchronized",
        "(Landroidx/compose/ui/text/platform/SynchronizedObject;Lr6/a;)Ljava/lang/Object;",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/JvmName;
    name = "Synchronization_jvmKt"
.end annotation


# direct methods
.method public static final makeSynchronizedObject(Ljava/lang/Object;)Landroidx/compose/ui/text/platform/SynchronizedObject;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance p0, Landroidx/compose/ui/text/platform/SynchronizedObject;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/compose/ui/text/platform/SynchronizedObject;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public static synthetic makeSynchronizedObject$default(Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/ui/text/platform/SynchronizedObject;
    .locals 0

    .line 1
    new-instance p0, Landroidx/compose/ui/text/platform/SynchronizedObject;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/compose/ui/text/platform/SynchronizedObject;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public static final synchronized(Landroidx/compose/ui/text/platform/SynchronizedObject;Lr6/a;)Ljava/lang/Object;
    .locals 0
    .param p0    # Landroidx/compose/ui/text/platform/SynchronizedObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/text/platform/SynchronizedObject;",
            "Lr6/a;",
            ")TR;"
        }
    .end annotation

    .annotation build Lkotlin/PublishedApi;
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
