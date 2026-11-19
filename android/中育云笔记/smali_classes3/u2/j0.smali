.class public final synthetic Lu2/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/RecycleBinPreviewFragment;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/j0;->c:Lcom/friday/document/view/RecycleBinPreviewFragment;

    iput-boolean p2, p0, Lu2/j0;->d:Z

    iput-object p3, p0, Lu2/j0;->e:Ljava/lang/String;

    iput-object p4, p0, Lu2/j0;->f:Ljava/lang/String;

    iput-object p5, p0, Lu2/j0;->g:Ljava/lang/String;

    iput-object p6, p0, Lu2/j0;->h:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lu2/j0;->c:Lcom/friday/document/view/RecycleBinPreviewFragment;

    iget-boolean v1, p0, Lu2/j0;->d:Z

    iget-object v2, p0, Lu2/j0;->e:Ljava/lang/String;

    iget-object v3, p0, Lu2/j0;->f:Ljava/lang/String;

    iget-object v4, p0, Lu2/j0;->g:Ljava/lang/String;

    iget-object v5, p0, Lu2/j0;->h:Lcom/friday/common/entity/FileEntity;

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lcom/friday/document/view/RecycleBinPreviewFragment;->w(Lcom/friday/document/view/RecycleBinPreviewFragment;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method
