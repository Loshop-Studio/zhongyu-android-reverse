.class final Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/utils/AudioUtils;->audioCut(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic $cacheFile:Ljava/io/File;

.field final synthetic $srcFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;->$cacheFile:Ljava/io/File;

    iput-object p2, p0, Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;->$srcFile:Ljava/io/File;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;->invoke(Z)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;->$cacheFile:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;->$cacheFile:Ljava/io/File;

    iget-object v0, p0, Lcom/zykj/blackboard/utils/AudioUtils$audioCut$1;->$srcFile:Ljava/io/File;

    invoke-virtual {p1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    return-void
.end method
