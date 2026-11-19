.class final Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/sync/SyncStateOne;->F(Lcom/friday/common/entity/FileEntity;Ljava/io/File;ILjava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.sync.SyncStateOne"
    f = "SyncStateOne.kt"
    l = {
        0xad,
        0xaf,
        0xc1,
        0xc2
    }
    m = "upsertNewNoteResource"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcom/friday/document/sync/SyncStateOne;

.field public m:I


# direct methods
.method public constructor <init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->l:Lcom/friday/document/sync/SyncStateOne;

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
    .locals 7

    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->k:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    iget-object v0, p0, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->l:Lcom/friday/document/sync/SyncStateOne;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lcom/friday/document/sync/SyncStateOne;->k(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Ljava/io/File;ILjava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
