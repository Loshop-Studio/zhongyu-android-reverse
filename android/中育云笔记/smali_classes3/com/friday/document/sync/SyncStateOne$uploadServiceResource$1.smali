.class final Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->B(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.sync.SyncStateOne"
    f = "SyncStateOne.kt"
    l = {
        0x284,
        0x288,
        0x297,
        0x2a4,
        0x2ad,
        0x2d6,
        0x2dd
    }
    m = "uploadServiceResource"
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

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:I

.field public s:I

.field public t:I

.field public u:Z

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lcom/friday/document/sync/SyncStateOne;

.field public x:I


# direct methods
.method public constructor <init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->w:Lcom/friday/document/sync/SyncStateOne;

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

    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->v:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    iget-object p1, p0, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->w:Lcom/friday/document/sync/SyncStateOne;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/friday/document/sync/SyncStateOne;->i(Lcom/friday/document/sync/SyncStateOne;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
