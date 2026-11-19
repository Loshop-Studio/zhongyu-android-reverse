.class final Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/repositroy/FileRepository;->e(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.repositroy.FileRepository"
    f = "FileRepository.kt"
    l = {
        0x3d,
        0x41
    }
    m = "collectNoteFiles"
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

.field public n:I

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lcom/friday/document/repositroy/FileRepository;

.field public r:I


# direct methods
.method public constructor <init>(Lcom/friday/document/repositroy/FileRepository;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->q:Lcom/friday/document/repositroy/FileRepository;

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

    iput-object p1, p0, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->p:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->r:I

    iget-object v0, p0, Lcom/friday/document/repositroy/FileRepository$collectNoteFiles$1;->q:Lcom/friday/document/repositroy/FileRepository;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lcom/friday/document/repositroy/FileRepository;->a(Lcom/friday/document/repositroy/FileRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
