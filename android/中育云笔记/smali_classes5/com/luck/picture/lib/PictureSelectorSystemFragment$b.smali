.class public Lcom/luck/picture/lib/PictureSelectorSystemFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorSystemFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDenied()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 2
    .line 3
    sget-object v1, Lw6/b;->b:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->Y([Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onGranted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorSystemFragment$b;->a:Lcom/luck/picture/lib/PictureSelectorSystemFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorSystemFragment;->U0(Lcom/luck/picture/lib/PictureSelectorSystemFragment;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
