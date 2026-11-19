.class final Lcom/friday/common/dao/FileDao$insertFileList$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/FileDao;->h(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.dao.FileDao"
    f = "FileDao.kt"
    l = {
        0x18
    }
    m = "insertFileList$suspendImpl"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:I

.field public j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcom/friday/common/dao/FileDao;

.field public m:I


# direct methods
.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/dao/FileDao$insertFileList$1;->l:Lcom/friday/common/dao/FileDao;

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

    iput-object p1, p0, Lcom/friday/common/dao/FileDao$insertFileList$1;->k:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/common/dao/FileDao$insertFileList$1;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/common/dao/FileDao$insertFileList$1;->m:I

    iget-object p1, p0, Lcom/friday/common/dao/FileDao$insertFileList$1;->l:Lcom/friday/common/dao/FileDao;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/friday/common/dao/FileDao;->h(Lcom/friday/common/dao/FileDao;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
