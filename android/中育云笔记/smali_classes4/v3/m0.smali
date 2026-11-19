.class public final synthetic Lv3/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/FolderMoveActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/FolderMoveActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/m0;->c:Lcom/friday/main/view/FolderMoveActivity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/m0;->c:Lcom/friday/main/view/FolderMoveActivity;

    invoke-static {v0}, Lcom/friday/main/view/FolderMoveActivity;->O(Lcom/friday/main/view/FolderMoveActivity;)Lcom/friday/main/adapter/FolderMoveAdapter;

    move-result-object v0

    return-object v0
.end method
