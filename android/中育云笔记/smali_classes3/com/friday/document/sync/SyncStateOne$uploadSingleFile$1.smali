.class final Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->E(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.sync.SyncStateOne"
    f = "SyncStateOne.kt"
    l = {
        0x23a,
        0x248,
        0x258,
        0x262,
        0x269
    }
    m = "uploadSingleFile"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:I

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lcom/friday/document/sync/SyncStateOne;

.field public q:I


# direct methods
.method public constructor <init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->p:Lcom/friday/document/sync/SyncStateOne;

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

    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->o:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    iget-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->p:Lcom/friday/document/sync/SyncStateOne;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/friday/document/sync/SyncStateOne;->j(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
