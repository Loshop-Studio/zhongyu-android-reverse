.class public final synthetic Lv2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/FolderFragment;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/FolderFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/t;->c:Lcom/friday/document/view/document/FolderFragment;

    iput-object p2, p0, Lv2/t;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/t;->c:Lcom/friday/document/view/document/FolderFragment;

    iget-object v1, p0, Lv2/t;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/friday/document/view/document/FolderFragment;->S(Lcom/friday/document/view/document/FolderFragment;Ljava/util/List;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
