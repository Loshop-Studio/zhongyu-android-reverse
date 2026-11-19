.class public Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/luck/picture/lib/thread/PictureThreadUtils$e;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;->d:Lcom/luck/picture/lib/thread/PictureThreadUtils$e;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;->c:Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;->d:Lcom/luck/picture/lib/thread/PictureThreadUtils$e;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->i(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
