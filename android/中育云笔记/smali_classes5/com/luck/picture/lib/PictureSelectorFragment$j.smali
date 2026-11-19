.class public Lcom/luck/picture/lib/PictureSelectorFragment$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorFragment;->p2(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Lcom/luck/picture/lib/PictureSelectorFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$j;->d:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/PictureSelectorFragment$j;->c:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorFragment$j;->d:Lcom/luck/picture/lib/PictureSelectorFragment;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/PictureSelectorFragment$j;->c:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/luck/picture/lib/PictureSelectorFragment;->C1(Lcom/luck/picture/lib/PictureSelectorFragment;Ljava/util/ArrayList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
