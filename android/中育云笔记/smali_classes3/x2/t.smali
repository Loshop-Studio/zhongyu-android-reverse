.class public final synthetic Lx2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareSearchAdapter;

.field public final synthetic d:Lcom/friday/document/model/ShareFile;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareSearchAdapter;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/t;->c:Lcom/friday/document/view/share/ShareSearchAdapter;

    iput-object p2, p0, Lx2/t;->d:Lcom/friday/document/model/ShareFile;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/t;->c:Lcom/friday/document/view/share/ShareSearchAdapter;

    iget-object v1, p0, Lx2/t;->d:Lcom/friday/document/model/ShareFile;

    invoke-static {v0, v1, p1}, Lcom/friday/document/view/share/ShareSearchAdapter;->a(Lcom/friday/document/view/share/ShareSearchAdapter;Lcom/friday/document/model/ShareFile;Landroid/view/View;)V

    return-void
.end method
