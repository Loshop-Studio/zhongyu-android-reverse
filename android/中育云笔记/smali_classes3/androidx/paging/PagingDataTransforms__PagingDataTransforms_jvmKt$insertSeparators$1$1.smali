.class final Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1"
    f = "PagingDataTransforms.jvm.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field final synthetic $after:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic $before:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic $generator:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "TT;TT;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$generator:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$before:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$after:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$generator:Lhd/p;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$before:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$after:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;-><init>(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$generator:Lhd/p;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$before:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1;->$after:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
