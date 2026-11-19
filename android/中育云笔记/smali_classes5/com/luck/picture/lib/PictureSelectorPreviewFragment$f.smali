.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->q2(Lcom/luck/picture/lib/entity/LocalMedia;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$f;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$f;->c:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 4
    .line 5
    iget v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->t:I

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;->i(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
