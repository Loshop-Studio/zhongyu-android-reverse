.class public final synthetic Lu2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/ManualSyncFileDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/ManualSyncFileDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/m;->c:Lcom/friday/document/view/ManualSyncFileDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/m;->c:Lcom/friday/document/view/ManualSyncFileDialog;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/friday/document/view/ManualSyncFileDialog;->r(Lcom/friday/document/view/ManualSyncFileDialog;Ljava/util/List;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
