.class public Lcom/luck/picture/lib/PictureSelectorFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->m2()V
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
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$d;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

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
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$d;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$d;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->s1(Lcom/luck/picture/lib/PictureSelectorFragment;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$d;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/luck/picture/lib/PictureSelectorFragment;->G1(Lcom/luck/picture/lib/PictureSelectorFragment;)Lcom/luck/picture/lib/widget/RecyclerPreloadView;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$d;->c:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 23
    .line 24
    invoke-static {v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->s1(Lcom/luck/picture/lib/PictureSelectorFragment;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/widget/RecyclerPreloadView;->setLastVisiblePosition(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
