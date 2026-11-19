.class public final synthetic Lo2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

.field public final synthetic d:Lcom/friday/document/adapter/DocumentAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/d;->c:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    iput-object p2, p0, Lo2/d;->d:Lcom/friday/document/adapter/DocumentAdapter;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/d;->c:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    iget-object v1, p0, Lo2/d;->d:Lcom/friday/document/adapter/DocumentAdapter;

    invoke-static {v0, v1, p1}, Lcom/friday/document/adapter/DocumentAdapter;->d(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
