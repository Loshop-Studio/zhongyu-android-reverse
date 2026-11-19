.class public Lcom/luck/picture/lib/basic/PictureCommonFragment$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/luck/picture/lib/dialog/PhotoItemSelectedDialog$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/basic/PictureCommonFragment;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/basic/PictureCommonFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/basic/PictureCommonFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$h;->a:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(ZLandroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/luck/picture/lib/basic/PictureCommonFragment$h;->a:Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/luck/picture/lib/basic/PictureCommonFragment;->g:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->p0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
