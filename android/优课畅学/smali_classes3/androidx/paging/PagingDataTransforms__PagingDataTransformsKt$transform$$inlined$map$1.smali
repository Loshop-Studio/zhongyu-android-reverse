.class public final Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt;->transform(Landroidx/paging/PagingData;Lx7/p;)Landroidx/paging/PagingData;
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
.field final synthetic $this_unsafeTransform$inlined:Ll8/c;

.field final synthetic $transform$inlined:Lx7/p;


# direct methods
.method public constructor <init>(Ll8/c;Lx7/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;->$transform$inlined:Lx7/p;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;->$transform$inlined:Lx7/p;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2;-><init>(Ll8/d;Lx7/p;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method

.method public collect$$forInline(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Lkotlin/jvm/internal/s;->c(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$1;

    .line 6
    .line 7
    invoke-direct {v0, p0, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$1;-><init>(Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/s;->c(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;->$this_unsafeTransform$inlined:Ll8/c;

    .line 15
    .line 16
    new-instance v1, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1;->$transform$inlined:Lx7/p;

    .line 19
    .line 20
    invoke-direct {v1, p1, v2}, Landroidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2;-><init>(Ll8/d;Lx7/p;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1, p2}, Ll8/c;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    invoke-static {p1}, Lkotlin/jvm/internal/s;->c(I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 35
    .line 36
    return-object p1
.end method
