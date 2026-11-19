.class public final Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\rR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lk6/g;",
        "service",
        "<init>",
        "(Lk6/g;)V",
        "Lcom/zykj/student/dialogue/ui/editType/a;",
        "action",
        "",
        "a",
        "(Lcom/zykj/student/dialogue/ui/editType/a;)V",
        "b",
        "()V",
        "Lk6/g;",
        "Lr6/d;",
        "<set-?>",
        "Landroidx/compose/runtime/MutableState;",
        "getEditCategoryViewStates",
        "()Lr6/d;",
        "setEditCategoryViewStates",
        "(Lr6/d;)V",
        "editCategoryViewStates",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "",
        "c",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "getCategoryEvents",
        "()Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "categoryEvents",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEditCategoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/editType/EditCategoryViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,135:1\n85#2:136\n113#2,2:137\n*S KotlinDebug\n*F\n+ 1 EditCategoryViewModel.kt\ncom/zykj/student/dialogue/ui/editType/EditCategoryViewModel\n*L\n23#1:136\n23#1:137,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lk6/g;

.field public final b:Landroidx/compose/runtime/MutableState;

.field public final c:Lkotlinx/coroutines/flow/MutableSharedFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/g;)V
    .locals 2

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;->a:Lk6/g;

    .line 10
    .line 11
    new-instance p1, Lr6/d;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {p1, v1, v0, v1}, Lr6/d;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-static {p1, v1, v0, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;->b:Landroidx/compose/runtime/MutableState;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    const/4 v0, 0x7

    .line 27
    invoke-static {p1, p1, v1, v0, v1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;->c:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 32
    .line 33
    sget-object p1, Lcom/zykj/student/dialogue/ui/editType/a$a;->a:Lcom/zykj/student/dialogue/ui/editType/a$a;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;->a(Lcom/zykj/student/dialogue/ui/editType/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/student/dialogue/ui/editType/a;)V
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p1, p1, Lcom/zykj/student/dialogue/ui/editType/a$a;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/editType/EditCategoryViewModel;->b()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method
