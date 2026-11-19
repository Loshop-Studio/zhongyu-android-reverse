.class public final synthetic Lv2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/NewestFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/NewestFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/a0;->c:Lcom/friday/document/view/document/NewestFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/a0;->c:Lcom/friday/document/view/document/NewestFragment;

    check-cast p1, Lcom/friday/common/entity/UpdateSpecifiedItem;

    invoke-static {v0, p1}, Lcom/friday/document/view/document/NewestFragment;->U(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/UpdateSpecifiedItem;)V

    return-void
.end method
