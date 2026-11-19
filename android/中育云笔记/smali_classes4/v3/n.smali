.class public final synthetic Lv3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/DBActivity;

.field public final synthetic d:Landroidx/compose/runtime/State;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/DBActivity;Landroidx/compose/runtime/State;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/n;->c:Lcom/friday/main/view/DBActivity;

    iput-object p2, p0, Lv3/n;->d:Landroidx/compose/runtime/State;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/n;->c:Lcom/friday/main/view/DBActivity;

    iget-object v1, p0, Lv3/n;->d:Landroidx/compose/runtime/State;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, p1}, Lcom/friday/main/view/DBActivity;->P(Lcom/friday/main/view/DBActivity;Landroidx/compose/runtime/State;Landroidx/compose/foundation/lazy/LazyListScope;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
