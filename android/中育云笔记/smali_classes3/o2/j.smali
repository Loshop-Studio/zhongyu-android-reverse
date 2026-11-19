.class public final synthetic Lo2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/adapter/ShareFileAdapter;

.field public final synthetic d:Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/j;->c:Lcom/friday/document/adapter/ShareFileAdapter;

    iput-object p2, p0, Lo2/j;->d:Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/j;->c:Lcom/friday/document/adapter/ShareFileAdapter;

    iget-object v1, p0, Lo2/j;->d:Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;

    invoke-static {v0, v1, p1}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->a(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;Landroid/view/View;)V

    return-void
.end method
