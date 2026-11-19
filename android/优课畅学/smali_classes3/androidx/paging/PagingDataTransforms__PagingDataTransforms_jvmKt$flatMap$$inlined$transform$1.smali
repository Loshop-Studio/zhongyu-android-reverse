.class public final Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt;->flatMap(Landroidx/paging/PagingData;Ljava/util/concurrent/Executor;Lx7/l;)Landroidx/paging/PagingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll8/c;"
    }
.end annotation


# instance fields
.field final synthetic $executor$inlined:Ljava/util/concurrent/Executor;

.field final synthetic $this_unsafeTransform$inlined:Ll8/c;

.field final synthetic $transform$inlined$1:Lx7/l;


# direct methods
.method public constructor <init>(Ll8/c;Ljava/util/concurrent/Executor;Lx7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;->$executor$inlined:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;->$transform$inlined$1:Lx7/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;->$executor$inlined:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1;->$transform$inlined$1:Lx7/l;

    .line 8
    .line 9
    invoke-direct {v1, p1, v2, v3}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2;-><init>(Ll8/d;Ljava/util/concurrent/Executor;Lx7/l;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, p2}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 24
    .line 25
    return-object p1
.end method
