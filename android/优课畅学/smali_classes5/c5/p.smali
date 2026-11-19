.class public final synthetic Lc5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/UiState;

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/UiState;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/p;->a:Lcom/zykj/study/bean/UiState;

    iput-object p2, p0, Lc5/p;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/p;->a:Lcom/zykj/study/bean/UiState;

    iget-object v1, p0, Lc5/p;->b:Lx7/l;

    check-cast p1, Landroidx/compose/foundation/layout/BoxScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt;->e(Lcom/zykj/study/bean/UiState;Lx7/l;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
