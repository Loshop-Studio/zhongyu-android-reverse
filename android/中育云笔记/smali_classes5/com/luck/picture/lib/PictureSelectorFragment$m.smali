.class public Lcom/luck/picture/lib/PictureSelectorFragment$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->Y1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/PictureSelectorFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$m;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$m;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->V0(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lu6/a;->l()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$m;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->g1(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$m;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/luck/picture/lib/PictureSelectorFragment;->q1(Lcom/luck/picture/lib/PictureSelectorFragment;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
