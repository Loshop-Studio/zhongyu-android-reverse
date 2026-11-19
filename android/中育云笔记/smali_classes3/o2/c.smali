.class public final synthetic Lo2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/adapter/DocumentAdapter;

.field public final synthetic d:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/c;->c:Lcom/friday/document/adapter/DocumentAdapter;

    iput-object p2, p0, Lo2/c;->d:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/c;->c:Lcom/friday/document/adapter/DocumentAdapter;

    iget-object v1, p0, Lo2/c;->d:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    invoke-static {v0, v1, p1}, Lcom/friday/document/adapter/DocumentAdapter;->f(Lcom/friday/document/adapter/DocumentAdapter;Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Landroid/view/View;)V

    return-void
.end method
