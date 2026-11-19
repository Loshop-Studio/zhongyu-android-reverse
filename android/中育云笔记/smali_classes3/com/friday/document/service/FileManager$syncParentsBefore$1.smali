.class final Lcom/friday/document/service/FileManager$syncParentsBefore$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->F(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.service.FileManager"
    f = "FileManager.kt"
    l = {
        0xc6,
        0xc8,
        0xd5
    }
    m = "syncParentsBefore"
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

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lcom/friday/document/service/FileManager;

.field public n:I


# direct methods
.method public constructor <init>(Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->m:Lcom/friday/document/service/FileManager;

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

    iput-object p1, p0, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->l:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    iget-object p1, p0, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->m:Lcom/friday/document/service/FileManager;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/friday/document/service/FileManager;->n(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
