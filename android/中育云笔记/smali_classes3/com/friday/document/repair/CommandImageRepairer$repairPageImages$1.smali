.class final Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/repair/CommandImageRepairer;->l(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.repair.CommandImageRepairer"
    f = "CommandImageRepairer.kt"
    l = {
        0x7c,
        0x9c,
        0xa4
    }
    m = "repairPageImages"
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

.field public r:Ljava/lang/Object;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lcom/friday/document/repair/CommandImageRepairer;

.field public v:I


# direct methods
.method public constructor <init>(Lcom/friday/document/repair/CommandImageRepairer;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->u:Lcom/friday/document/repair/CommandImageRepairer;

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
    .locals 6

    iput-object p1, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->t:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    iget-object v0, p0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->u:Lcom/friday/document/repair/CommandImageRepairer;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/friday/document/repair/CommandImageRepairer;->c(Lcom/friday/document/repair/CommandImageRepairer;Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
