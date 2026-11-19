.class public final synthetic Lv2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/NewestFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/NewestFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/c0;->c:Lcom/friday/document/view/document/NewestFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/c0;->c:Lcom/friday/document/view/document/NewestFragment;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, p1}, Lcom/friday/document/view/document/NewestFragment;->V(Lcom/friday/document/view/document/NewestFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
