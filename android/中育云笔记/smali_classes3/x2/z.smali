.class public final synthetic Lx2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/StudentShareFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/StudentShareFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/z;->c:Lcom/friday/document/view/share/StudentShareFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/z;->c:Lcom/friday/document/view/share/StudentShareFragment;

    check-cast p1, Lcom/friday/document/model/ShareFile;

    invoke-static {v0, p1}, Lcom/friday/document/view/share/StudentShareFragment;->u(Lcom/friday/document/view/share/StudentShareFragment;Lcom/friday/document/model/ShareFile;)V

    return-void
.end method
