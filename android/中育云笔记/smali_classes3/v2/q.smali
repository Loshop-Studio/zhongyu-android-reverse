.class public final synthetic Lv2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/FolderFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/FolderFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/q;->c:Lcom/friday/document/view/document/FolderFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/q;->c:Lcom/friday/document/view/document/FolderFragment;

    check-cast p1, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, p1}, Lcom/friday/document/view/document/FolderFragment;->V(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V

    return-void
.end method
