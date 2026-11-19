.class final synthetic Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$3$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "dispatch(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$Intent;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    const-string v4, "dispatch"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/mistake/feature/notebook/detail/i3;

    invoke-virtual {p0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$3$1;->invoke(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/mistake/feature/notebook/detail/i3;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    invoke-virtual {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    return-void
.end method
