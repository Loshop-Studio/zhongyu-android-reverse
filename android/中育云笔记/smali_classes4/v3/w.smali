.class public final synthetic Lv3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/r;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/DBActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/DBActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/w;->c:Lcom/friday/main/view/DBActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/w;->c:Lcom/friday/main/view/DBActivity;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {v0, p1, p2, p3, p4}, Lcom/friday/main/view/DBActivity;->T(Lcom/friday/main/view/DBActivity;Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
