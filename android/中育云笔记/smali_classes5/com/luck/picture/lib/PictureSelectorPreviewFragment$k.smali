.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p2(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iput p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;->c:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;->d:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 4
    .line 5
    iget v1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$k;->c:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->m(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
