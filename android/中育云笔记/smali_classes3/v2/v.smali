.class public final synthetic Lv2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/FolderFragment;

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/v;->c:Lcom/friday/document/view/document/FolderFragment;

    iput-object p2, p0, Lv2/v;->d:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/v;->c:Lcom/friday/document/view/document/FolderFragment;

    iget-object v1, p0, Lv2/v;->d:Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, v1}, Lcom/friday/document/view/document/FolderFragment;->X(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
