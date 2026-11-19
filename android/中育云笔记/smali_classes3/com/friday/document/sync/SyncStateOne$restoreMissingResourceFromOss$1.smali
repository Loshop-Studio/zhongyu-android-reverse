.class final Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->w(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.sync.SyncStateOne"
    f = "SyncStateOne.kt"
    l = {
        0x217,
        0x21a
    }
    m = "restoreMissingResourceFromOss"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Z

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/friday/document/sync/SyncStateOne;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->g:Lcom/friday/document/sync/SyncStateOne;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    iget-object p1, p0, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->g:Lcom/friday/document/sync/SyncStateOne;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/friday/document/sync/SyncStateOne;->e(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
