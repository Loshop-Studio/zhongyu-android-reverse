.class public final synthetic Lcom/friday/document/view/document/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/RecycleBinFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/RecycleBinFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/document/view/document/a;->c:Lcom/friday/document/view/document/RecycleBinFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/document/a;->c:Lcom/friday/document/view/document/RecycleBinFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/friday/document/view/document/RecycleBinFragment$initObserver$4;->g(Lcom/friday/document/view/document/RecycleBinFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
