.class public final synthetic Lv2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/FileListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/FileListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/i;->c:Lcom/friday/document/view/document/FileListFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/i;->c:Lcom/friday/document/view/document/FileListFragment;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, p1}, Lcom/friday/document/view/document/FileListFragment;->r(Lcom/friday/document/view/document/FileListFragment;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
