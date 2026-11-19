.class public final synthetic Lu2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/ManualSyncFileDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/ManualSyncFileDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/l;->c:Lcom/friday/document/view/ManualSyncFileDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/l;->c:Lcom/friday/document/view/ManualSyncFileDialog;

    invoke-static {v0, p1}, Lcom/friday/document/view/ManualSyncFileDialog;->t(Lcom/friday/document/view/ManualSyncFileDialog;Landroid/view/View;)V

    return-void
.end method
