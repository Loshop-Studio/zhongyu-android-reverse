.class final Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/dao/ResourceDao;->K(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.dao.ResourceDao"
    f = "ResourceDao.kt"
    l = {
        0x84
    }
    m = "updatePageOrder$suspendImpl"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:J

.field public k:I

.field public l:I

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lcom/friday/common/dao/ResourceDao;

.field public p:I


# direct methods
.method public constructor <init>(Lcom/friday/common/dao/ResourceDao;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->o:Lcom/friday/common/dao/ResourceDao;

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

    iput-object p1, p0, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->n:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->p:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->p:I

    iget-object v0, p0, Lcom/friday/common/dao/ResourceDao$updatePageOrder$1;->o:Lcom/friday/common/dao/ResourceDao;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao;->K(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
