.class public final synthetic Lu2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/RecycleBinPreviewFragment;

.field public final synthetic d:Z

.field public final synthetic e:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/i0;->c:Lcom/friday/document/view/RecycleBinPreviewFragment;

    iput-boolean p2, p0, Lu2/i0;->d:Z

    iput-object p3, p0, Lu2/i0;->e:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/i0;->c:Lcom/friday/document/view/RecycleBinPreviewFragment;

    iget-boolean v1, p0, Lu2/i0;->d:Z

    iget-object v2, p0, Lu2/i0;->e:Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/document/view/RecycleBinPreviewFragment;->v(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method
